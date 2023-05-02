package patika;

import java.util.Scanner;

public class daireAlanHesapla {
    public static void main(String[] args) {
        /*
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;
        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        double yaricap,cap,cevre, pi =3.14;
        Scanner scan = new Scanner(System.in);
        System.out.print("dairenin yari capini yazin : ");
        yaricap = scan.nextDouble();
        cap = pi*(yaricap*yaricap);
        cevre = 2*(pi*yaricap);
        System.out.println("çap : "+cap+"\ncevre : "+cevre);
    }
}
