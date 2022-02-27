package com.company;

public class Homework {

    public static void main(String[] args) {

        //-- ZADANIE 01 --
        //Pobierz w konsoli dwie liczby całkowite, następnie porównaj je i wyświetl stosowny komunikat z wynikiem.

//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("Podaj pierwszą liczbę całkowitą:");
//        int firstNum = odczyt.nextInt();
//        System.out.println("Podaj drugą liczbę całkowitą:");
//        int secondNum = odczyt.nextInt();
//
//        if(firstNum == secondNum){
//            System.out.println("Podane liczby są takie same");
//        }else if(firstNum > secondNum){
//            System.out.println("Pierwsza liczba jest większa niż druga");
//        }else{
//            System.out.println("Druga liczba jest większa niż pierwsza");
//        }

        //-- ZADANIE 02 --
        //Napisz program, który za pomocą instrukcji while dla danych wartości x zmieniających się od 0 do 10 oblicza wartość funkcji y = 3x

//        int x = 0;
//        while(x !=10){
//            x++;
//            System.out.println(3 *x);

//        -- ZADANIE 03 --
//        Napisz program, który przy użyciu instrukcji for sumuje liczby całkowite od 1 do 100. (czyli suma liczb od 1 do 100)

//        int sum = 0;
//        for (int i = 1; i <= 100 ; i++) {
//            sum = sum +i;
//        }
//        System.out.println(sum);

//        -- ZADANIE 04 --
//        Napisz program, który obliczy silnie liczby podanej przez użytkownika (połączenie Scanner i pętli)
//
//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("Podaj liczbę której silnię chcesz uzyskać: ");
//        int silniaNum = odczyt.nextInt();
//        int iloczyn = 1;
//        for (int i = 1; i <=silniaNum ; i++) {
//            iloczyn = iloczyn * i;
//        }
//        System.out.println("Silnia liczby "+ silniaNum + " wynosi: " + iloczyn);

//        -- ZADANIE 05 --
//        Napisz program, który zwróci wartość ASCII podanego przez użytkownika znaku.

//        System.out.println("Podaj znak do odczytania w ASCII: ");
//        Scanner odczyt = new Scanner(System.in);
//        char userInput = odczyt.next().charAt(0);
//        int userInputToAscii = (int) userInput;
//        System.out.println(userInputToAscii);

//        -- ZADANIE 06 --
//        Napisz program, który pobiera liczbę zmiennoprzecinkową, a następnie:
//        - czy jest to wartość nieparzysta, jeżeli tak to sprawdza, czy jest podzielna przez 5
//        - jeżeli jest parzysta to czy mieści się w zakresie 0-100

//        Scanner odczyt = new Scanner(System.in);
//
//        System.out.println("Podaj liczbę zmiennoprzecinkową(zapis z przecinkiem) : "); //nie wiem dlaczego ale input z kropką wyrzuca error, z przecinkiem działa
//        float userFloatInput = odczyt.nextFloat();
//        odczyt.nextLine();
//        if(userFloatInput %2 != 0){
//            if(userFloatInput %5 ==0){
//                System.out.println("Podana liczba jest nieparzysta i jest podzielna przez 5");
//            }else{
//                System.out.println("Podana liczba jest nieparzysta i nie jest podzielna przez 5");
//            }
//        }else {
//            if(userFloatInput >= 0 && userFloatInput <= 100){
//                System.out.println("Podana liczna jest parzysta i mieści się w zakresie 0-100");
//            }else{
//                System.out.println("Podana liczba jest parzysta i nie mieści się w zakresie 0-100");
//            }
//        }
//        -- ZADANIE 07 --
//        Napisać program, która zamienia podaną liczbę całkowitą na binarną.
//        Przykładowo: użytkownik poda 3 to w odpowiedzi ma otrzymać CONAJMNIEJ 0011

//        Scanner odczyt = new Scanner(System.in);
//        int i=1, binary=0, reminderNum;
//        System.out.println("Podaj liczbę całkowitą do zmiany na binarną: ");
//        int givenNum = odczyt.nextInt();
//        odczyt.nextLine();

//        String binaryNum = Integer.toBinaryString(givenNum); //wbudowana metoda Javy
//        System.out.println("Liczba: "+ givenNum + " w zapisie binarnym to: " + binaryNum + " (Obliczono wbudowaną metodą)");
//
//        while(givenNum != 0){
//            reminderNum = givenNum%2;
//            binary += i*reminderNum;
//            givenNum = givenNum/2;
//            System.out.println(givenNum);
//            i=i*10;
//        }
//        System.out.println("Liczba: "+ givenNum + " w zapisie binarnym to: " + binary + " (Obliczono pętlą)");

//
//        -- ZADANIE 08 --
//        Napisać kalkulator dwóch liczb. Na początku użytkownik podaje jaka operacja go interesuje (dodaj/usun/mnoz/dziel), a następnie dwie liczby.
//        Program działa w pętli dopóki użytkownik nie poda operacji "wyjdz".
//
//        Scanner odczyt = new Scanner(System.in);
//        boolean czyDziala = true;
//        String operacja;
//
//        do {
//            System.out.println("Wybierz operację: dodaj/usun/mnoz/dziel/wyjdz");
//            operacja = odczyt.nextLine();
//            if(operacja.equals("wyjdz")){
//                break;
//            }else{
//                System.out.println("Podaj pierwszą liczbę: ");
//                float pierwszaLiczba = odczyt.nextFloat();
//                System.out.println("Podaj drugą liczbę: ");
//                float drugaLiczba = odczyt.nextFloat();
//                odczyt.nextLine();
//                switch (operacja){
//                    case "wyjdz":
//                        czyDziala = false;
//                        break;
//                    case "dodaj":
//                        System.out.println(pierwszaLiczba + drugaLiczba);
//                        continue;
//                    case "usun":
//                        System.out.println(pierwszaLiczba - drugaLiczba);
//                        continue;
//                    case "mnoz":
//                        System.out.println(pierwszaLiczba * drugaLiczba);
//                        continue;
//                    case "dziel":
//                        System.out.println(pierwszaLiczba / drugaLiczba);
//                        continue;
//                }
//            }
//        }while (czyDziala);

//        -- ZADANIE 09 --
//        Zaimplementować algorytm Euklidesa - opis można znaleźć w sieci. Poniżej pseudokod z Wikipedii.
//
//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("Szukamy największego wspólnego dzielinka dwóch liczb");
//        System.out.println("Podaj pierwszą liczbę: ");
//        int firstNum = odczyt.nextInt();
//        odczyt.nextLine();
//        System.out.println("Podaj drugą liczbę: ");
//        int secondNum = odczyt.nextInt();
//        odczyt.nextLine();
//
//        while( secondNum != 0){
//            int thirdNum = firstNum % secondNum;
//            firstNum = secondNum;
//            secondNum = thirdNum;
//        }
//        System.out.println("Największu wspólny dzielnik tych liczb to: " + firstNum);


//        -- ZADANIE 10 --
//        Napisz program który sprawdzi czy adres podany przy użytkownika jest poprawny. Podpowiedź do wyrażenia regularnego:

//        --ZADANIE Z ZAJĘC Z TABLIC nr1


//        // Użytkownik podaje ile liczb typu int chce wprowadzić do systemu.
//        // Po podaniu ilości program wypytuje użytkownika o te wartości
//        // Pod koniec wyświetla listę podanych liczb.
//        // oraz która liczba jest największa i najmniejsza.
//
//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("Podaj ile liczb chcesz wprwoadzić do systemu: ");
//        int userInt = odczyt.nextInt();
//        int[] tablica = new int[userInt];
//        int maxNum = tablica[0];
//        int minNum = tablica[0];
//
//
//        for (int i = 0; i < tablica.length; i++) {
//            System.out.println("Podaj liczbę nr" + i +1);
//            tablica[i]= odczyt.nextInt();
//        }
//
//        for (int i = 0; i < tablica.length; i++) {
//            System.out.print(tablica[i] + " ");
//        }
//
//        for (int i = 0; i < tablica.length; i++) {
//            if (tablica[i] >maxNum){
//                maxNum = tablica[i];
//            }
//        }
//        System.out.println("Największa liczba w tablicy to: " +maxNum);
//        for (int i = 0; i < tablica.length; i++) {
//            if (tablica[i] < minNum){
//                minNum = tablica[i];
//            }
//        }

//        Ewentualnie zeby znalezc max i min za pomoca foreach :
//
//        for(int m: tablica){
//            if( maxNum > m){
//                maxNum = m;
//            }else if(minNum < m){
//                minNum = m;
//            }
//        }

//        System.out.println("Najmniejsza liczba w tablicy to: " +minNum);

//        --ZADANIE Z ZAJĘC Z TABLIC nr2
//
//        Użytkownik definiuje listę liczb double - 10 elementową
//        Następnie program przepisuje te wartości do nowej tablicy
//        Posortowanie rosnąco.

//        Scanner odczyt = new Scanner(System.in);
//        double[] tab = new double[3];
//        double[] sortedTab = new double[tab.length];
//        int n =0;
//        double minTab = tab[0];
//
//        for (int i = 0; i < tab.length; i++) {
//            System.out.println("Podaj liczbę nr " + i);
//            tab[i]= odczyt.nextDouble();
//        }
//
//        while (n<tab.length){
//
//            minTab = tab[n];
//
//            for (int i = n; i < tab.length; i++) {
//                if( minTab > tab[i]){
//                    minTab = tab[i];
//                    tab[i] = tab[n];
//                    tab[n] = minTab;
//                }
//            }
//            n++;
//        }
//        for (double s: tab){
//            System.out.println(s);
//        }
//
//        --ZADANIE Z ZAJĘC Z TABLIC nr3

// Użytkownik definiuje tablicę int n wierszy / 2 kolumny
// Wiersz przechowuje informację o wartości x i modulo y dla tej wartości

// Użytkownik po podaniu wybranego wiersza
// ma otrzymać w odpowiedzi wynik w postaci x % y

// Przykładowo - mamy wiersz [10,3] (wiersz o indeksie 0)
// W odpowiedzi otrzymujemy wynik operacji 10 % 3
// ZAKAZUJE UŻYWANIA ZMIENNYCH DO PRZEPISYWANIA INFORMACJI Z TABLICY
// int x = tablica[0];
        // dodać odczyty i przepisania

//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("Podaj liczbę wieszy: ");
//        int wierszeNum = odczyt.nextInt();
//        int[][] tablica = new int[wierszeNum][2];
//        int[] wiersz = new int[]{10,3};
//        tablica[0] = wiersz;
//
//        System.out.println("Podaj indeks wiesza: ");
//        int nrWiersza = odczyt.nextInt();
//
//        System.out.println("Wartość x: " +tablica[nrWiersza][0]);
//        System.out.println("Wartość y: " +tablica[nrWiersza][1]);
//        System.out.println("wynik x % y: " +(tablica[nrWiersza][0] % tablica[nrWiersza][1]));
//
//        System.out.println("Wynik: " + (tablica[0][0] % tablica[0][1]));


//        -----ZADANIE Z TABLIC NR 4-----------
//        // Zadeklaruj tablicę int dwuwymariową: 2x3
//        // Wartościami dla poszczególnych pozycji będzie:
//        // index_wiersza * index_kolumny
//
//        int[][] tab = new int[2][3];
//
//        for (int i = 0; i < tab.length ; i++) {
//            for (int j = 0; j < tab[i].length; j++) {
//                tab[i][j] = i*j;
//                System.out.println(tab[i][j]);
//            }
//        }

//
//        ------Zadanie napisz sinlnie n-----
//
//        static int silnia(int n){
//            int wynik = 1;
//
//            if(n <=0){
//                return wynik;
//            }else{
//                for (int i = 0; i < n; i++) {
//                    wynik *= 1;
//                }
//                return wynik;
//            }
//        }

        //ostatni dzień powtorka ::
//        package com.company;
//
//import com.company.practice.objects.Student;
//import com.company.practice.figures.Triangle;
//import com.company.practice.figures.Rectangle;
//import com.company.practice.figures.Cuboid;
//import com.company.practice.objects.Product;
//
//import java.time.LocalTime;
//import java.util.Scanner;
//
//        public class Main {
////doczytać o static przy metodach i klasach
//
//            public static void main(String[] args) {
//
////        W klasie Main zdefiniować metodę, która będzie wyświetlać menu.
////                Dostępne opcje:
////                - trojkat -> stworz trojkat
////                - prostokat -> stworz prostokąt
////                - prostopadloscian -> swtorz prostopadloscian
////                - wyjscie -> wyjscie z programu.
////        Zdefiniuj scanner i switch który pozwoli na wybor opcji z menu.
////                - Na początku niech wyświetla jedynie komunikat, że coś zostało wybrane.
////                - Wprowadz zabezpieczenie, kiedy użytkownik poda błędną opcje.
////                - Do menu wprowadz kolejne wyświetlenie czyli "menu - wyswietl menu"
////        Niech nasz program działa w pętli while, dopóki nie poda on opcji wyjscie.
////        Jeżeli wybierze opcje trojkat, to będzie użytkownik proszony o zmienne dla trojkat
////        Jeżeli wybierze opcje prostokąt, to zmienne to stworzenia prostokąta
//
////        Zdefiniuj 3 tablice 5 elementowe
////        Po jednej dla każdej figury
////        Po utworzeniu danej figury zapisz na pierwszym wolnym miejscu na liscie
////        Jezeli lista pelna - zwroc blad
//
////        Rectangle r2 = new Rectangle(10,10);
////        Cuboid c1 = new Cuboid(10,r2);
////        System.out.println(c1);
////        Cuboid c2 = new Cuboid(10, new Rectangle(10,12));
////        System.out.println(c2.toString());
//
//                shapeCreatorMenu();
//                Scanner odczyt = new Scanner(System.in);
//                String opcja;
//                boolean czyUruchomiony = true;
//                Triangle[] listOfTriangles= new Triangle[5];
//                Rectangle[] listOfRectangles = new Rectangle[5];
//                Cuboid[] listOfCuboids = new Cuboid[5];
//
//                while(czyUruchomiony){
//                    System.out.println("Podaj opcje");
//                    opcja = odczyt.nextLine();
//
//                    switch (opcja){
//                        case "trojkat":
//                            System.out.println("Podaj wymiary trójkąta:");
//                            System.out.println("Podaj podstawę trójkąta: ");
//                            double podstawaTrojkata = odczyt.nextDouble();
//                            System.out.println("Podaj bok A: ");
//                            double bokATrojkata = odczyt.nextDouble();
//                            System.out.println("Podaj bok B: ");
//                            double bokBTrojkata = odczyt.nextDouble();
//                            System.out.println("Podaj wysokość trójkąta: ");
//                            double wysokoscTrojkata = odczyt.nextDouble();
//                            Triangle t1 = new Triangle(podstawaTrojkata, wysokoscTrojkata, bokATrojkata, bokBTrojkata);
//                            System.out.println(t1);
//
//                            for (int i = 0; i < listOfTriangles.length; i++) {
//                                if(listOfTriangles[i]==null){
//                                    listOfTriangles[i] = t1;
//                                    break;
//                                }
//                            }
//                            for (Triangle t : listOfTriangles){
//                                System.out.println(t);
//                            }
//                            odczyt.nextLine();
//                            break;
//                        case "prostokat":
//                            System.out.println("Wybrano opcje prostokąt");
//                            System.out.println("Podaj wymiary prostokąta. Bok A: ");
//                            double bokAProstokata = odczyt.nextDouble();
//                            System.out.println("Podaj wymiary prostokąta. Bok B: ");
//                            double bokBProstokata = odczyt.nextDouble();
//                            Rectangle r1 = new Rectangle(bokAProstokata, bokBProstokata);
//
//                            for (int i = 0; i < listOfRectangles.length; i++) {
//                                if(listOfRectangles[i]==null){
//                                    listOfRectangles[i] = r1;
//                                    break;
//                                }
//                            }
//                            for (Rectangle r : listOfRectangles){
//                                System.out.println(r);
//                            }
//                            odczyt.nextLine();
//                            break;
//                        case "prostopadloscian":
//                            System.out.println("Wybrano opcje prostopadłościan");
//                            System.out.println("Podaj bok A: ");
//                            double bokACub = odczyt.nextDouble();
//                            System.out.println("Podaj bok B: ");
//                            double bokBCub = odczyt.nextDouble();
//                            System.out.println("Podaj wysokość : ");
//                            double wysokoscCub = odczyt.nextDouble();
//                            Cuboid c1 = new Cuboid(wysokoscCub, new Rectangle(bokACub, bokBCub));
//
//                            for (int i = 0; i < listOfCuboids.length; i++) {
//                                if(listOfCuboids[i]==null){
//                                    listOfCuboids[i] = c1;
//                                    break;
//                                }
//                            }
//                            for (Cuboid c : listOfCuboids){
//                                System.out.println(c);
//                            }
//                            odczyt.nextLine();
//                            break;
//                        case "menu":
//                            shapeCreatorMenu();
//                            break;
//                        case "wyjdz":
//                            System.out.println("Wyjście z programu");
//                            czyUruchomiony = false;
//                            break;
//                        default:
//                            System.out.println("Nie rozpoznano opcji");
//                            break;
//                    }
//                }
//            }
//
//            static void shapeCreatorMenu(){
//                System.out.println("Wybierz jaką figurę chcesz stworzyć: ");
//                System.out.printf("Stwórz trojkat - %16s\n" +
//                        "Stworz prostokat - %16s\n" +
//                        "Stworz prostopadloscian - %1s\n" +
//                        "Wyświetl menu - %14s \n" +
//                        "Wyjście z programu - %10s\n", "trojkat", "prostokat", "prostopadloscian","menu", "wyjdz");
//
//            }
//        }
//

//        --------napisać kółko i krzyżyk-------------
    }

}
