public class Zamowienie {
    private int Id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

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

    public void obliczWartoscZamowienie(){
        double suma = 0;
        if( produkty != null && ilosci != null && produkty.length == ilosci.length){
            for(int i = 0; i < produkty.length; i++){
                suma += produkty[i].getCena() * ilosci[i];
            }
            System.out.println("Cała wartość zamówienia: " + suma );
        }

    }


}
