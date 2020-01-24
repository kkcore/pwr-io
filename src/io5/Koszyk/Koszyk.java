/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5.Koszyk;

import io5.Aplikacja.Aplikacja;
import io5.Koszyk.Klient;
import io5.Katalog.Produkt;
import io5.Uzytkownik.Uzytkownik;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author oszust
 */
public class Koszyk {
    
    private ArrayList<PozycjaKoszyk> produkty = new ArrayList<>();
    private double koszt = 0;
    
    public Koszyk(){};
    
    public void usunZKoszyka(PozycjaKoszyk pozycja){
    Produkt produkt = pozycja.getProdukt();
    produkt.setIloscStan(produkt.getIloscStan() + pozycja.getIloscWZamowieniu());
    this.produkty.remove(pozycja);
    };
    
    public void setKoszt(double value){this.koszt = value;}
    
    public double getKoszt(){return this.koszt;}
    
    public ArrayList<PozycjaKoszyk> getProdukty() {return this.produkty;}
    
    public void setProdukty(ArrayList<PozycjaKoszyk> produkty) {this.produkty = produkty;}
    
    public void dodajDoKoszyka(PozycjaKoszyk pozycja){
        this.produkty.add(pozycja);
    };
    
    public void aktualizujKosztZamowienia(){
    double koszt = 0;
    for (PozycjaKoszyk pozycja: this.produkty){
        double cena = pozycja.getCenaWZamowieniu();
        koszt+= cena;
    }
    this.koszt = koszt;
    };
    
    public void zmienIlosc(PozycjaKoszyk produkt, int ilosc){
        if (ilosc < 0)
            throw new java.lang.Error("Zmieniana ilość nie może być ujemna");
        produkt.setIloscWZamowieniu(ilosc);
    };
    public void zmienTermin(PozycjaKoszyk produkt, LocalDate termin){
        produkt.setData(termin);
    };
    public void dodajZamowienie(){
    Uzytkownik uzytkownik = Aplikacja.uzytkownik;
    String pozycjeString = "";
    for (PozycjaKoszyk pozycja: produkty) {
        String pozycjaString = pozycja.toString();
        pozycjeString += pozycjaString;
    }
        try {
            FileWriter fileWriter = new FileWriter("zamowienia.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String tekstDoZapisania = String.format("%s||%s\n", uzytkownik.getLogin(), pozycjeString);
            bufferedWriter.append(tekstDoZapisania);
            bufferedWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Koszyk.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    };
    
    public boolean odejmijOdSalda(double koszt){
    Klient uzytkownik = (Klient)Aplikacja.uzytkownik;
    double saldo = uzytkownik.getSaldo();
    if (saldo < koszt) {
        return false;
    }
    uzytkownik.setSaldo(saldo - koszt);
    return true;
    }
    
    public void aktualizujCenePozycji(PozycjaKoszyk pozycja){
    int ilosc = pozycja.getIloscWZamowieniu();
    Produkt produkt = pozycja.getProdukt();
    double cena= produkt.getCena();
    pozycja.setCenaWZamowieniu(cena*ilosc);
    };
    
}
