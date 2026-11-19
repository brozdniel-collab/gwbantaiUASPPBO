package quiz.pbo.tempat.KODE;

/* ~~ Model class representing a student, using encapsulation ~~ */
public class Mahasiswa {

    /* ~~ Primary key of the student ~~ */
    private String nim;
    /* ~~ Full name of the student ~~ */
    private String nama;
    /* ~~ Email address of the student ~~ */
    private String email;
    /* ~~ Age of the student ~~ */
    private int umur;

    /* ~~ Constructor that initializes all fields ~~ */
    public Mahasiswa(String nim, String nama, String email, int umur) {
        this.nim = nim;
        this.nama = nama;
        this.email = email;
        this.umur = umur;
    }

    /* ~~ Getter for nim ~~ */
    public String getNim() {
        return nim;
    }

    /* ~~ Setter for nim ~~ */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /* ~~ Getter for nama ~~ */
    public String getNama() {
        return nama;
    }

    /* ~~ Setter for nama ~~ */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* ~~ Getter for email ~~ */
    public String getEmail() {
        return email;
    }

    /* ~~ Setter for email ~~ */
    public void setEmail(String email) {
        this.email = email;
    }

    /* ~~ Getter for umur ~~ */
    public int getUmur() {
        return umur;
    }

    /* ~~ Setter for umur ~~ */
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
