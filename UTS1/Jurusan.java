package UTS1;

public class Jurusan {
    private String nama;
    private Laboratorium[] daftarLab;
    private Dosen kajur;
    private String catatan = ""; 

    public Jurusan(String nama, int jumlahLab, int kapasitasLab) {
        this.nama = nama;
        this.daftarLab = new Laboratorium[Math.max(jumlahLab, 0)];
        for (int i = 0; i < daftarLab.length; i++) {
            daftarLab[i] = new Laboratorium("LAB-" + (i + 1), kapasitasLab);
        }
    }

    public void setKajur(Dosen kajur) { this.kajur = kajur; }

    private void catat(String pesan) { catatan += pesan + "\n"; }

    public void daftarPraktikum(Mahasiswa m) {
        if (m == null) {
            catat("Mahasiswa tidak valid.");
            return;
        }
        for (Laboratorium lab : daftarLab) {
            if (lab.tambahPeserta(m)) return;
        }
        catat("Semua lab penuh, " + m.getNama() + " tidak dapat didaftarkan.");
    }

    public void daftarPraktikum(Mahasiswa m, int nomorLab) {
        if (m == null) {
            catat("Mahasiswa tidak valid.");
            return;
        }
        if (nomorLab < 1 || nomorLab > daftarLab.length) {
            catat("Nomor lab " + nomorLab + " tidak valid.");
            return;
        }
        Laboratorium lab = daftarLab[nomorLab - 1];
        if (!lab.tambahPeserta(m)) {
            catat(lab.getKode() + " penuh, " + m.getNama() + " tidak dapat didaftarkan.");
        }
    }

    public void tampilInfo() {
        System.out.print(catatan);
        for (Laboratorium lab : daftarLab) {
            lab.tampilPeserta();
        }
    }
}

