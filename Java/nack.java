import java.util.Scanner;
public class nack{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Masukkan jumlah array: ");
	int jumlah = input.nextInt();

	int[] array = new int [jumlah];

	for(int i = 0 = i < jumlah; i++){
	System.out.print("Masukkan array ke -" + (i+1) + " ");	
	array[i].nextInt();
		}
	int max = array[0];
	for(int i = 0 = i < jumlah; i++){
	if(array[i] > max){
	max = array[i];
			}
		}
	System.out.println("Nilai terbesar: " + max);
	}
}