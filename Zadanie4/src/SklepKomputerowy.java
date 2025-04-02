import org.w3c.dom.ls.LSOutput;

public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[20];
    private Klient[] klienci = new Klient[20];
    private Zamowienie[] zamowienia = new Zamowienie[20];
    private int liczbaProduktow = 0;
    private int liczbaKlientow = 0;
    private int liczbaZamowien = 0;


    //metody
    public void dodajProdukt(Produkt produkt) {
        liczbaProduktow++;
        produkty[liczbaProduktow - 1] = produkt;

    }

    public void dodajKlienta(Klient klient) {
        liczbaKlientow++;
        klienci[liczbaKlientow - 1] = klient;

    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        liczbaZamowien++;
        Zamowienie zamowienie = new Zamowienie(klient, produkty, ilosci);
        zamowienie.setKlient(klient);
        zamowienie.setProdukty(produkty);
        zamowienie.setIlosci(ilosci);
        zamowienie.setDataZamowienia(java.time.LocalDate.now().toString());
        zamowienie.setStatus("Nowe");
        zamowienie.obliczWartoscZamowienia();
        zamowienia[liczbaZamowien - 1] = zamowienie;
        return zamowienie;
    }
    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < produkty.length; i++) {
          for (int j = 0; j < zamowienie.getProdukty().length; j++) {
            if(produkty[i] == zamowienie.getProdukty()[j]){
                int ilosc = produkty[i].getIloscWMagazynie() - zamowienie.getIlosci()[j];
                produkty[i].setIloscWMagazynie(ilosc);

                System.out.println(produkty[i].getIloscWMagazynie());
            }
          }
        }
    }

    public void  zmienStatusZamowienia(int idZamowienia, String nowyStatus){
        zamowienia[idZamowienia].setStatus(nowyStatus);

    }

    public void  wyswietlProduktyWKategorii(String kategoria) {
    if(produkty == null || produkty.length == 0){
        System.out.println("Brak produktów");
        return;
    }


    }
    public void  wyswietlZamowieniaKlienta(int idKlienta){
        for (int i = 0; i < liczbaZamowien; i++){
            Zamowienie zamowienie = zamowienia[i];
            if(zamowienie.getKlient().getId() == idKlienta){
                zamowienie.wyswietlSzczegoly();
            }
        }
    }





}