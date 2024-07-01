//Razel Michelle Dude Nagara
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        //tugas 3 rpl
        System.out.print("Masukkan jumlah array: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.print("Nilai bilangan terbesar: ");
        int max = nilai[0];
        for(int i = 0; i < jumlah; i++){
            if(nilai[i] > max){
                max = nilai[i];
            }
        }
        System.out.print(max);

        System.out.print("\nNilai bilangan terkecil: ");
        int min = nilai[0];
        for(int i = 0; i < jumlah; i++){
            if(nilai[i] < min){
                min = nilai[i];
            }
        }
        System.out.print(min);
    }
}