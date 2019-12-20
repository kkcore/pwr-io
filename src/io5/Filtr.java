/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5;

/**
 *
 * @author oszust
 */
public class Filtr {
    private String operator;
    private double wartosc;
    private String rodzaj;
    
    public Filtr(String rodzaj, int wartosc, String operator) {
        this.rodzaj = rodzaj;
        this.wartosc = wartosc;
        this.operator = operator;
    }
    public String getOperator(){return this.operator;}
    public void setOperator(String value){this.operator = value;}
    public double getWartosc(){return this.wartosc;}
    public void setWartosc(double value){this.wartosc = value;}
    public String getRodzaj(){return this.rodzaj;}
    public void setRodzaj(String value){this.rodzaj = value;}

}
