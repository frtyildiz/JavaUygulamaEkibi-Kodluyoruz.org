package ch01IlkHafta;

import java.util.Scanner;

public class e02Toplama {
    public static void main(String[] args) {
        // Kullanıcıdan gelecek olan iki tam sayının toplamını gönderir.
        Scanner sayi = new Scanner(System.in);
        System.out.print("Sayılar: "); // Toplanacak olan sayılar arada boşluk bırakılarak yazılmalıdır. Ör: 734 236
        String strSayilar = sayi.nextLine();

        String[] sayilar = strSayilar.split(" ");

        String birinci = sayilar[0];
        String ikinci = sayilar[1];

        int ilkSayi = Integer.parseInt(birinci);
        int ikinciSayi = Integer.parseInt(ikinci);
        int toplam = ilkSayi + ikinciSayi;

        System.out.println("Toplam: " + toplam);

        /* Veya

        Scanner ilk = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int ilkSayi = ilk.nextInt();

        Scanner ikinci = new Scanner(System.in);
        System.out.print("İkinci Sayıyı Giriniz: ");
        int ikinciSayi = ikinci.nextInt();

        System.out.println("Toplam: " + (ilkSayi + ikinciSayi));
         */
    }
}
