package ch01IlkHafta;

import java.util.Scanner;

public class e03Carpma {
    public static void main(String[] args) {
        // Kullanıcıdan gelecek olan iki ondalık sayıyı çarpar.
        Scanner sayi = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        double ilkSayi = sayi.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz: ");
        double ikinciSayi = sayi.nextDouble();

        System.out.println("Çarpım Sonucu: " + (ilkSayi * ikinciSayi));
    }
}
