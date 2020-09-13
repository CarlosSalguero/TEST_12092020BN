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
         
         int total = 0;
         //Dada una matriz de 10x3 [filas y columnas]
         //los indices de una matriz inician en (0,0) pero para efectos prácticos se crea la matriz con un indice de mas para facilitar la comprension de las operaciones en base a los requerimientos.
         System.out.println("Se crea matriz de 10x3");
         Matriz miMatriz = new Matriz(10,3);
         
        
        // Agregando datos predeterminados a columnas 1 y 2 
        miMatriz.generarValoresRandomColumna(1);
        miMatriz.generarValoresRandomColumna(2);
        miMatriz.imprimirMatriz("Agregando datos predeterminados a columna 1 y 2");
        
        
        // llenar la columna 3 con la suma de las columnas 1 y 2
        int [] columnas = new int[]{1,2};
        miMatriz.sumarColumnas(columnas, 3);
        //miMatriz.imprimirMatriz("Agregando a columna 3 la suma de la columna 1 y 2");
        
        
        //Calcular el total de la columna 3 en la variable total
        total = miMatriz.sumarValoresDeColumna(3);
        System.out.println("================================");
        System.out.println("La suma de los valores de la columna 3 es: " + total);
        System.out.println("================================");
     
        
     // redimensionando matriz
        miMatriz.agregarFilasAMatriz(2);
        //miMatriz.imprimirMatriz("Se redimensiona matriz, se agregan 2 filas vacias");
        miMatriz.agregarColumnasAMatriz(1);
        //miMatriz.imprimirMatriz("Se redimensiona matriz, se agrega 1 columna vacia");
        miMatriz.imprimirMatriz("Se redimensiona matriz, se agregan 2 filas y 1 columna");
        
        
        // Trasladando los valores de fila 1 y fila 2 --> [columna 1] hacia las nuevas filas 
        Celda origen1 = new Celda();
        Celda origen2 = new Celda();       
        // fila 1 columna 1
        origen1 = miMatriz.obtenerCelda(1,1);
        // fila 2 columna 1
        origen2 = miMatriz.obtenerCelda(2,1);
        // fila 11 columna 1 Destino
        Celda destino1 = new Celda(11,1);
        // fila 12 columna 1 Destino
        Celda destino2 = new Celda(12,1);
        
        
        //Copiando Celda -> fila 1 columna 1 a fila 11 columna 1
        miMatriz.copiarCelda(origen1, destino1);
        //Copiando Celda -> fila 2 columna 1 a fila 12 columna 1
        miMatriz.copiarCelda(origen2, destino2);
        //miMatriz.imprimirMatriz("Se copian valores (fila 1, fila 2) columna 1 hacia fila 11 y 12 columna 1");
             
        
        //Calcular el total de las (filas 1 y 2) columna 2        
        Celda operador1 = new Celda();
        Celda operador2 = new Celda();
        //Obteniendo fila 1 columna 2
        operador1 = miMatriz.obtenerCelda(1,2);
        //Obteniendo fila 2 columna 2
        operador2 = miMatriz.obtenerCelda(2,2);       
        total = operador1.getValor() + operador2.getValor();
//        System.out.println("================================");
//        System.out.println("La suma de la fila 1, fila 2 (columna 2) es: " + total);
//        System.out.println("================================");
        

        //Eliminar  valores de la fila 1,2 columna 2
        // celda fila 1 columna 2
        Celda eliminar1 = new Celda(1,2);
        miMatriz.eliminarCelda(eliminar1);
        // celda fila 2 columna 2
        Celda eliminar2 = new Celda(2,2);
        miMatriz.eliminarCelda(eliminar2);
        //miMatriz.imprimirMatriz("Se eliminan fila 1, fila 2 (columna 2)");
        
        
        // Dividir el total del inciso anterior y colocar en partes iguales en la fila 3 a 7 columna 4
        int valorPartesIguales = total/5;
        //System.out.println(valorPartesIguales);
        miMatriz.copiarValorPorRango(3, 7, 4, 4, valorPartesIguales);
        //miMatriz.imprimirMatriz(" Dividir el total del inciso anterior y colocar en partes iguales en la fila 3 a 7 columna 4");
        
        
        //llenar la columna 3 con la suma de las columnas 1, 2 y 4
        columnas = new int[]{1,2,4};
        miMatriz.sumarColumnas(columnas, 3);
        //miMatriz.imprimirMatriz("llenar la columna 3 con la suma de las columnas 1, 2 y 4");
        
        
        //Calcular el total de la columna 3 en la variable total
        total = miMatriz.sumarValoresDeColumna(3);
        
        //Mostrar la variable total
        System.out.println("================================");
        System.out.println("La suma de los valores de la columna 3 es: " + total);
        System.out.println("================================");
        
        //Mostrar matriz con los datos
        miMatriz.imprimirMatriz("Matriz final");
     }
     

}
