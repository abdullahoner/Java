package patika;

import java.util.Scanner;

public class hipotenusBulma {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double ucuncuKenar;
        System.out.print("ucgenin birinci kenar uzunlugunu yaziniz : ");
        double birinciKenar = scan.nextDouble();
        System.out.print("ucgenin ikinci kenar uzunlugunu yaziniz : ");
        double ikinciKenar = scan.nextDouble();

        ucuncuKenar = Math.sqrt((birinciKenar*birinciKenar)+(ikinciKenar*ikinciKenar));
        System.out.println("ucuncu Kenar = " + ucuncuKenar);

        double alan = (birinciKenar+ikinciKenar+ucuncuKenar);
        System.out.println("alan = " + alan);
    }
}
