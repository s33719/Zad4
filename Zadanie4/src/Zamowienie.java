public class Zamowienie {
    private int Id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;
    private double wartosc;

    public Zamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        this.klient = klient;
        this.produkty = produkty;
        this.ilosci = ilosci;
    }

    //gettery i settery
    public int getId(){
        return Id;
    }
    public Klient getKlient(){
        return klient;
    }
    public Produkt[] getProdukty(){
        return produkty;
    }
    public int[] getIlosci(){
        return ilosci;
    }
    public String getDataZamowienia(){
        return dataZamowienia;
    }
    public String getStatus(){
        return status;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public void setKlient(Klient klient){
        this.klient = klient;
    }
    public void setProdukty(Produkt[] produkty){
        this.produkty = produkty;
    }
    public void setIlosci(int[] ilosci){
        this.ilosci = ilosci;
    }
    public void setDataZamowienia(String dataZamowienia){
        this.dataZamowienia = dataZamowienia;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public double getWartosc(){
        return wartosc;
    }

    public void setWartosc(double wartosc){
        this.wartosc = wartosc;
    }


    //metody
    public void obliczWartoscZamowienia() {
        for (int i = 0; i < produkty.length; i++) {
            if (produkty[i] != null) {
                wartosc += produkty[i].getCena() * ilosci[i];
            }
        }
    }
    public void zastosujZnizke(){
        if(klient.getCzyStaly()){
            wartosc *= 0.9;
        }

    }
    public void wyswietlSzczegoly(){
       int ile = 0;
       for (int i = 0; i < ilosci.length; i++) {
           ile += ilosci[i];

       }
        System.out.println("Zamowienie ID: " + Id + ", Status: " + status);
        System.out.println("Zamowienie Klient: " + klient.getImie() + " " + klient.getNazwisko());
        for ( int i = 0; i<produkty.length; i++){
            System.out.println("  " + produkty[i].getNazwa() + " " + ilosci[i]);
        }
        System.out.println("Łączna wartość " + wartosc);
    }


}
