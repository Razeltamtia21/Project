import java.util.Scanner;
//Razel Michelle Dude Nagara
public class max_min{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai X: ");
        int x = input.nextInt();

        System.out.print("Masukkan nilai Y: ");
        int y = input.nextInt();

        System.out.println("Nilai Max: " + Math.max(x, y));
        System.out.println("Nilai Min: " + Math.min(x, y));
    }
}