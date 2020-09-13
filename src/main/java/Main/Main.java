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
         // Matriz 10x3
         int matriz[][] = new int[10][3];
         System.out.println("Se crea matriz de 10x3 y se inicializa");
         
         matriz = inicializarMatriz(matriz, 10, 3);
         imprimirMatriz(matriz,">>>>   Inicializando matriz  <<<<");
         
         // Agregando datos aletatorios a columna 1 y 2
         //Random random = new Random();
         for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 3; j++) {
                 if (j < 2){
                    matriz[i][j] = ThreadLocalRandom.current().nextInt(1, 9 + 1);
                 }else
                 {
                      matriz[i][j] = 0;
                 }                
             }
         }
         imprimirMatriz(matriz,">>>>   Agregando datos predeterminados a columna 1 y 2   <<<<");
         // Agregando a columna 3 la suma de la columna 1 y 2
         
         int total = 0;
         for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 3; j++) {
                 if (j == 2){
                     
                    total += matriz[i][j] = matriz[i][j-2] + matriz[i][j-1];
                    
                 }           
             }
         }
         
          imprimirMatriz(matriz,">>>>   Agregando a columna 3 la suma de la columna 1 y 2   <<<<");
          System.out.println("================================");
          System.out.println("El total de la suma es: " + total);
          System.out.println("================================");
     
     // redimensionando matriz
     
//     int matriz2[][] = new int[12][3];
//     
//        matriz2 = matriz.clone();
//      imprimirMatriz(matriz2,">>>>  imprimiendo matriz 2  <<<<");
//     
     
     
     }
     
     public int[][] inicializarMatriz(int[][] matriz, int filas, int columnas){
          for (int i = 0; i < filas ; i++) {
             for (int j = 0; j < columnas; j++) {
                  matriz[i][j] = 0;                
             }
         } 
          return matriz;
     }
     
     public void imprimirMatriz(int[][] matriz, String mensaje){
         // imprimir matriz
         System.out.println(mensaje);
         for (int i = 0; i < 10; i++) {
             System.out.print("[");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                if(j < 2){
                    System.out.print(",");
                }else
                {
                    System.out.print("]");
                }
            }
            System.out.println("");
        }
     }
}
