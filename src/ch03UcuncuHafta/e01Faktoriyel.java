package src.ch03UcuncuHafta;

import java.util.Scanner;

public class e01Faktoriyel {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.print("Faktöriyelini Almak İstediğiniz Sayı: ");
        int gelenSayi = sayi.nextInt();

        int faktoriyel = 1;

        if (gelenSayi < 0)
            System.out.println("Lütfen Pozitif Bir Sayı Giriniz.");

        while (gelenSayi > 1)
        {
            faktoriyel *= gelenSayi;
            gelenSayi--;
        }

        System.out.println("Girdiğiniz Sayının Faktöriyeli: " + faktoriyel);
    }
}
