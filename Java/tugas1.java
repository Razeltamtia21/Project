//Razel Michelle Dude Nagara
public class tugas1{
    public static void main(String[] args){

        //tugas 1 rpl
        int[] nilai = {5,2,7,9,6};

        System.out.println("\nSebelum: ");
        for(int q = 0; q <= 4; q++){
            System.out.print(" " + nilai[q]);
        }

        System.out.println("\nSesudah: ");
        for(int i = nilai.length -1; i >= 0;  i--){
            System.out.print(" " + nilai[i]);
        }
    }
}