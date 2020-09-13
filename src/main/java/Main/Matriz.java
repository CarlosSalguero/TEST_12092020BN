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
    
    
    public void generarValoresRandomColumna(int columna){      
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
    
   public int sumarDosColumnas(int columna1, int columna2, int columnaResultado){
   
        int resultadoSuma = 0;
        //-----------INICIO -> METODO 2 --------------
        int [] tmpColumna1 = obtenerColumna(1);
        int [] tmpColumna2 = obtenerColumna(2);
        for (int i = 0; i < tmpColumna1.length; i++) {
           resultadoSuma += this.matriz[i][columnaResultado - 1] = tmpColumna1[i] +tmpColumna2[i];
       }
       //------------FIN -> METODO 2 -----------------
       
       //-----------INICIO -> METODO 1 --------------
//        for (int i = 0; i < this.matriz.length; i++) {
//           for (int j = 0; j < this.matriz[0].length; j++) {
//               if ( j == columnaResultado - 1){
//                   resultadoSuma += matriz[i][j] = this.matriz[i][columna1-1] + this.matriz[i][columna2-1];
//               }
//           }
//        }
       //------------FIN -> METODO 1 -----------------
       return resultadoSuma;
   }
   
   private int[] obtenerColumna(int columna){
       int[] tmpcolumna = new int[this.matriz.length];
       
       for (int i = 0; i < this.matriz.length; i++) {
           for (int j = columna - 1; j < columna; j++) {
               tmpcolumna[i] = this.matriz[i][j];
           }
       }
       return tmpcolumna;
   }
   
   
   public void agregarFilasAMatriz(int filas){
       int[][] nuevaMatriz = new int[this.matriz.length + filas][this.matriz[0].length];
       for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[0].length; j++) {
                nuevaMatriz[i][j] = matriz[i][j];
            }
        }     
       this.matriz = nuevaMatriz;
   }
   
   public void agregarColumnasAMatriz(int columnas){
       int[][] nuevaMatriz = new int[this.matriz.length][this.matriz[0].length + columnas];
       for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[0].length; j++) {
                nuevaMatriz[i][j] = matriz[i][j];
            }
        }     
       this.matriz = nuevaMatriz;
   }
   
    public void redimensionarMatriz(int filas, int columnas){
         int[][] nuevaMatriz = new int[filas][columnas];
         
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                nuevaMatriz[i][j] = matriz[i][j];
            }
        }
        // return nuevaMatriz;
     }
    
    public void imprimirMatriz(String mensaje){
         System.out.println(">>>>>>>>   " +mensaje + "   <<<<<<<<");
         for (int i = 0; i < this.matriz.length; i++) {
             System.out.print("[");
            for (int j = 0; j < this.matriz[0].length; j++) {
                System.out.print(this.matriz[i][j]);
                if(j < this.matriz[0].length - 1){
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
