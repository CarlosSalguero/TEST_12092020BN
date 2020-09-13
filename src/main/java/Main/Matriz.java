/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Charly
 */
public class Matriz {
    int [][] matriz;
    int fila;
    int columna; 
    
    public Matriz(int filas, int columnas){
        this.matriz = new int[filas][columnas];
    }
    
    
    public void generarValoresRandomPorColumna(int columna){      
         for (int i = 0 ; i < this.matriz.length; i++) {
             for (int j = columna - 1 ; j < columna; j++) {               
                    this.matriz[i][j] = ThreadLocalRandom.current().nextInt(1, 9 + 1);                           
             }
         }     
    }
    
    public void generarValoresRandomPorFila(int fila){      
         for (int i = fila - 1 ; i < fila ; i++) {
              for (int j = 0; j < this.matriz[0].length; j++) {             
                    this.matriz[i][j] = ThreadLocalRandom.current().nextInt(1, 9 + 1);                           
             }
         }     
    }
    
   
}
