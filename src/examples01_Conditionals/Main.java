package examples01_Conditionals;

public class Main {
    public static void main(String[] args) {
        /*int sayi = 24;
        if (sayi < 20) {
            System.out.println("Sayi 20'den kucuktur.");
        } else if (sayi == 20 ) {
            System.out.println("Sayi 20'ye esittir.");
        } else {
            System.out.println("Sayi 20'den buyuktur.");
        }*/
        int sayi1 = 266;
        int sayi2 = 25;
        int sayi3 = 26;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println("En buyuk = " +enBuyuk);
    }
}
