import java.util.Scanner;

public class jamMasuk {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Jam Masuk");
        int masuk = input.nextInt();
         
        if(masuk > 6){
            System.out.println("anda Terlambat");
        }else{
            System.out.println("anda tepat waktu");
        }
    System.out.println("terimakasih");}

    }


