/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katalog;
import wspolne.Interakcjable;
import koszyk.PozycjaKoszyk;
import katalog.Katalog;
import katalog.Filtr;
import katalog.Produkt;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
/**
 *
 * @author oszust
 */
import java.time.Month;
import java.util.ArrayList;

public class ZarzadcaKatalog implements Interakcjable {
    public Katalog katalog = new Katalog();
    public ZarzadcaKatalog(){};
    public List<Produkt> przykladoweProdukty = new ArrayList<Produkt>();

    public void setPrzykladoweProdukty(List<Produkt> przykladoweProdukty) {
        this.przykladoweProdukty = przykladoweProdukty;
    }

    Produkt wprowadzDaneDodawania()
    {
        Random rand = new Random();
        int indeksPrzyklProd = rand.nextInt(przykladoweProdukty.size()-1);
        Produkt produkt = przykladoweProdukty.get(indeksPrzyklProd);
        return produkt;
    }

    public void dodawanieProduktu()
    {
        Produkt produkt = wprowadzDaneDodawania();
        boolean decyzja = potwierdz();

        if(decyzja)
            katalog.dodanieProduktu(produkt);
    }

    void usuwanieProduktu()
    {
        List<Produkt> produkty = katalog.getProdukty();
        Random rand = new Random();
        int id = rand.nextInt(produkty.size()-1);

        if(produkty.size()>id)
        {
            boolean decyzja = potwierdz();
            if(decyzja)
                katalog.usuniecieProduktu(id);
        }
    }

    void edytowanieProduktu()
    {
        List<Produkt> produkty = katalog.getProdukty();
        Random rand = new Random();
        int id = rand.nextInt(produkty.size()-1);
        int rodzajEdycji = rand.nextInt(1);
        katalog.edycjaProduktu(id, rodzajEdycji);
    }

    public void edycjaKatalogu()
    {
        Random rand = new Random();
        int sposobEdycji = rand.nextInt(2);
        switch(sposobEdycji)
        {
            case 0:
                dodawanieProduktu();
            case 1:
                usuwanieProduktu();
            case 2:
                edytowanieProduktu();
        }
    }


    public void wyswietlKatalog(){
    for (Produkt produkt: katalog.getProdukty()) {
        produkt.wyswietlProdukt();
    }
    };
    public PozycjaKoszyk wprowadzDaneWypozyczenia(Produkt produkt){
        PozycjaKoszyk pozycjaKoszyk;
        pozycjaKoszyk = new PozycjaKoszyk(produkt, LocalDate.of(2020, Month.JANUARY, 30), 1);
        return pozycjaKoszyk;
    }
    public void filtruj(){
    boolean wybor = true;
    if (wybor == false)
        return;
    Filtr filtr = this.wprowadzDaneFiltracji();
    boolean odpowiedz = this.potwierdz();
    if (odpowiedz == false)
        return;
    else
        katalog.filtracja(filtr);
    };
    
    public Filtr wprowadzDaneFiltracji(){
    Filtr filtr = new Filtr("cena", 500, "<=");
    return filtr;
    };
    
    public void szukaj(){
    String tekst = this.wprowadzTekst();
    boolean potwierdz = this.potwierdz();
    if (potwierdz == true)
        this.katalog.szukanie(tekst);
    };
    public Produkt wybierzProdukt(){
    List<Produkt> produkty = katalog.getProdukty();
    Random rand = new Random();
    int losowyNumerProduktu = rand.nextInt(produkty.size());
    return produkty.get(losowyNumerProduktu);
    }
    public Katalog getKatalog(){return this.katalog;}
}
