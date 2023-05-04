package patika;

import java.util.Scanner;

public class kuvvetleriBulma {
    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sınır sayısı gir");
        sayi= scan.nextInt();
        for(int i=1; i<sayi; i*=4)
            System.out.println("dördün kuvvetleri " +i);

        for(int j=1; j<sayi; j*=5)
            System.out.println("beşin kuvvetleri " +j);
    }

}
