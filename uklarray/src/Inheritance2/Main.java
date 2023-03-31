package Inheritance2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nip;
        String nama;
        int jamKerja;
        String jabatan;
        String status;
        int gaji = 0;
        int potongan = 0;
        int bonus = 0;
        int tunjangan = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIP : ");
        nip = scan.nextInt();
        System.out.print("Masukkan Nama : ");
        nama = scan.next();
        System.out.print("Masukkan Jam Kerja : ");
        jamKerja = scan.nextInt();
        System.out.print("Masukkan Jabatan : ");
        jabatan = scan.next();
        System.out.print("Masukkan Status : ");
        status = scan.next();

        switch (jabatan) {
            case "Boss":
                gaji = 10000000;
                break;
            case "Manager":
                gaji = 8000000;
                break;
            case "CS":
                gaji = 5000000;
                break;
            case "Security":
                gaji = 5000000;
                break;
        }

        if (jamKerja < 8) {
            potongan = 100000 * (8 - jamKerja);
        } else if (jamKerja > 8) {
            bonus = 200000;
        } else {

        }

        switch (status) {
            case "Menikah":
                tunjangan = 2000000;
                break;
            case "Belum Menikah":
                tunjangan = 0;
        }
        switch (jabatan) {
            case "Boss":
                Boss bs = new Boss(nip, nama, jamKerja, jabatan, status, gaji, potongan, bonus, tunjangan);
                bs.info();
                break;
            case "Manager":
                Manager mn = new Manager(nip, nama, jamKerja, jabatan, status, gaji, potongan, bonus, tunjangan);
                mn.info();
                break;
            case "CS":
                CleaningService cs = new CleaningService(nip, nama, jamKerja, jabatan, status, gaji, potongan, bonus, tunjangan);
                cs.info();
                break;
            case "Security":
                Security sc = new Security(nip, nama, jamKerja, jabatan, status, gaji, potongan, bonus, tunjangan);
                sc.info();
                break;
        }

    }
}
