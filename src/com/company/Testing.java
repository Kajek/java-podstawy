package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testing {
    public static void main(String[] args) {

        Scanner odczyt = new Scanner(System.in);
        boolean czyUruchomiony = true;
        Pattern p = Pattern.compile("FV-[0-9]{3}-20(20|21)(-OEM)?");

        do{
            System.out.println("Witamy w aplikacji! Proszę wybrać numer opcji którą chcesz wykonać(1-4): ");
            System.out.println("1. Dodaj");
            System.out.println("2. Usuń");
            System.out.println("3. Oblicz vat");
            System.out.println("4. Sprawdź fakturę");
            System.out.println("5. Wyjdź");
            int wyborUzytkownika = odczyt.nextInt();
            odczyt.nextLine();

            if(wyborUzytkownika == 1){
                System.out.println("Wybrałeś opcję Dodaj");
                continue;
            }else if(wyborUzytkownika ==2){
                System.out.println("Wybrałeś opcję Usuń");
                continue;
            }else if(wyborUzytkownika == 3){
                System.out.print("Podaj netto:");
                double netto = odczyt.nextDouble();
                System.out.print("Podaj vat:");
                double vat = odczyt.nextDouble();
                odczyt.nextLine();

                if (netto <= 0 || vat <= 0){
                    System.out.println("Netto i/lub vat są nieprawidłowe.");
                }else{
                    double wynik = netto * (1.0 + (vat/100));
                    System.out.println("Kwota brutto: " + wynik);
                }
            }else if(wyborUzytkownika == 4){
                System.out.println("Podaj ID faktury");
                String faktura = odczyt.nextLine();
                Matcher m = p.matcher(faktura);
                if (m.matches()){
                    System.out.println("Faktura jest prawidłowa");
                }else{
                    System.out.println("Faktura jest źle podana");
                }
                continue;
            }else if(wyborUzytkownika ==5){
                czyUruchomiony = false;
            }else{
                System.out.println("Nieprawidłowy wybór, spróbuj ponownie");
                continue;
            }
        }while (czyUruchomiony);
    }
}


