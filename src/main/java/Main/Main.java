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

        //imprimirMatriz(miMatriz.matriz,">>>>   Agregando datos predeterminados a columna 1 y 2   <<<<");
        miMatriz.imprimirMatriz("Agregando datos predeterminados a columna 1 y 2");
        int total = 0;
        total =  miMatriz.sumarDosColumnas(1, 2, 3);
//         // Agregando a columna 3 la suma de la columna 1 y 2
//         

//         for (int i = 0; i < 10; i++) {
//             for (int j = 0; j < 3; j++) {
//                 if (j == 2){
//                     
//                    total += matriz[i][j] = matriz[i][j-2] + matriz[i][j-1];
//                    
//                 }           
//             }
//         }
//         
      //imprimirMatriz(miMatriz.matriz,">>>>   Agregando a columna 3 la suma de la columna 1 y 2   <<<<");
        miMatriz.imprimirMatriz("Agregando a columna 3 la suma de la columna 1 y 2");
        System.out.println("================================");
        System.out.println("El total de la suma de columna 3 es: " + total);
        System.out.println("================================");
     
     // redimensionando matriz
        miMatriz.agregarFilasAMatriz(2);
        //imprimirMatriz(miMatriz.matriz,">>>>  Se redimensiona matriz, se agregan 2 filas vacias  <<<<");
        miMatriz.imprimirMatriz("Se redimensiona matriz, se agregan 2 filas vacias");
        miMatriz.agregarColumnasAMatriz(1);
        //imprimirMatriz(miMatriz.matriz,">>>>  Se redimensiona matriz, se agregan 1 columna  <<<<");
        miMatriz.imprimirMatriz("Se redimensiona matriz, se agregan 1 columna");
     
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
