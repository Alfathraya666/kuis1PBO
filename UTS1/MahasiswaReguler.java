package UTS1;

public class MahasiswaReguler extends Mahasiswa{

    public MahasiswaReguler(String nim, String nama, int sks) {
        super(nim, nama, sks);
    }

    @Override
    public int hitungUKT() {
        return super.hitungUKT() + BIAYA_PRAKTIKUM;
    }

    @Override
    public String getJenis() { return "Reguler"; }
}

