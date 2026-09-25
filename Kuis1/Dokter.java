package Kuis1;

public class Dokter {

    private String nama;
    private int tarifVisit;

    public Dokter() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTarifVisit(int tarifVisit) {
        this.tarifVisit = tarifVisit;
    }

    public int getTarifVisit() {
        return tarifVisit;
    }

    public int hitungBiayaVisit(int hari) {
        return tarifVisit * hari;
    }
}