package Kuis1;

public class MainSoalA2 {
    public static void main(String[] args) {
        
        Dokter drHendra = new Dokter();
        drHendra.setNama("dr. Hendra");
        drHendra.setTarifVisit(150000);
        System.out.println();

        Kamar kamarVip = new Kamar();
        kamarVip.setTipe("VIP");
        kamarVip.setTarif(750000);
        System.out.println();

        Pasien rina = new Pasien();
        rina.setNama("Rina");
        rina.setDokter(drHendra);
        rina.setKamar(kamarVip);
        rina.setLamaInap(3);
        rina.cetakTagihan();
        System.out.println();

        Pasien bagus = new Pasien();
        bagus.setNama("Bagus");
        bagus.setDokter(drHendra);
        bagus.setKamar(kamarVip);
        bagus.setLamaInap(6);
        bagus.cetakTagihan();
        System.out.println();

        Pasien tono = new Pasien();
        tono.setNama("Tono");
        tono.setLamaInap(2);
        tono.cetakTagihan();
    }
}

