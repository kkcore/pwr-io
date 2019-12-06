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
public class Uzytkownik {
    protected int id;
    protected String login;
    protected String idSesji;
    public String getIdSesji(){return idSesji;}
    public void setIdSesji(String value){this.idSesji = value;}
    public String getLogin(){return login ;}
    public void setLogin(String value){this.login = value;}
    public int getId(){return id;}
    public void setId(int value){id = value;} 
}
