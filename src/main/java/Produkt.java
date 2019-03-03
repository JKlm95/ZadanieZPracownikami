public class Produkt {
    private String nazwa;
    private double cena_netto;
    private double podatek_VAT;

    public Produkt(String nazwa, double cena_netto, double podatek_VAT) {
        this.nazwa = nazwa;
        this.cena_netto = cena_netto;
        this.podatek_VAT = podatek_VAT;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena_netto() {
        return cena_netto;
    }

    public void setCena_netto(double cena_netto) {
        this.cena_netto = cena_netto;
    }

    public double getPodatek_VAT() {
        return podatek_VAT;
    }

    public void setPodatek_VAT(double podatek_VAT) {
        this.podatek_VAT = podatek_VAT;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena_netto=" + cena_netto +
                ", podatek_VAT=" + podatek_VAT +
                '}';
    }
}
