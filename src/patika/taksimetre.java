package patika;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("gidilecek mesafeyi giriniz : ");
        double mesafe = scan.nextDouble();
        double perKM = 2.20,taksimetreUcreti = 10;

        taksimetreUcreti += mesafe*perKM;

        taksimetreUcreti = (20>=taksimetreUcreti ) ? 20 : taksimetreUcreti;

        System.out.print("odenecek tutar = " + taksimetreUcreti);


    }
}
