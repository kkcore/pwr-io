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
public class Koszyk {
    private ArrayList<PozycjaKoszyk> produkty = new ArrayList<>();
    private Currency koszt;
    public Koszyk(){};
    public void wyslijSygnalDoWyswietleniaKatalogu(){};
    public void usunZKoszyka(PozycjaKoszyk produkt){};
    public Currency getKoszt(){return this.koszt;}
    public void setKoszt(Currency value){this.koszt = value;}
    public boolean finalizacja(){return false;}
    
}
