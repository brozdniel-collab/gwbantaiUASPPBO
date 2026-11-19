package quiz.pbo.tempat.KODE;

/* ~~ Model class representing a room, using encapsulation ~~ */
public class Ruangan {

    /* ~~ Primary key of the room ~~ */
    private String id;
    /* ~~ Name or code of the room ~~ */
    private String nama;
    /* ~~ Floor on which the room is located ~~ */
    private int lokasiLantai;
    /* ~~ Maximum capacity of the room ~~ */
    private int kapasitas;

    /* ~~ Constructor that initializes all fields ~~ */
    public Ruangan(String id, String nama, int lokasiLantai, int kapasitas) {
        this.id = id;
        this.nama = nama;
        this.lokasiLantai = lokasiLantai;
        this.kapasitas = kapasitas;
    }

    /* ~~ Getter for id ~~ */
    public String getId() {
        return id;
    }

    /* ~~ Setter for id ~~ */
    public void setId(String id) {
        this.id = id;
    }

    /* ~~ Getter for nama ~~ */
    public String getNama() {
        return nama;
    }

    /* ~~ Setter for nama ~~ */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* ~~ Getter for lokasiLantai ~~ */
    public int getLokasiLantai() {
        return lokasiLantai;
    }

    /* ~~ Setter for lokasiLantai ~~ */
    public void setLokasiLantai(int lokasiLantai) {
        this.lokasiLantai = lokasiLantai;
    }

    /* ~~ Getter for kapasitas ~~ */
    public int getKapasitas() {
        return kapasitas;
    }

    /* ~~ Setter for kapasitas ~~ */
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}
