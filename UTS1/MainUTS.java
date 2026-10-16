package UTS1;

public class MainUTS {
    public static void main(String[] args) {
        Jurusan ti = new Jurusan("Teknologi Informasi", 2, 2);
        ti.setKajur(new Dosen("D001", "Pak Imam"));

        Dosen buVivi = new Dosen("D002", "Bu Vivi");

        Mahasiswa lestari = new MahasiswaReguler("2341720001", "Lestari", 20);
        Mahasiswa usman = new MahasiswaBeasiswa("2341720002", "Usman", 24, 50);
        Mahasiswa anugrah = new MahasiswaReguler("2341720003", "Anugrah", 22);
        lestari.setDosenWali(buVivi);
        usman.setDosenWali(buVivi);
        anugrah.setDosenWali(buVivi);

        ti.daftarPraktikum(lestari);
        ti.daftarPraktikum(usman);
        ti.daftarPraktikum(anugrah, 1); 
        ti.daftarPraktikum(anugrah);

        BagianKeuangan keu = new BagianKeuangan("Bagian Keuangan");
        keu.cetakTagihan(lestari);
        keu.cetakTagihan(usman);
        keu.cetakTagihan(anugrah);
        ti.tampilInfo();

        System.out.println();
        
        Mahasiswa m = new MahasiswaBeasiswa("2341720099", "Mentari", 20, 25);
        System.out.println("UKT Mentari: " + m.hitungUKT());
    }
}

