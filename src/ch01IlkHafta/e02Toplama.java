package ch01IlkHafta;

import java.util.Scanner;

public class e02Toplama {
    public static void main(String[] args) {
        // Kullanıcıdan gelecek olan iki tam sayının toplamını gönderir.
        Scanner sayi = new Scanner(System.in);
        System.out.print("Sayılar: "); // Toplanacak olan sayılar arada boşluk bırakılarak yazılmalıdır. Ör: 734 236
        String strSayilar = sayi.nextLine();

        String[] sayilar = strSayilar.split(" ");

        int ilkSayi = Integer.parseInt(sayilar[0]);
        int ikinciSayi = Integer.parseInt(sayilar[1]);
        int toplam = ilkSayi + ikinciSayi;

        System.out.println("Toplam: " + toplam);

        /* Veya

        Scanner say = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int ilkSayim = say.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        int ikinciSayim = say.nextInt();

        System.out.println("Sayılar: " + ilkSayim + " " + ikinciSayim);
        System.out.println("Toplam: " + (ilkSayim + ikinciSayim));
        */
    }
}
