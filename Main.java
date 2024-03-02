import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;

        do{
            System.out.println("=======Kalkulator=======");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.println("Silahkan input menu pilihan anda:");

            menu = scanner.nextInt();
            if(menu == 1){

            }else if(menu == 2){

            }else if(menu == 3){

            }else if(menu == 4){

            }else if(menu == 5){

            }else{
                System.out.println("Silahkan input angka yang ada di dalam menu");
            }
        }while(true);
    }
}
