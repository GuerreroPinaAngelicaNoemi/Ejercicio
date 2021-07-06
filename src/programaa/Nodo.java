/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaa;

/**
 *
 * @author angel
 */
public class Nodo {
  
    private int valor;
  
    private Nodo padre;
    private Nodo hojaIzquierda;
    private Nodo hojaDerecha;
  
   
    public Nodo(int valor) {
        this.valor = valor;
    }
  
    public void setValor(int valor) {
        this.valor = valor;
    }
  
    public int getValor() {
        return valor;
    }
  
    public Nodo getPadre() {
        return padre;
    }
  
    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
  
    public Nodo getHojaIzquierda() {
        return hojaIzquierda;
    }
  
    public void setHojaIzquierda(Nodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }
  
    public Nodo getHojaDerecha() {
        return hojaDerecha;
    }
  
    public void setHojaDerecha(Nodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }
}