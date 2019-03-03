import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Magazyn {
    private List<Pracownik> pracownikList = new ArrayList<Pracownik>();
    private List<Produkt> produktList = new ArrayList<Produkt>();


    public void dodajProdukt(Produkt produkt) {
        produktList.add(produkt);
    }

    public void dodajPracownika(Pracownik pracownik) {
        pracownikList.add(pracownik);
    }

    public void usunProdukt(String nazwa) {
        for (Produkt p : produktList) {
            if (p.getName().equalsIgnoreCase(nazwa)) {
                produktList.remove(p);
                break;
            }
        }
    }

    public void usunPracownika(String pesel) {
        for (Pracownik p : pracownikList) {
            if (p.getPesel().equalsIgnoreCase(pesel)) {
                pracownikList.remove(p);
                break;
            }
        }
    }

    public void wypiszPracownikow() {
        pracownikList.forEach(System.out::println);
    }

    public void wypiszProdukty() {
        produktList.forEach(System.out::println);
    }
}