public class Klient {
private int Id;
private String imie;
private String Nazwisko;
private String Email;
private boolean czyStaly;

public int getId(){
    return Id;
}
public String getImie(){
    return imie;
}
public String getNazwisko(){
    return Nazwisko;
}
public String getEmail(){
    return Email;
}
public boolean getCzyStaly(){
    return czyStaly;
}
public void setId(int id){
    this.Id = Id;
}
public void setImie(String imie){
    this.imie = imie;
}
public void setNazwisko(String nazwisko){
    this.Nazwisko = nazwisko;
}
public void setEmail(String email){
    this.Email = email;
}
public void setCzyStaly(boolean czyStaly){
    this.czyStaly = czyStaly;
}
public void wyswietlInformacje(){
    System.out.println(" Id: " + Id + " Imie: " + imie + " Nazwisko: " + Nazwisko + " Email: " + Email + " CzyStaly: " + czyStaly);

}




}
