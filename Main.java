import java.util.Scanner;

public class Main {
<<<<<<< HEAD
    public static float penjumlahan(float nilai_1, float nilai_2) {
        return nilai_1 + nilai_2;
    }

    public static float perkalian(float nilai_1, float nilai_2) {
        return nilai_1 * nilai_2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-----Kalkulator-----");
=======

    public static float penjumlahan(float nilai_1, float nilai_2) {
        return nilai_1 + nilai_2;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int menu;

        do{
            System.out.println("=======Kalkulator=======");
>>>>>>> 97b398e15d09edfd200c61cf14ac3a5179943fd1
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
<<<<<<< HEAD
            System.out.println("Silahkan masukkan pilihan anda:");

            choice = scan.nextInt();

            switch (choice) {
=======
            System.out.println("Silahkan input menu pilihan anda:");

            menu = scan.nextInt();
            switch (menu) {
>>>>>>> 97b398e15d09edfd200c61cf14ac3a5179943fd1
                case 1:
                    System.out.println("Masukkan nilai ke-1: ");
                    float nilai_1 = scan.nextFloat();
                    System.out.println("Masukkan nilai ke-2: ");
                    float nilai_2 = scan.nextFloat();
                    float hasil_penjumlahan = penjumlahan(nilai_1, nilai_2);
                    System.out.println("Hasil penjumlahan adalah " + hasil_penjumlahan);
                    break;
<<<<<<< HEAD
                case 3:
                    System.out.println("Masukkan nilai ke-1: ");
                    float nilai_5 = scan.nextFloat();
                    System.out.println("Masukkan nilai ke-2: ");
                    float nilai_6 = scan.nextFloat();
                    float hasil_perkalian = perkalian(nilai_5, nilai_6);
                    System.out.println("Hasil perkalian adalah " + hasil_perkalian);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            } break;
        } while (true);
=======
            default:
                System.out.println("Silahkan input angka yang ada di dalam menu");
            }
        }while(true);
>>>>>>> 97b398e15d09edfd200c61cf14ac3a5179943fd1
    }
}
