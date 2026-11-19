package quiz.pbo.tempat.KODE;

/* ~~ Concrete view that manages MataKuliah records by extending the generic DataView ~~ */
public class MataKuliahDataView extends DataView<MataKuliah> {

    /* ~~ Returns the kode as the primary key ~~ */
    @Override
    protected String getPrimaryKeyValue(MataKuliah data) {
        return data.getKode();
    }

    /* ~~ Returns the column names of MataKuliah ~~ */
    @Override
    protected String[] getFields() {
        return new String[]{"kode", "nama", "jumlahSks", "semester"};
    }

    /* ~~ Builds a MataKuliah from the raw input values ~~ */
    @Override
    protected MataKuliah convertValuesToModel(String[] values) {
        return new MataKuliah(values[0], values[1], Integer.parseInt(values[2]), Integer.parseInt(values[3]));
    }

    /* ~~ Converts a MataKuliah into an array of strings for printing ~~ */
    @Override
    protected String[] convertModelToValues(MataKuliah data) {
        return new String[]{data.getKode(), data.getNama(), String.valueOf(data.getJumlahSks()), String.valueOf(data.getSemester())};
    }
}
