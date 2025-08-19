import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Usia Anda");
        int usia = input.nextInt();

        if(usia >= 5 && usia <= 9)
        System.out.println("Anak-Anak");
        else if(usia >= 10 && usia <= 18)
        System.out.println("Anda Remaja");
        else if(usia >= 19 && usia <= 59)
        System.out.println("Anda Dewasa");
        else {
            System.out.println("Anda tidak termasuk kategori usia yang ditentukan");
        }


    }
}
