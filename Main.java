import java.util.Scanner;

public class Main {

    public static float penjumlahan(float nilai_1, float nilai_2) {
        return nilai_1 + nilai_2;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int menu;

        do{
            System.out.println("=======Kalkulator=======");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.println("Silahkan input menu pilihan anda:");

            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Masukkan nilai ke-1: ");
                    float nilai_1 = scan.nextFloat();
                    System.out.println("Masukkan nilai ke-2: ");
                    float nilai_2 = scan.nextFloat();
                    float hasil_penjumlahan = penjumlahan(nilai_1, nilai_2);
                    System.out.println("Hasil penjumlahan adalah " + hasil_penjumlahan);
                    break;
            default:
                System.out.println("Silahkan input angka yang ada di dalam menu");
            }
        }while(true);
    }
}
