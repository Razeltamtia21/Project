import java.util.Scanner;
//Razel Michelle Dude Nagara
public class mtk{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan nilai pertama: ");
        int pertama = input.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int kedua = input.nextInt();

        System.out.println("\n[1] Pertambahan");
        System.out.println("[2] Pengurangan");
        System.out.println("[3] Perkalian");
        System.out.println("[4] Pembagian");

        System.out.print("\nPililah sesuai anda inginkan: ");
        int pilihan = input.nextInt();

        if(pilihan == 1){
            System.out.println(pertama + " + " + kedua + " = " + (pertama + kedua));
        }
        else if(pilihan == 2){
            System.out.println(pertama + " - " + kedua + " = " + (pertama - kedua));
        }
        else if(pilihan == 3){
            System.out.println(pertama + " * " + kedua + " = " + (pertama * kedua));
        }
        else if(pilihan == 4){
            System.out.println(pertama + " / " + kedua + " = " + (pertama / kedua));
        }
        else{
            System.out.println("\n[erorr]Pilihan tidak tersedia");
        }
        input.close();
    }
}
