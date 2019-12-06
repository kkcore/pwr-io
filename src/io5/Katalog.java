/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5;

import java.util.ArrayList;
import java.util.Currency;

/**
 *
 * @author oszust
 */
public class Katalog {
    private ArrayList<Produkt> produkty = new ArrayList<>();
    public Katalog(){};
    public void dodanieProduktu(Produkt produkt){};
    public void usuniecieProduktu(int id){};
    public Produkt wyszukanieProduktu(int id){return new Produkt();};
    public void zmianaCenyProduktu(Currency cena, int id){};
    public void zmianaIlosciNaStanie(int ilosc, int id){};
    
}
