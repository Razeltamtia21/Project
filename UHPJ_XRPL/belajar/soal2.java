import java.util.Scanner;
public class soal2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Masukkan nilai yang ingin di faktorial: ");
int nilai = input.nextInt();

if(nilai < 0){
	System.out.println("Faktorial hanya bisa nilai positif..");
}else{
int faktorial = 1;
for(int i = 1; i <= nilai; i++){
	System.out.println( i + "!. " + (faktorial *= i));
}
}
}
}