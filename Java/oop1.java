class username{
    String nama;
    int usia;
    username(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }
}

public class oop1{
    public static void main(String[] args){
        username user1 = new username("razel", 18);
        username user2 = new username("davarel", 17);
        System.out.println(user1);
        System.out.println("Nama anda: " + user1.nama + ", usia anda " + user1.usia + " tahun\n ");
        System.out.println(user2);
        System.out.println("Nama anda: " + user2.nama + ", usia anda " + user2.usia + " tahun");
    }
}