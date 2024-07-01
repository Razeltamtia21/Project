//Razel Michelle Dude Nagara
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        //tugas 2 rpl
        System.out.print("Masukkan jumlah array: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.println("Nilai genap: ");
        for(int i = 0; i < jumlah; i++){
            if(nilai[i] % 2 == 0){
                System.out.print(nilai[i] + " ");
            }
        }
        System.out.println("\nNilai ganjil: ");
        for(int i = 0; i < jumlah; i++){
            if(nilai[i] % 2!= 0){
                System.out.print(nilai[i] + " ");
            }
        }
    }
}
