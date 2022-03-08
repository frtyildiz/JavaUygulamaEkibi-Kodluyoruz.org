package src.ch03UcuncuHafta;

import java.util.Scanner;

public class e03Fibonacci {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int gelenSayi = sayi.nextInt();

        int ilkSayi = 0;
        int ikinciSayi = 1;
        System.out.print(ilkSayi + " " + ikinciSayi);

        for (int i = 2; i < gelenSayi; ++i)
        {
            int fibonacciSayisi = ilkSayi + ikinciSayi;
            System.out.print(" " + fibonacciSayisi);
            ilkSayi = ikinciSayi;
            ikinciSayi = fibonacciSayisi;
        }
    }
}
