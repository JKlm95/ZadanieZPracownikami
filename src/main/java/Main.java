import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Magazyn magazyn = new Magazyn();
        String komenda;

        do {
            System.out.println("Komenda:");
            komenda = scanner.next();

            if (komenda.equalsIgnoreCase("dodajprodukt")) {
                // tutaj załaduj pozostałe parametry
                Produkt produkt = new Produkt(
                        scanner.next(),         // nazwa
                        scanner.nextDouble(),   // cena
                        scanner.nextDouble());  // wartosc podatku

                magazyn.dodajProdukt(produkt);
            } else if (komenda.equalsIgnoreCase("dodajpracownika")) {
                // tutaj załaduj pozostałe parametry
                Pracownik pracownik = new Pracownik(
                        scanner.next(),             // first name
                        scanner.next(),             // last name
                        scanner.next(),             // pesel
                        scanner.nextInt(),          // age
                        scanner.nextDouble());      // salary

                magazyn.dodajPracownika(pracownik);
            } else if (komenda.equalsIgnoreCase("usunprodukt")) {
                String nazwa = scanner.next();

                magazyn.usunProdukt(nazwa);
            } else if (komenda.equalsIgnoreCase("usunpracownika")) {
                String pesel = scanner.next();

                magazyn.usunPracownika(pesel);
            } else if (komenda.equalsIgnoreCase("wypiszpracownikow")) {
                magazyn.wypiszPracownikow();
            } else if (komenda.equalsIgnoreCase("wypiszprodukty")) {
                magazyn.wypiszProdukty();
            }

        } while (!komenda.equalsIgnoreCase("quit"));
    }
}
