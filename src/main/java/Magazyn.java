import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Magazyn
{
    private List<Pracownik> listaPracownikow = new ArrayList<Pracownik>();
    private List<Produkt> listaProduktow= new ArrayList<Produkt>();

    public void addPracownik(Pracownik pracownik)
    {
        listaPracownikow.add(pracownik);
    }

    public void wpiszPracownika (String nazwa)
    {
        Iterator<Pracownik> iterator = listaPracownikow.iterator();
        while (iterator.hasNext())
        {
            Pracownik pracownikZListy = iterator.next();
            if (pracownikZListy.getPESEL().equals(nazwa))
            {
                iterator.remove();
            }
        }
    }
    public void wypiszPracownika (String nazwa)
    {
        for (int i = 0; i < listaPracownikow.size(); i++)
        {
            if (listaPracownikow.get(i).getPESEL().equals(nazwa))
            {
                System.out.println(listaPracownikow.get(i));
            }
        }
    }

    public void wypiszPracownika1 (String nazwa)
    {
        System.out.println(listaPracownikow);
    }
}

