package UTS1;

public class Laboratorium {
    private String kode;
    private Mahasiswa[] peserta;
    private int jumlah;

    public Laboratorium(String kode, int kapasitas) {
        this.kode = kode;
        this.peserta = new Mahasiswa[Math.max(kapasitas, 0)];
        this.jumlah = 0;
    }

    public String getKode() { return kode; }

    public boolean isPenuh() { return jumlah >= peserta.length; }

    public boolean tambahPeserta(Mahasiswa m) {
        if (m == null || isPenuh()) return false;
        for (int i = 0; i < jumlah; i++) {
            if (peserta[i] == m ) return false;
        }    
        peserta[jumlah++] = m;
        return true;        
    }

    public void tampilPeserta() {
        StringBuilder sb = new StringBuilder(kode + ": ");
        if (jumlah == 0) sb.append("(belum ada peserta)");
         for (int i = 0; i < jumlah; i++) {
            if (i > 0) sb.append(", "); 
            sb.append(peserta[i].getNama());        
        }
        System.out.println(sb);
    }

}
