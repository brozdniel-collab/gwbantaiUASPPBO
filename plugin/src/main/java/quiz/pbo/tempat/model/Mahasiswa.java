package quiz.pbo.tempat.model;

public class Mahasiswa {
    String nim;
    String nama;
    String email;
    int umur;

    public Mahasiswa(String email, String nama, String nim, int umur) {
        this.email = email;
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    public String getNim() {
        
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
