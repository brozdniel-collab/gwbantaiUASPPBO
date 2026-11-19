package quiz.pbo.tempat.KODE;

/* ~~ Concrete view that manages Mahasiswa records by extending the generic DataView ~~ */
public class MahasiswaDataView extends DataView<Mahasiswa> {

    /* ~~ Returns the nim as the primary key ~~ */
    @Override
    protected String getPrimaryKeyValue(Mahasiswa data) {
        return data.getNim();
    }

    /* ~~ Returns the column names of Mahasiswa ~~ */
    @Override
    protected String[] getFields() {
        return new String[]{"nim", "nama", "email", "umur"};
    }

    /* ~~ Builds a Mahasiswa from the raw input values ~~ */
    @Override
    protected Mahasiswa convertValuesToModel(String[] values) {
        return new Mahasiswa(values[0], values[1], values[2], Integer.parseInt(values[3]));
    }

    /* ~~ Converts a Mahasiswa into an array of strings for printing ~~ */
    @Override
    protected String[] convertModelToValues(Mahasiswa data) {
        return new String[]{data.getNim(), data.getNama(), data.getEmail(), String.valueOf(data.getUmur())};
    }
}
