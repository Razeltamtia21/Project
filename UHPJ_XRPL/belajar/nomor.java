import java.util.Scanner;
public class nomor{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Masukkan jumlah array: ");
	int nilai = input.nextInt();

	int array = new[nilai];

	for(int i = 0; i < nilai; i++){
	System.out.println("Masukkan nilai ke " + (i+1));
	array = input.nextInt();	
	}
	}
}