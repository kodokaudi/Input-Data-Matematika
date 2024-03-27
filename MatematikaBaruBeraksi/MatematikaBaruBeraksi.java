package MatematikaBaruBeraksi;

import java.util.Scanner;

public class MatematikaBaruBeraksi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilihlah satu!");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");

        System.out.println("Pilihlah salah satu = ");
        int menu = scanner.nextInt();

        int angka1, angka2;
        System.out.print("Masukkan angka pertama = ");
        angka1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua = ");
        angka2 = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Hasil tambah dari " + angka1 + " dan " + angka2 + " adalah " + MatematikaBaru.tambah(angka1, angka2));
                break;
            case 2:
                System.out.println("Hasil kurang dari " + angka1 + " dan " + angka2 + " adalah " + MatematikaBaru.kurang(angka1, angka2));
                break;
            case 3:
                System.out.println("Hasil kali dari " + angka1 + " dan " + angka2 + " adalah " + MatematikaBaru.kali(angka1, angka2));
                break;
            case 4:
                System.out.println("Hasil bagi dari " + angka1 + " dan " + angka2 + " adalah " + MatematikaBaru.bagi(angka1, angka2));
                break;
            default:
                System.out.println("Error! Pilihan tidak ada!");
        }

        scanner.close();
    }
}
