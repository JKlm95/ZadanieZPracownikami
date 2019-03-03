import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Magazyn m = new Magazyn();
//        Produkt p1 = new Produkt("a", 2.3, 0.23);
//        Produkt p2 = new Produkt("b", 12.3, 0.23);
//        Produkt p3 = new Produkt("c", 12.3, 0.23);
//
//        m.dodajProdukt(p1);
//        m.dodajProdukt(p2);
//        m.dodajProdukt(p3);
//
//        m.wypiszProdukt("a");
//        m.wypiszProdukty();

        String komenda;

        do {
            System.out.println("Komenda: ");
            komenda = sc.nextLine();
            String[] s = komenda.split(" ");
            if (!s[0].equalsIgnoreCase("quit")){

                switch (s[0] + " " + s[1]){
                    case "dodaj produkt":
                        m.dodajProdukt(new Produkt(s[2], Double.parseDouble(s[3]), Double.parseDouble(s[4])));
                        break;
                    case "dodaj pracownika":
                        m.dodajPracownika(new Pracownik(s[2], s[3], s[4], Integer.parseInt(s[5]), Double.parseDouble(s[6])));
                        break;
                    case "usun produkt":
                        m.usunProdukt(s[2]);
                        break;
                    case "usun pracownika":
                        m.usunPracownika(s[2]);
                        break;
                }
            }


        } while (!komenda.equalsIgnoreCase("quit"));

        m.wypiszProdukty();
        m.wypiszPracownikow();
    }
}
