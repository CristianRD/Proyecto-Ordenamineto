/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sortaplicacion.Ordenador;

/**
 *
 * @author KrRD
 */
public class OrdenamientosTest {
    
    Ordenador bogo;
    Ordenador bubble;
    Ordenador insertion;
    Ordenador selection;
    int[] Desordenado = {5,7,8,3,1,4,10,9,6,2};
    int[] Ordenado = {1,2,3,4,5,6,7,8,9,10};
    
    public OrdenamientosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    
    bogo = new Ordenador();
    bubble = new Ordenador();
    insertion = new Ordenador();
    selection = new Ordenador();
    
    }
    
    @After
    public void tearDown() {
        bogo = null;
        bubble = null;
        insertion = null;
        selection = null;
    
    }

   
     
     @Test
    public void selectionSort() {
        int[] Orden = selection.selectionSort(Desordenado);
        for(int i= 0; i<Desordenado.length; i++){
            assertEquals(Ordenado[i], Orden[i]);
        }
    }
   @Test
    public void insertionSort() {
        int[] Orden = insertion.insertionSort(Desordenado);
        for(int i= 0; i<Desordenado.length; i++){
            assertEquals(Ordenado[i], Orden[i]);  
     
}
    }

@Test
    public void bubbleSort() {
        int[] Orden = bubble.bubbleSort(Desordenado);
        for(int i= 0; i<Desordenado.length; i++){
            assertEquals(Ordenado[i], Orden[i]);
        }
    }
@Test
    public void bogoSort() {
        int[] Orden = bogo.BogoSort(Desordenado);
        for(int i= 0; i<Desordenado.length; i++){
            assertEquals(Ordenado[i], Orden[i]);
        }
    }
}