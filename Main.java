import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pracownik> debile = new ArrayList<Pracownik>();

        Pracownik przystojniak = new Pracownik("Filip","Pietrzak",Stanowisko.TOTALNY_SZEF,50000,Umowa.O_PRACE);
        debile.add(przystojniak);

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        int stanowisko = 0;
        do {
            System.out.println("Witamy w P.i.W.O (Pracownicy i Wiele Obiektów) - 1.0.0");
            System.out.println("1. Dodaj pracownika");
            System.out.println("2. Wyświetl pracowników");
            System.out.println("3. Usuń pracownika");
            System.out.println("4. Koszty firmy");
            System.out.println("5. Wyjdź z systemu");
            System.out.print("Podaj opcje: ");

            option = scanner.nextInt();
            if(option>6 || option<1){
                System.out.println();
                System.out.println("Błąd! Prosze podać jedną z opcji podanych wyżej\n");
            }
            switch (option) {
                case 1:
                    System.out.print("\nWybrałeś opcje by dodać pracownika\nPodaj imię: ");
                    scanner.nextLine();
                    String imie_input = scanner.nextLine();
                    System.out.print("Podaj nazwisko: ");
                    String nazwisko_input = scanner.nextLine();
                    do{
                        System.out.println("Wybierz stanowisko");
                        System.out.println("1. "+Stanowisko.DATA_SCIENTST.name());
                        System.out.println("2. "+Stanowisko.SERWISANT.name());
                        System.out.println("3. "+Stanowisko.ADMIN.name());
                        System.out.println("4. "+Stanowisko.TEAM_LEADER.name());
                        System.out.println("5. "+Stanowisko.PROGRAMER.name());
                        System.out.println("6. "+Stanowisko.TOTALNY_SZEF.name()+"\n");
                        System.out.print("Podaj nazwisko: ");
                        stanowisko = scanner.nextInt();

                    }while (stanowisko>7 || stanowisko<1);

                    break;
                case 2:
                    for (Pracownik klucz: debile) {
                        System.out.println(klucz);
                    }
                    break;

            }

            System.out.println();
        }while (option!=5);
    }
}
