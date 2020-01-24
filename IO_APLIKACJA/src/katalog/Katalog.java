/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katalog;

import katalog.Filtr;
import katalog.Produkt;
import java.util.ArrayList;
import java.util.Currency;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Random;

/**
 *
 * @author oszust
 */
public class Katalog {
    public List<Produkt> produkty = new ArrayList<>();
    private Filtr filtr = null;
    public Katalog(){};
    void dodanieProduktu(Produkt produkt)
    {
        if(produkt.getCena()<0 || produkt.getIloscStan()<0)
        {
            throw new IllegalFormatCodePointException(0);
        }
        produkty.add(produkt);
    }

    void usuniecieProduktu(int id)
    {
        produkty.remove(id);
    }

    void edycjaProduktu(int id, int rodzajEdycji)
    {
        Random rand = new Random();

        int ilosc = 0;
        double cena = 0;

        switch(rodzajEdycji)
        {
            case 0:
                ilosc = rand.nextInt(40);
                break;
            default:
                cena = rand.nextDouble();
                cena = Math.round(cena*80);
        }

        if(produkty.size() > id)
        {
            Produkt produkt = produkty.get(id);
            switch(rodzajEdycji)
            {
                case 0:
                    produkt.setIloscStan(ilosc);
                    break;
                case 1:
                    produkt.setCena(cena);
                    break;
            }
            produkty.set(id, produkt);
        }
        else
        {
            throw new java.lang.ArrayIndexOutOfBoundsException(0);
        }
    }
    public void filtracja(Filtr filtr){
        String operator = filtr.getOperator();
        String rodzaj = filtr.getRodzaj();
        double wartosc = filtr.getWartosc();
        for (Produkt produkt: this.produkty) {
            if (operator.equals("<")) {
                if (rodzaj.equals("iloscStan")) {
                    int iloscStan = produkt.getIloscStan();
                    if (!(iloscStan < wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
                else if (rodzaj.equals("cena")) {
                    double cena = produkt.getCena();
                 if (!(cena < wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
            }
            else if (operator.equals(">")) {
                if (rodzaj.equals("iloscStan")) {
                    int iloscStan = produkt.getIloscStan();
                    if (!(iloscStan > wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
                else if (rodzaj.equals("cena")) {
                    double cena = produkt.getCena();
                 if (!(cena > wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
            }        
            else if (operator.equals("=")) {
                if (rodzaj.equals("iloscStan")) {
                    int iloscStan = produkt.getIloscStan();
                    if (!(iloscStan == wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
                else if (rodzaj.equals("cena")) {
                    double cena = produkt.getCena();
                 if (!(cena == wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
            }
            else if (operator.equals("<=")) {
               if (rodzaj.equals("iloscStan")) {
                    int iloscStan = produkt.getIloscStan();
                    if (!(iloscStan <= wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
                else if (rodzaj.equals("cena")) {
                    double cena = produkt.getCena();
                 if (!(cena <= wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
            }
              else if (operator.equals(">=")) {
              if (rodzaj.equals("iloscStan")) {
                    int iloscStan = produkt.getIloscStan();
                    if (!(iloscStan >= wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
                else if (rodzaj.equals("cena")) {
                    double cena = produkt.getCena();
                 if (!(cena >= wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
            }
        }
    };
    public Filtr getFiltr(){return this.filtr;}
    public void setFiltr(Filtr filtr){this.filtr = filtr;}
    public void szukanie(String tekst){
    for (Produkt produkt: this.produkty) {
        String nazwa = produkt.getNazwa();
        if (nazwa.indexOf(tekst) == -1)
            produkt.setWidocznosc(false);
    }
    };
    public List<Produkt> getProdukty(){return this.produkty;}
    public void setProdukty(ArrayList<Produkt> produkty){this.produkty = produkty;}
}
