import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Magazyn {
    private List<Pracownik> listaPracownikow = new ArrayList<Pracownik>();
    private List<Produkt> listaProduktow = new ArrayList<Produkt>();

    public void dodajProdukt(Produkt produkt){
        listaProduktow.add(produkt);
    }

    public void usunProdukt(String nazwa){
        Iterator<Produkt> iterator = listaProduktow.iterator();
        while (iterator.hasNext()) {
            Produkt produktZListy = iterator.next();
            if (produktZListy.getNazwa().equals(nazwa)) {
                iterator.remove();
            }
        }
    }

    public void wypiszProdukt(String nazwa){
        for (int i = 0; i < listaProduktow.size(); i++) {
            if (listaProduktow.get(i).getNazwa().equals(nazwa)) {
                System.out.println(listaProduktow.get(i));
            }
        }
    }

    public void wypiszProdukty(){
        System.out.println(listaProduktow);
    }

    public void dodajPracownika(Pracownik pracownik){
        listaPracownikow.add(pracownik);
    }

    public void usunPracownika(String pesel){
        Iterator<Pracownik> iterator = listaPracownikow.iterator();
        while (iterator.hasNext()) {
            Pracownik pracownikZListy = iterator.next();
            if (pracownikZListy.getPESEL().equals(pesel)) {
                iterator.remove();
            }
        }
    }

    public void wypiszPracownika(String pesel){
        for (int i = 0; i < listaPracownikow.size(); i++) {
            if (listaPracownikow.get(i).getPESEL().equals(pesel)) {
                System.out.println(listaPracownikow.get(i));
            }
        }
    }

    public void wypiszPracownikow(){
        System.out.println(listaPracownikow);
    }

}
