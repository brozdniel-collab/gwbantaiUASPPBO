package quiz.pbo.tempat.KODE;

/* ~~ Model class representing a course, using encapsulation ~~ */
public class MataKuliah {

    /* ~~ Primary key of the course ~~ */
    private String kode;
    /* ~~ Name of the course ~~ */
    private String nama;
    /* ~~ Credit weight of the course ~~ */
    private int jumlahSks;
    /* ~~ Semester in which the course is taken ~~ */
    private int semester;

    /* ~~ Constructor that initializes all fields ~~ */
    public MataKuliah(String kode, String nama, int jumlahSks, int semester) {
        this.kode = kode;
        this.nama = nama;
        this.jumlahSks = jumlahSks;
        this.semester = semester;
    }

    /* ~~ Getter for kode ~~ */
    public String getKode() {
        return kode;
    }

    /* ~~ Setter for kode ~~ */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /* ~~ Getter for nama ~~ */
    public String getNama() {
        return nama;
    }

    /* ~~ Setter for nama ~~ */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* ~~ Getter for jumlahSks ~~ */
    public int getJumlahSks() {
        return jumlahSks;
    }

    /* ~~ Setter for jumlahSks ~~ */
    public void setJumlahSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }

    /* ~~ Getter for semester ~~ */
    public int getSemester() {
        return semester;
    }

    /* ~~ Setter for semester ~~ */
    public void setSemester(int semester) {
        this.semester = semester;
    }
}
