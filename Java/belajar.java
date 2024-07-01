import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
        String[] Prodi = new String[5];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < Prodi.length; i++) {
        System.out.println("Input ke " + i +": ");
        Prodi[i] = scan.nextLine();
        }
        System.out.println("");
        System.out.println("          DATA YANG ANDA INPUT");
        for(String b : Prodi) {
        System.out.println(b);
        }
    }
}