package quiz.pbo.tempat.KODE;

import java.util.ArrayList;
import java.util.List;

/* ~~ Abstract generic view that centralizes all CRUD operations for any model type T ~~ */
public abstract class DataView<T> {

    /* ~~ Storage for all records of this view ~~ */
    private List<T> records;

    /* ~~ Constructor that initializes the record list ~~ */
    public DataView() {
        this.records = new ArrayList<>();
    }

    /* ~~ Prints every record, one field per line, using getFields as the labels ~~ */
    public void printAll() {
        String[] fields = this.getFields();
        for (int i = 0; i < this.records.size(); i++) {
            String[] values = this.convertModelToValues(this.records.get(i));
            for (int j = 0; j < fields.length; j++) {
                System.out.println(fields[j] + ": " + values[j]);
            }
            System.out.println();
        }
        if (this.records.isEmpty()) {
            System.out.println("(no data)");
        }
    }

    /* ~~ Finds a record by its primary key and prints only that record ~~ */
    public void printByPk(String primaryKey) {
        String[] fields = this.getFields();
        for (int i = 0; i < this.records.size(); i++) {
            T data = this.records.get(i);
            if (this.getPrimaryKeyValue(data).equals(primaryKey)) {
                String[] values = this.convertModelToValues(data);
                for (int j = 0; j < fields.length; j++) {
                    System.out.println(fields[j] + ": " + values[j]);
                }
                return;
            }
        }
        System.out.println("Data with primary key '" + primaryKey + "' was not found.");
    }

    /* ~~ Asks the user for every field, builds a model and adds it to the list ~~ */
    public void showInsertForm() {
        String[] fields = this.getFields();
        String[] values = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
            values[i] = this.readInput();
        }
        try {
            this.records.add(this.convertValuesToModel(values));
            System.out.println("Data added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format, data was not added.");
        }
    }

    /* ~~ Asks for a primary key and replaces the matching record with new input ~~ */
    public void showUpdateForm() {
        System.out.println("Primary key of the data to update:");
        String primaryKey = this.readInput();
        for (int i = 0; i < this.records.size(); i++) {
            if (this.getPrimaryKeyValue(this.records.get(i)).equals(primaryKey)) {
                String[] fields = this.getFields();
                String[] values = new String[fields.length];
                for (int j = 0; j < fields.length; j++) {
                    System.out.println(fields[j]);
                    values[j] = this.readInput();
                }
                try {
                    this.records.set(i, this.convertValuesToModel(values));
                    System.out.println("Data updated successfully.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format, data was not updated.");
                }
                return;
            }
        }
        System.out.println("Data with primary key '" + primaryKey + "' was not found.");
    }

    /* ~~ Asks for a primary key and removes the matching record from the list ~~ */
    public void promptDelete() {
        System.out.println("Primary key of the data to delete:");
        String primaryKey = this.readInput();
        for (int i = 0; i < this.records.size(); i++) {
            if (this.getPrimaryKeyValue(this.records.get(i)).equals(primaryKey)) {
                this.records.remove(i);
                System.out.println("Data deleted successfully.");
                return;
            }
        }
        System.out.println("Data with primary key '" + primaryKey + "' was not found.");
    }

    /* ~~ Reads one line of input, treating end of input as an empty string ~~ */
    private String readInput() {
        String line = InputHelper.readLine();
        return line == null ? "" : line;
    }

    /* ~~ Returns the primary key value of the given data object ~~ */
    protected abstract String getPrimaryKeyValue(T data);

    /* ~~ Returns the column names of the model ~~ */
    protected abstract String[] getFields();

    /* ~~ Converts the input values into a model instance ~~ */
    protected abstract T convertValuesToModel(String[] values);

    /* ~~ Converts the model attributes into strings for printing ~~ */
    protected abstract String[] convertModelToValues(T data);
}
