package quiz.pbo.tempat.model;

import java.util.ArrayList;
import java.util.List;

abstract public class DataView<T> {
    List<T> isi = new ArrayList<>();

    public void printAll(){
        String[] fields = this.getFields();
        for(int  i = 0 ; i < this.isi.size() ; i++){
            T data = this.isi.get(i);
            String []values = convertModelToValues(data);
            for(int j = 0 ; j < fields.length ; j++){
                System.out.println(fields[j] + "="+ values[j]);
            }
        }
    }
    public void printByPk(String prim){
        String [] fields = this.getFields();
        for(int i = 0 ; i < this.isi.size() ; i++){
            T data = this.isi.get(i);
            if(this.getPrimaryKeyValue(data).equals(prim)){
                String [] value = convertModelToValues(data);
                for(int  j= 0 ; j < fields.length ; j++){
                    System.out.println(fields[j] + "=" +value[j]);
                }
            }
        }  
    }
    public void showInsertForm(){
        String [] field = this.getFields();
        String values[] = new String[field.length];
        for(int i  = 0 ; i < field.length ; i++){
            
        }
    }
    protected abstract String getPrimaryKeyValue(T data);
    protected abstract String [] getFields();
    protected abstract T convertValuesToModel(String[]values);
    protected abstract String[] convertModelToValues(T data);

}
