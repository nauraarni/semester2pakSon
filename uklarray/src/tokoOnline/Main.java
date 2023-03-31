package tokoOnline;
public class Main {
    public static void main(String[] args) {
        Barang barang = new Barang();
        Karyawan kw = new Karyawan();
        Member mem = new Member();
        Laporan lap = new Laporan();
        Transaksi ts = new Transaksi();
        
        lap.laporan(mem);
        lap.laporan(barang);
        lap.laporan(ts, barang);
    }
}
