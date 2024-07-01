public class latihan{
	public static void main(String[] args){
	
	int[] nilai = {3,4,5,9,8};

	System.out.println("Before");
	for(int i = 0; i < nilai.length; i++){
	System.out.print(nilai[i] + " ");
	}
	System.out.println("\nAfter");
	for(int i = nilai.length -1; i >= 0; i--){
	System.out.print(nilai[i] + " ");
	}
	}	
}