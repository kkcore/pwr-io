/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5;

import java.util.Currency;

/**
 *
 * @author oszust
 */
public class Klient {
    int id;
    String login;
    Currency saldo;
    String idSesji;
    public void setId(int value){this.id = value;}
    public int getId(){return this.id;}
    public void setLogin(String value){this.login = value;}
    public String getLogin(){return this.login;}
    public void setSaldo(Currency value){this.saldo = value;}
    public Currency getSaldo(){return this.saldo;}
    public String getIdSesji(){return this.idSesji;}
    public void setIdSesji(String value){this.idSesji = value;}
    
}
