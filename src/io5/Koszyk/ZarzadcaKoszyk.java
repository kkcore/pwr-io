/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
zmiany w 
-dodajPozycje
-edytujPozycje
-finalizujZamowienie
-usunpozycja
-filtruj
-wyswietlKatalog
-wybierzProdukt
-wprowadzDaneWypozyczenia
-dodajDoKoszyka
-akutalizujKosztZamowienia
-odejmijOdSalda
-dodajZamowienie
-szukanie
-zarzadzajKoszykiem
*/
package io5.Koszyk;

import Wspolne.Interakcjable;
import io5.Koszyk.Koszyk;
import io5.Katalog.ZarzadcaKatalog;
import io5.Katalog.Produkt;
import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author oszust
 */
public class ZarzadcaKoszyk implements Interakcjable {
    private Koszyk koszyk = new Koszyk();
    public ZarzadcaKoszyk(ZarzadcaKatalog zk){
        this.zarzadcaKatalog = zk;
    };
    private ZarzadcaKatalog zarzadcaKatalog;
    public String rodzajEdycjiKoszyka(){ return " ";};
    public void usunPozycje(){
        PozycjaKoszyk pozycja = this.wybierzPozycje();
        boolean odpowiedz = this.potwierdz();
        if (odpowiedz == false)
            return;
        koszyk.usunZKoszyka(pozycja);
        koszyk.aktualizujKosztZamowienia();
    };
    
    public PozycjaKoszyk wybierzPozycje(){
    ArrayList<PozycjaKoszyk> produkty = koszyk.getProdukty();
    Random rand = new Random();
    int losowaLiczba = rand.nextInt(produkty.size());
    return produkty.get(losowaLiczba);
    }
    public int wprowadzWartosc(){
    Random rand = new Random();
    int losowaLiczba = rand.nextInt(100);
    return losowaLiczba;
    }
    public LocalDate wprowadzDate(){return LocalDate.of(2019, 12, 25);}
    public void dodajPozycje(){
       this.zarzadcaKatalog.filtruj();
       this.zarzadcaKatalog.szukaj();
       this.zarzadcaKatalog.wyswietlKatalog();
       Produkt produkt = this.zarzadcaKatalog.wybierzProdukt();
       PozycjaKoszyk pozycjaKoszyk = this.zarzadcaKatalog.wprowadzDaneWypozyczenia(produkt);
       this.koszyk.dodajDoKoszyka(pozycjaKoszyk);
       this.koszyk.aktualizujKosztZamowienia();
    };
    public void edytujPozycje(){
    PozycjaKoszyk pozycja = this.wybierzPozycje();
    String odpowiedz = this.rodzajEdycjiPozycji();
     if (odpowiedz.equals("edycja temirnu")) {
         LocalDate data = this.wprowadzDate();
         if (pozycja.getData().compareTo(data) < 0) 
             throw new java.lang.Error("za wczesna data");
         this.koszyk.zmienTermin(pozycja, data);
         this.koszyk.aktualizujCenePozycji(pozycja);
         this.koszyk.aktualizujKosztZamowienia();
         
     }
     else if (odpowiedz.equals("edycja ilosci")) {
         int ilosc = this.wprowadzWartosc();
         if (ilosc > pozycja.getProdukt().getIloscStan())
              throw new java.lang.Error("za duża ilość");
         this.koszyk.zmienIlosc(pozycja, ilosc);
         this.koszyk.aktualizujCenePozycji(pozycja);
         this.koszyk.aktualizujKosztZamowienia();
     }
    };
    
    public String rodzajEdycjiPozycji(){
     return "edycja terminu";
    }
    public void zarzadzajKoszykiem() {
        ArrayList<PozycjaKoszyk> produkty = koszyk.getProdukty();
        if (produkty.isEmpty())
             this.dodajPozycje();
        else {
            String wybor = this.rodzajEdycjiKoszyka();
            if (wybor.equals("dodaj"))
                this.dodajPozycje();
            else if (wybor.equals("usun"))
                this.usunPozycje();
            else if (wybor.equals("edytuj"))
                this.edytujPozycje();
            else if (wybor.equals("finalizuj")) {
                this.finalizujZamowienie();
                
            }}
    }
    
    public void finalizujZamowienie() {
        boolean odpowiedz = this.potwierdz();
        if (odpowiedz == false)
            return;
        boolean czyOdjeto = this.koszyk.odejmijOdSalda(this.koszyk.getKoszt());
        if (czyOdjeto == false)
            throw new java.lang.Error("Twoje saldo jest za małe na zakup");
        this.koszyk.dodajZamowienie();
    }
    public Koszyk getKoszyk(){return this.koszyk;}
}
