/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Charly
 */
public class Main {
     public static void main(String[] args) {
         //System.out.println("Hello world");
        
         Main init = new Main();
         
        init.funcion();
    }
     
     public void funcion(){

         System.out.println("Se crea matriz de 10x3 y se inicializa");
         Matriz miMatriz = new Matriz(10,3);
         
         //imprimirMatriz(miMatriz.matriz,">>>>   Inicializando matriz  <<<<");
        
        // Agregando datos predeterminados a columnas 1 y 2 
        miMatriz.generarValoresRandomColumna(1);
        miMatriz.generarValoresRandomColumna(2);

        miMatriz.imprimirMatriz("Agregando datos predeterminados a columna 1 y 2");
        // Creando variable total
        int total = 0;
        // Realizando la suma de columna 1 y 2, resultado se almacena en columna 3
        int [] columnas = new int[]{1,2};
        total =  miMatriz.sumarColumnas(columnas, 3);
        
        miMatriz.imprimirMatriz("Agregando a columna 3 la suma de la columna 1 y 2");
        System.out.println("================================");
        System.out.println("La suma de los valores de la columna 3 es: " + total);
        System.out.println("================================");
     
     // redimensionando matriz
        miMatriz.agregarFilasAMatriz(2);
        miMatriz.imprimirMatriz("Se redimensiona matriz, se agregan 2 filas vacias");
        miMatriz.agregarColumnasAMatriz(1);
        miMatriz.imprimirMatriz("Se redimensiona matriz, se agrega 1 columna vacia");
        
        // Trasladando los valores de fila 1 y 2 [columna 1] hacia las nuevas filas 
        Celda origen1 = new Celda();
        Celda origen2 = new Celda();
        
        // celda (1,1)
        origen1 = miMatriz.obtenerCelda(1,1);
        // celda (2,1)
        origen2 = miMatriz.obtenerCelda(2,1);
        // Celdas Destino (11,1)
        Celda destino1 = new Celda(11,1);
        // Celdas Destino (12,1)
        Celda destino2 = new Celda(12,1);
        
        //Copiando Celdas (1,1) a (11,1)
        miMatriz.copiarCelda(origen1, destino1);
        //Copiando Celdas (2,1) a (12,1)
        miMatriz.copiarCelda(origen2, destino2);
        miMatriz.imprimirMatriz("Se copian valores (fila 1, fila 2) columna 1 hacia fila 11 y 12 columna 1");
               
        //=== Calcular el total de las filas 1 y 2 columna 2
        
        Celda opera1 = new Celda();
        Celda opera2 = new Celda();
        //Obteniendo fila (1,2)
        opera1 = miMatriz.obtenerCelda(1,2);
        //Obteniendo fila (2,2)
        opera2 = miMatriz.obtenerCelda(2,2);
        
        total = opera1.getValor() + opera2.getValor();
        System.out.println("================================");
        System.out.println("La suma de la fila 1, fila 2 (columna 2) es: " + total);
        System.out.println("================================");
        
        // === Eliminar  valores de la fila 1,2 columna 2
        // celda (1,2)
        Celda eliminar1 = new Celda(1,2);
        miMatriz.eliminarCelda(eliminar1);
        // celda (2,2)
        Celda eliminar2 = new Celda(2,2);
        miMatriz.eliminarCelda(eliminar2);
        miMatriz.imprimirMatriz("Se eliminan fila 1, fila 2 (columna 2)");
        
        // Dividir el total del inciso anterior y colocar en partes iguales en la fila 3 a 7 columna 4
        int valorMitad = total/2;
        miMatriz.copiarValorPorRango(3, 7, 4, 4, valorMitad);
        miMatriz.imprimirMatriz(" Dividir el total del inciso anterior y colocar en partes iguales en la fila 3 a 7 columna 4");
        
        //llenar la columna 3 con la suma de las columnas 1, 2 y 4
        columnas = new int[]{1,2,4};
        total =  miMatriz.sumarColumnas(columnas, 3);
        miMatriz.imprimirMatriz("llenar la columna 3 con la suma de las columnas 1, 2 y 4");
         
        System.out.println("================================");
        System.out.println("La suma de los valores de la columna 3 es: " + total);
        System.out.println("================================");
     }
     

}
