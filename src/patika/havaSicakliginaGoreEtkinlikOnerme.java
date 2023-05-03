package patika;

import java.util.Scanner;

public class havaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava sicakligini giriniz : ");

        heat = input.nextInt();
        if (heat <= 5){
            System.out.print("Kayak yapabilirsin");
        }else if(heat > 5 && heat <= 15){
            System.out.print("Sinema gidebilirsin");
        }else if(heat > 15 && heat <= 25){
            System.out.print("Piknik yapabilirsin");
        }else if(heat > 25){
            System.out.print("Yuzmeye gidebilirsin");
        }
    }
}
