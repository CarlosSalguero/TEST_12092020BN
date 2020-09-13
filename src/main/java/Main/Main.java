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
        total =  miMatriz.sumarDosColumnas(1, 2, 3);
        
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
        miMatriz.imprimirMatriz("Se copian celdas ((1,1)(2,1)) -> ((11,1),(12,1))");
               
        //=== Calcular el total de las filas 1 y 2 columna 2
        
        Celda opera1 = new Celda();
        Celda opera2 = new Celda();
        //Obteniendo fila (1,2)
        opera1 = miMatriz.obtenerCelda(1,2);
        //Obteniendo fila (2,2)
        opera2 = miMatriz.obtenerCelda(2,2);
        
        total = opera1.getValor() + opera2.getValor();
        System.out.println("================================");
        System.out.println("La suma de las celdas (1,2) y (2,2) es: " + total);
        System.out.println("================================");
     }
     
     
//     public int[][] copiarCelda(){
//         
//         
//     }
     
     public int[][] redimensionarMatriz(int[][] matriz,int filas, int columnas){
         int[][] nuevaMatriz = new int[filas][columnas];
         
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                nuevaMatriz[i][j] = matriz[i][j];
            }
        }
         return nuevaMatriz;
     }
     
     public int[][] inicializarMatriz(int[][] matriz, int filas, int columnas){
          for (int i = 0; i < filas ; i++) {
             for (int j = 0; j < columnas; j++) {
                  matriz[i][j] = 0;                
             }
         } 
          return matriz;
     }
     

}
