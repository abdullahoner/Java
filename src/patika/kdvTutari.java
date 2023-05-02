package patika;

import java.util.Scanner;

public class kdvTutari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double urunFiyat,sonuc,kdvOran,kdvliFiyat;
        kdvOran = 0.18;
        System.out.print("urun fiyatini giriniz : ");
        urunFiyat = scan.nextDouble();


        if (urunFiyat>=1000) {
            kdvOran = 0.8;
            sonuc = urunFiyat * kdvOran;
            kdvliFiyat = sonuc + urunFiyat;
            System.out.println("kdvli fiyat : " + kdvliFiyat + "\nkdvsiz fiyat : " + urunFiyat+"\n kdv tutari : "+kdvOran);
        }else {
            sonuc = urunFiyat * kdvOran;
            kdvliFiyat = sonuc + urunFiyat;
            System.out.println("kdvli fiyat : " + kdvliFiyat + "\nkdvsiz fiyat : " + urunFiyat+"\n kdv tutari : "+kdvOran);
        }
    }
}
