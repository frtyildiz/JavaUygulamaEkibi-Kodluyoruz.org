package src.ch03UcuncuHafta;

import java.util.Scanner;

public class e06Binary {
    public static void main(String[] args) {
        Scanner giri = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        String gelenGiri = giri.nextLine();

        char karakter;
        boolean binaryMi = false;
        for (int i = 0; i < gelenGiri.length(); i++)
        {
            karakter = gelenGiri.charAt(i);
            if (karakter == 48 || karakter == 49)
                binaryMi = true;
            else
            {
                binaryMi = false;
                break;
            }
        }

        if (binaryMi)
            System.out.println("Girmiş olduğunuz Sayı Binary Bir Sayıdır.");
        else
            System.out.println("Girmiş Olduğunuz Sayı Binary Değildir.");
    }
}
