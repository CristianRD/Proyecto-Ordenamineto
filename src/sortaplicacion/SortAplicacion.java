/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortaplicacion;

/**
 *
 * @author KrRD
 */
public class SortAplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] numeros = {4, 6, 2, 1, 86, 32, 8, 13, 67};

        Ordenador ord = new Ordenador();
        ord.insertionSort2(numeros);

        for (int i = 0; i < numeros.length; i++) {
           System.out.println(numeros[i]);
        }
    }
}
