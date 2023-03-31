
package Inheritance2;

public class Boss extends Employee {
    private int nip;
    
    public Boss(int nip, String nama, int jamKerja, String jabatan, String status, int gaji, int potongan, int bonus, int tunjangan){
        super(nama, jamKerja, jabatan, status, gaji, potongan, bonus, tunjangan);
        this.nip = nip;
    }
    
    public void info(){
        System.out.println("NIP : " +this.nip);
        super.info();
    }
}
