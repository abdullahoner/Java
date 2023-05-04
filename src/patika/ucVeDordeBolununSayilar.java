package patika;

public class ucVeDordeBolununSayilar {
    public static void main(String[] args) {
        int toplam=0;

        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 && i%4==0){
                System.out.println(i);

                toplam +=i;
            }
        }
        System.out.println("toplam : "+toplam);
    }


}
