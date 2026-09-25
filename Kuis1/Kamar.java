package Kuis1;

public class Kamar {

    private String tipe;
    private int tarif;

    public Kamar() {
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public int getTarif() {
        return tarif;
    }

    public int hitungBiayaKamar(int hari) {
        return tarif * hari;
    }
}

