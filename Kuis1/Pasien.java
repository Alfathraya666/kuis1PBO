package Kuis1;

public class Pasien {
    private String nama;
    private Dokter dokter;   
    private Kamar kamar;     
    private int lamaInap;

    public Pasien() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public void setLamaInap(int lamaInap) {
        this.lamaInap = lamaInap;
    }

    public int getLamaInap() {
        return lamaInap;
    }

    public int hitungBiayaTotal() {
        int biayaVisit = dokter.hitungBiayaVisit(lamaInap);
        int biayaKamar = kamar.hitungBiayaKamar(lamaInap);
        int total = biayaVisit + biayaKamar;

        if (lamaInap > 5) {
            total = total - (total * 10 / 100); 
        }
        return total;
    }

    public void cetakTagihan() {
        if (this.dokter == null || this.kamar == null) {
            System.out.println("Data rawat inap belum lengkap");
            return;
        }

        int total = hitungBiayaTotal();
        System.out.println("Pasien    : " + nama);
        System.out.println("Dokter    : " + dokter.getNama());
        System.out.println("Kamar     : " + kamar.getTipe());
        System.out.println("Lama Inap : " + lamaInap + " hari");
        System.out.println("Total     : " + total);
    }
}