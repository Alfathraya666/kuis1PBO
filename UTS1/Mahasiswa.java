package UTS1;

public class Mahasiswa {
    protected static final int TARIF_PER_SKS = 150000;
    protected static final int BIAYA_PRAKTIKUM = 500000;

    protected String nim;
    protected String nama;
    protected int sks;
    private Dosen dosenWali;

    public Mahasiswa(String nim, String nama, int sks) {
        this.nim = nim;
        this.nama = nama;
        this.sks = Math.max(sks, 0); 
    }

    public void setDosenWali(Dosen dosenWali) { this.dosenWali = dosenWali; }
    public Dosen getDosenWali() { return dosenWali; }

    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public int getSks() { return sks; }

    public int hitungUKT() { return TARIF_PER_SKS * sks; }

    public String getJenis() { return "Mahasiswa"; }
}

