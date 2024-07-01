import java.util.Scanner;
//Razel Michelle Dude Nagara
public class segi_panjang{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan Lebar: ");
        int lebar = input.nextInt();

        System.out.println("Luas Persegi Panjang: " + (panjang * lebar) + " cm");
    }
}