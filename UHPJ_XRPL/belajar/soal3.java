import java.util.Scanner;
public class soal3{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Masukkan nilai: ");
int nilai = input.nextInt();

if(isPrime(nilai)){
	System.out.println(nilai + " adalah bilangan prima.");
}else{
	System.out.println(nilai + " bukan bilangan prima.");
}input.close();

}

public static boolean isPrime(int nilai){

if(nilai < 2){
	return false;
}
for(int i = 2; i <= Math.sqrt(nilai); i++){
	if(nilai % i == 0){
	return false;
}
}
return true;
}
}