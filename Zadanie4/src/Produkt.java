public class Produkt {

    private int Id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int IloscWMagazynie;

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public String getNazwa(){
        return nazwa;
    }
    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }
    public String getKategoria(){
        return kategoria;
    }
    public void setKategoria(String kategoria){
        this.kategoria = kategoria;
    }
    public double getCena(){
        return cena;
    }
    public void setCena(double cena){
        this.cena = cena;
    }
    public int getIloscWMagazynie(){
        return IloscWMagazynie;
    }
    public void setIloscWMagazynie(int IloscWMagazynie){
        this.IloscWMagazynie = IloscWMagazynie;
    }
    public void wyswietlinformacje(){
        System.out.println("Wyswietl Id " + Id);
        System.out.println("Wyswietl nazwa " + nazwa);
        System.out.println("Wyswietl kategoria " + kategoria);
        System.out.println("Wyswietl cena " + cena);
        System.out.println("IloscWMagazynie " + IloscWMagazynie);
    }


}
