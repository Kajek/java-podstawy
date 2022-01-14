package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Projekt {
    public static void main(String[] args) {

        Scanner odczyt = new Scanner(System.in);
        boolean czyUruchomiony = true;
        Pattern p = Pattern.compile("FV-[0-9]{3}-20(20|21)(-OEM)?");
        String opcja;

        String[][] tablicaWalut = new String[3][2];
        tablicaWalut[0] = new String[]{"EUR", "4.62"};
        tablicaWalut[1] = new String[]{"USD", "4.06"};
        tablicaWalut[2] = new String[]{"GBP", "5.42"};

        do {
            System.out.println("Dostępne opcje:");
            System.out.printf("Dodaj produkt - %8s\n" +
                    "Usuń produkt - %8s \n" +
                    "Oblicz vat - %9s \n" +
                    "Sprawdź fakturę  - %5s \n" +
                    "Wyświetl waluty - %7s \n" +
                    "Konwerter walut - %7s \n" +
                    "Wyjdz z programu - %5s \n", "dodaj", "usun", "vat", "sprawdz", "waluty", "konwerter", "wyjdz");
//            System.out.printf("Dodaj produkt - %8s \n" , "dodaj");
//            System.out.printf("Usun produkt - %8s \n" , "usun");
//            System.out.printf("Oblicz vat - %9s \n" , "vat");
//            System.out.printf("Wyjdz z programu - %5s \n" , "wyjdz");


            System.out.print("Podaj swoją opcję: ");
            opcja = odczyt.nextLine();

            switch (opcja) {
                case "dodaj":
                    System.out.println("Wybrano opcję dodaj.");
                    continue;
                case "usuń":
                    System.out.println("Wybrano opcję usuń.");
                    continue;
                case "sprawdz":
                    System.out.println("Podaj ID faktury");
                    String faktura = odczyt.nextLine();
                    Matcher m = p.matcher(faktura);
                    if (m.matches()) {
                        System.out.println("Faktura jest prawidłowa");
                    } else {
                        System.out.println("Faktura jest źle podana");
                    }
                    continue;
                case "vat":
                    System.out.print("Podaj netto:");
                    double netto = odczyt.nextDouble();
                    System.out.print("Podaj vat:");
                    double vat = odczyt.nextDouble();
                    odczyt.nextLine();

                    if (sprawdzNettoVat(netto, vat)) {
                        System.out.println("Netto i/lub vat są nieprawidłowe.");
                    } else {
                        double wynikBrutto = obliczBrutto(netto, vat);
                        System.out.printf("Kwota brutto: %.2f \n ", wynikBrutto);
                    }


                    break;
                case "waluty":
                    wyswietlWaluty(tablicaWalut);
                    break;
                case "konwerter": //przerobić na metodę
                    System.out.println("Podaj wartość którą chcesz przekonwertować: ");
                    double userMoneyConv = odczyt.nextDouble();
                    odczyt.nextLine();
                    System.out.println("Wybierz walutę na którą chcesz konwertować: (EUR, USD, GBP)");
                    String userMoneyChoice = odczyt.nextLine();

                    double przelicznik = -1;

                    for (String[] s : tablicaWalut) {
                        if (s[0].equals(userMoneyChoice)) {
                            przelicznik = Double.parseDouble(s[1]);
                            break;
                        }
                    }
                    if (przelicznik != -1) {
                        System.out.println("Wynik: " + (userMoneyConv / przelicznik));
                    } else {
                        System.out.println("Brak podanej waluty");
                    }
                    break;
                case "wyjdz":
                    czyUruchomiony = false;
                    break;
                default:
                    System.out.println("Nie rozpoznano opcji.");
            }

        } while (czyUruchomiony);
    }

    static boolean sprawdzNettoVat(double netto, double vat) {
        return netto <= 0 || vat <= 0;
    }

    static double obliczBrutto(double netto, double vat) {
        return netto * (1.0 + (vat / 100));
    }

    static void wyswietlWaluty(String[][] tablicaWalut) {
        for (String[] x : tablicaWalut) {
            System.out.println(x[0] + " : " + x[1]);
        }
    }


}