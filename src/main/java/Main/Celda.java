/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Charly
 */
public class Celda {
    private int fila;
    private int columna; 
    private int valor;
    
    public Celda(int fila, int columna, int valor){
        this.fila = fila - 1;
        this.columna = columna - 1;
        this.valor = valor;
    }
    
    public Celda(int fila, int columna){
        this.fila = fila - 1;
        this.columna = columna - 1;
        this.valor = 0;
    }
    
    public Celda(int valor){
        this.fila = 0;
        this.columna = 0;
        this.valor = valor;
    }
    
     public Celda(){
        this.fila = 0;
        this.columna = 0;
        this.valor = 0;
    }
    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
