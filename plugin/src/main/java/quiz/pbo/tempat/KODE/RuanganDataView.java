package quiz.pbo.tempat.KODE;

/* ~~ Concrete view that manages Ruangan records by extending the generic DataView ~~ */
public class RuanganDataView extends DataView<Ruangan> {

    /* ~~ Returns the id as the primary key ~~ */
    @Override
    protected String getPrimaryKeyValue(Ruangan data) {
        return data.getId();
    }

    /* ~~ Returns the column names of Ruangan ~~ */
    @Override
    protected String[] getFields() {
        return new String[]{"id", "nama", "lokasiLantai", "kapasitas"};
    }

    /* ~~ Builds a Ruangan from the raw input values ~~ */
    @Override
    protected Ruangan convertValuesToModel(String[] values) {
        return new Ruangan(values[0], values[1], Integer.parseInt(values[2]), Integer.parseInt(values[3]));
    }

    /* ~~ Converts a Ruangan into an array of strings for printing ~~ */
    @Override
    protected String[] convertModelToValues(Ruangan data) {
        return new String[]{data.getId(), data.getNama(), String.valueOf(data.getLokasiLantai()), String.valueOf(data.getKapasitas())};
    }
}
