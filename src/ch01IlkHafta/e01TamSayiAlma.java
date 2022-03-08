package src.ch01IlkHafta;

import java.util.Scanner;

public class e01TamSayiAlma {
    public static void main(String[] args) {
        // Kullanıcıdan gelecek olan tam sayıyı yazdırır.

        Scanner sayi = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int girilenSayi = sayi.nextInt();

        System.out.println("Girilen Sayı: " + girilenSayi);
    }
}
