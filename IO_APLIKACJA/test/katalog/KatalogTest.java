/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katalog;

import org.junit.Before;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import java.lang.ArrayIndexOutOfBoundsException;
import katalog.Katalog;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xavier Davis
 */
@Category({TestControl.class, TestEntity.class})
public class KatalogTest {
    
    Dane dane;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    public KatalogTest() {
    }
    
    @Before
    public void setUp() {
        dane = new Dane();
    }
    
    @Test
    public void testDodanieProduktu(){
        System.out.println("dodanieProduktu");
        Katalog instance = new Katalog();
        for(int i=0; i<8; i++)
        {
            instance.dodanieProduktu(dane.produkty[i]);
            assertTrue(instance.produkty.contains(dane.produkty[i]));
        }
    }
    
    @Test
    public void testEdycjaProduktu(){
        System.out.println("edycjaProduktu");
        Katalog instance = new Katalog();
        for(int i=0; i<8; i++)
        {
            instance.produkty.add(dane.produkty[i]);
        }
        for(int i=0; i<7; i++)
        {
            instance.edycjaProduktu(dane.indeksyEdycji[i], dane.rodzajeEdycji[i]);
            assertEquals(instance.produkty.get(i), dane.produkty[i]);
        }
        exception.expect(ArrayIndexOutOfBoundsException.class);
        exception.expectMessage("0");
        instance.edycjaProduktu(dane.indeksyEdycji[7], dane.rodzajeEdycji[7]);
        
        
    }
}
