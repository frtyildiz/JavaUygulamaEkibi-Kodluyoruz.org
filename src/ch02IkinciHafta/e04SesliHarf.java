package src.ch02IkinciHafta;

import java.util.Scanner;

public class e04SesliHarf {
    public static void main(String[] args) {
        // Kullanıcının yazdığı metindeki sesli harfleri bulalım
        Scanner giri = new Scanner(System.in);
        System.out.print("Metin: ");
        String gelenGiri = giri.nextLine();

        int sesliHarfSayisi = 0;
        String sesliHarfler = "";

        for (int i = 0; i < gelenGiri.length(); i++)
        {
            char harf = gelenGiri.charAt(i);
            if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'ı' || harf == 'ö' || harf == 'o' || harf == 'u' ||
                    harf == 'ü')
            {
                sesliHarfSayisi++;
                sesliHarfler += harf + " ";
            }
        }

        System.out.println("Girmiş Olduğunuz Metin İçerisinde " + sesliHarfSayisi + " Tane Sesli Harf Bulunmaktadır.");
        System.out.println("Bulunan Sesli Harfler: " + sesliHarfler);
    }
}
