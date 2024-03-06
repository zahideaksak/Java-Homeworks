package examples04_Arrays;

public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Zahide";
        ogrenciler[1] = "Emre";
        ogrenciler[2] = "Enes";
        ogrenciler[3] = "Çağatay";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-------------------------");

        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
