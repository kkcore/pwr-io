/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wspolne;
import java.util.Random;
/**
 *
 * @author oszust
 */
public interface Interakcjable {
    public default boolean potwierdz() {
        return true;
    } 
    public default int wprowadzWartosc() {
        Random rand = new Random();
        int losowaLiczba = rand.nextInt(100);
        return losowaLiczba;
    }
    public default String wprowadzTekst() {
        return "Scyzoryk";
    }
}
