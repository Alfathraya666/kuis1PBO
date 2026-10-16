package UTS1;

    public class MahasiswaBeasiswa extends Mahasiswa {
    private int persenBeasiswa;

    public MahasiswaBeasiswa(String nim, String nama, int sks, int persenBeasiswa) {
        super(nim, nama, sks);
        this.persenBeasiswa = Math.min(Math.max(persenBeasiswa, 0), 100); // guard 0..100
    }

    @Override
    public int hitungUKT() {
        int total = super.hitungUKT() + BIAYA_PRAKTIKUM;
        return total * (100 - persenBeasiswa) / 100;
    }

    @Override
    public String getJenis() { return "Beasiswa " + persenBeasiswa + "%"; }
}

