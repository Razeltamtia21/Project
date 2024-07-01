class segitiga{
    int alas = 15;
    int tinggi = 10;
    int luas = alas * tinggi / 2;

    segitiga(int alas, int tinggi, int luas){
        this.alas = alas;
        this.tinggi = tinggi;
        this.luas = luas;
    }
}

public class oop2{
    public static void main(String[] args){
        segitiga s = new segitiga(15, 10, 75);
        System.out.println("Luas segitiga alas 15 dan tinggi 10: " + s.luas);

    }
}