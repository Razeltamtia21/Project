import java.util.Scanner;
public class males{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah array: ");
        int nilai = input.nextInt();

        int[] array = new int[nilai];

    for(int i = 0; i < nilai; i++){
        System.out.print("Masukkan nilai ke " + (i+1) + "- ");
        array[i] = input.nextInt();
    }
    System.out.println("Nilai array: ");
    for(int i = 0; i < nilai; i++){
        System.out.print(array[i] + " ");
    }
    System.out.println();
    boolean selesai = false;
    while(!selesai){
        System.out.print("Apakah anda ingin mengubah data? (ya/tidak): ");
        String jawaban = input.next();
        if(jawaban.equalsIgnoreCase("tidak")){
            selesai = true;
        }else if(jawaban.equalsIgnoreCase("ya")){
            System.out.print("Masukkan urutan yang ingin diubah: ");
            int urutan = input.nextInt();
            if(urutan < 1 || urutan > nilai){
                System.out.println("Urutan tidak sesuai. Silakan coba lagi...");
                continue;
            }
            System.out.print("Masukkan nilai baru: ");
            int nilaiBaru = input.nextInt();
            array[urutan-1] = nilaiBaru;
            System.out.println("Nilai array: ");
            for(int i = 0; i < nilai; i++){
                System.out.print(array[i] + " ");
            }
    }else{
        System.out.println("Jawaban tidak sesuai. Silakan coba lagi...");
        }
        }
        input.close();
    }
}