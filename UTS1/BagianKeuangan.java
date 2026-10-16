package UTS1;

public class BagianKeuangan {
    private String nama;

    public BagianKeuangan(String nama) { this.nama = nama; }

    public void cetakTagihan(Mahasiswa m) {
        if (m == null) {
            System.out.println("Data mahasiswa tidak ada.");
            return;
        }
        Dosen wali = m.getDosenWali();
        String namaWali = (wali != null) ? wali.getNama() : "-";
        System.out.println("Tagihan UKT " + m.getNama() + " (" + m.getJenis() + ")"
                + " - Wali: " + namaWali + " : " + m.hitungUKT());
    }
}

