package patika;

import java.util.Scanner;

public class VKIHesapla {
    public static void main(String[] args) {
        //Kilo (kg) / Boy(m) * Boy(m)
        Scanner scan = new Scanner(System.in);
        double boy,kg,vki;
        System.out.print("boyunuzu metre cinsinden  giriniz : ");
        boy = scan.nextDouble();
        System.out.print("kilonuzu giriniz : ");
        kg = scan.nextDouble();

        vki = kg/(boy*boy);
        System.out.println("vki = " + vki);

    }
}
