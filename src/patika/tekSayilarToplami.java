package patika;

import java.util.Scanner;

public class tekSayilarToplami {
    public static void main(String[] args) {

        int toplam=0,sayi;
        boolean tekMi= false;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("sayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==1){
                toplam+=sayi;
            } else if (sayi%2==0) {
                break;
            }
            System.out.println("toplam : "+toplam);
        } while (sayi > 0);




    }
}
