package src.ch03UcuncuHafta;

import java.util.Scanner;

public class e04StringArama {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Giri: ");
        String gelenStr = str.nextLine();

        System.out.println(stringArama(gelenStr));
    }
    public static String stringArama (String stringGiri)
    {
        char karakter;
        String rakamSembol = "";

        for (int i = 0; i < stringGiri.length(); i++)
        {
            karakter = stringGiri.charAt(i);
            if ((karakter <= 64 && karakter >= 32) || (karakter >= 91 && karakter <= 96) || (karakter >= 123)
            && (karakter != 'ş' && karakter != 'Ş' && karakter != 'ü' && karakter != 'Ü' && karakter != 'ğ' && karakter != 'Ğ'
            && karakter != 'ö' && karakter != 'Ö' && karakter != 'İ' && karakter != 'ı' && karakter != 'Ç' && karakter != 'ç' ))
            {
                rakamSembol += karakter;
            }
            else
                continue;
        }
        return rakamSembol;
    }
}
