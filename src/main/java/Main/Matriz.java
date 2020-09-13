/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Charly
 */
public class Matriz {
    private int [][] matriz;
    private int fila;
    private int columna; 
    
    public Matriz(int filas, int columnas){
        this.matriz = new int[filas][columnas];
    }
    
    
    public void generarValoresRandomColumna(int columna){      
         for (int i = 0 ; i < this.getMatriz().length; i++) {
             for (int j = columna - 1 ; j < columna; j++) {               
                 this.getMatriz()[i][j] = ThreadLocalRandom.current().nextInt(1, 9 + 1);                           
             }
         }     
    }
    
    public void generarValoresRandomPorFila(int fila){      
         for (int i = fila - 1 ; i < fila ; i++) {
              for (int j = 0; j < this.getMatriz()[0].length; j++) {             
                  this.getMatriz()[i][j] = ThreadLocalRandom.current().nextInt(1, 9 + 1);                           
             }
         }     
    }
    
   public int sumarColumnas(int[] columnas, int columnaResultado){
       int resultadoSuma = 0;

        for (int i = 0; i < this.matriz.length; i++) {
            this.matriz[i][columnaResultado - 1] = 0;
            for (int j = 0; j < this.matriz[0].length; j++) { 
                for (int k = 0; k < columnas.length; k++) {
                    if (j == (columnas[k]-1)){
                        this.matriz[i][columnaResultado - 1] += this.matriz[i][j];
                    }
                }
            }
            resultadoSuma += this.matriz[i][columnaResultado - 1];
       }
       return resultadoSuma;
   }
    
   public void agregarFilasAMatriz(int filas){
       int[][] nuevaMatriz = new int[this.getMatriz().length + filas][this.getMatriz()[0].length];
       for (int i = 0; i < this.getMatriz().length; i++) {
            for (int j = 0; j < this.getMatriz()[0].length; j++) {
                nuevaMatriz[i][j] = getMatriz()[i][j];
            }
        }     
       this.setMatriz(nuevaMatriz);
   }
   
   public void agregarColumnasAMatriz(int columnas){
       int[][] nuevaMatriz = new int[this.getMatriz().length][this.getMatriz()[0].length + columnas];
       for (int i = 0; i < this.getMatriz().length; i++) {
            for (int j = 0; j < this.getMatriz()[0].length; j++) {
                nuevaMatriz[i][j] = getMatriz()[i][j];
            }
        }     
       this.setMatriz(nuevaMatriz);
   }
   
    public void redimensionarMatriz(int filas, int columnas){
         int[][] nuevaMatriz = new int[filas][columnas];
         
         for (int i = 0; i < getMatriz().length; i++) {
            for (int j = 0; j < getMatriz()[0].length; j++) {
                nuevaMatriz[i][j] = getMatriz()[i][j];
            }
        }
        // return nuevaMatriz;
     }
    
    public void imprimirMatriz(String mensaje){
         System.out.println(">>>>>>>>   " +mensaje + "   <<<<<<<<");
         for (int i = 0; i < this.getMatriz().length; i++) {
             System.out.print("[");
            for (int j = 0; j < this.getMatriz()[0].length; j++) {
                System.out.print(this.getMatriz()[i][j]);
                if(j < this.getMatriz()[0].length - 1){
                    System.out.print(",");
                }else
                {
                    System.out.print("]");
                }
            }
            System.out.println("");
        }
     }
    
    public Celda obtenerCelda(int fila, int columna){
        Celda celda = new Celda(fila, columna);
        celda.setValor(this.matriz[fila - 1][columna - 1]);        
        return celda;
    }
    
    public void copiarCelda(Celda origen, Celda destino){
        this.matriz[destino.getFila()][destino.getColumna()] = origen.getValor();
    }

    public void eliminarCelda(Celda destino){
        this.matriz[destino.getFila()][destino.getColumna()] = 0;
    }
    
    public void copiarValorPorRango(int filaInicio, int filaFin, int columnaInicio, int columnaFin, int valor){
        for (int i = filaInicio - 1; i < filaFin; i++) {
            for (int j = columnaInicio - 1; j < columnaFin; j++) {
                this.matriz[i][j] = valor;
            }
        }
    }
    

    /**
     * @return the matriz
     */
    public int[][] getMatriz() {
        return matriz;
    }

    /**
     * @param matriz the matriz to set
     */
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
}
