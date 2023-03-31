
package Inheritance2;

public class Employee {
    private String nama;
    private int jamKerja;
    private String jabatan;
    private String status;
    private int gaji;
    private int potongan;
    private int bonus;
    private int tunjangan;
    
    public Employee(String nama, int jamKerja, String jabatan, String status, int gaji, int potongan, int bonus, int tunjangan){
        this.nama = nama;
        this.jamKerja = jamKerja;
        this.jabatan = jabatan;
        this.status = status;
        this.gaji = gaji;
        this.potongan = potongan;
        this.bonus = bonus;
        this.tunjangan = tunjangan;
    }
    
    public void info(){
        System.out.println("Nama : " +nama);
        System.out.println("Jam Kerja : " +jamKerja);
        System.out.println("Jabatan : " +jabatan);
        System.out.println("Status : " +status);
        System.out.println("Gaji : " +gaji);
        System.out.println("Potongan : " +potongan);
        System.out.println("Bonus : " +bonus);
        System.out.println("Tunjungan : " +tunjangan);
    }
}
