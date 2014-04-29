/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortaplicacion;

import java.util.Random;



/**
 *
 * @author KrRD
 */
public class Ordenador {
  
    
    
public int[] selectionSort(int[] numeros) {
  int j,i,min,temp;
  for(j=0; j < numeros.length-1; j++){
   min=j;
   for(i=j+1; i < numeros.length; i++)
    if(numeros[i] < numeros[min]) min=i;
   if(j!=min){
    temp=numeros[j];
    numeros[j]=numeros[min];
    numeros[min]=temp;
   }
  }
    return numeros;
} 
    
 public int[] insertionSort(int[] numeros) {
  
        int k,i, temp;
        for (k = 1; k < numeros.length; k++) {
            temp = numeros[k];
            i = k;
            while (i > 0 && temp < numeros[i - 1]) {
                numeros[i] = numeros[i - 1];i--;
            }
            numeros[i] = temp;
        }
    return numeros;
    }

public void insertionSort2(int numeros[]){

    int num,numa,temp;
    
    for(num=1;num<numeros.length;num++){
        
        temp=numeros[num];
        for(numa=num-1;numa>=0 &&numeros[numa]>temp;numa--){
          numeros[numa+1]=numeros[numa];
          numeros[numa]=temp;
        }
    }
}
    
public void selectionSort2(int numeros[]){
 
    for (int i=0; i<numeros.length-1; i++) {
        for (int j=i+1; j<numeros.length; j++) {
            if (numeros[i] > numeros[j]) {
                //Elementos de intercambio
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }
    }
}
public void selectionSort3(int numeros[]){
     for (int i=0; i<numeros.length-1; i++) {
        int men= i;     // valor mas pequeño 
        for (int j=i+1; j<numeros.length; j++) {
            if (numeros[men] > numeros[j]) {
                men = j;  //este el nuevo número menor
            }
        }
        if (men != i) { 
            
            int temp = numeros[i];
            numeros[i] = numeros[men];
            numeros[men] = temp;
        }
    }
}
public int[] bubbleSort(int[] numeros) {
 
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < numeros.length - 1; i++) {

                if (numeros[i] > numeros[i + 1]) {
                    temp = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temp;
                    flag = true;

                }
            }
        }
    return numeros;
  }
 public int[] BogoSort(int[] numeros){
        Random rnd = new Random();
        while(true){
            boolean sorted = true;
            for(int i = 0; i < numeros.length-1; i++)
                if(numeros[i] > numeros[i+1]){
                    sorted = false;
                    break;
                }
            if (sorted)
                return numeros;
            for(int i = numeros.length - 1; i > 0; i--){
                int rand = rnd.nextInt(i);
                int temp = numeros[i];
                numeros[i] = numeros[rand];
                numeros[rand] = temp;
            }
    }
}
}




