package com.colegiomagico.reto7;

/**
 * Retorna el número mayor dentro del arreglo de tamaños.
 */
public class CofreVaritas {

    public static int varitaMasPoderosa(int[] tamanos) {
        int mayor = tamanos[0]; 

        for (int tamano : tamanos) { 
            if (tamano > mayor) {
                mayor = tamano; 
            }
        }

        return mayor;
    }
    

    public static void main(String[] args) {
        int[] varitas = {10, 15, 8};
        System.out.println("Poderosa: " + varitaMasPoderosa(varitas));
    }
}
