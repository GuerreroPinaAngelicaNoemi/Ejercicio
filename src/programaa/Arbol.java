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
public class Arbol {
    
    private Nodo raiz;
  

    public Arbol( int valor ) {
        this.raiz = new Nodo( valor );
    }
  
    public Arbol( Nodo raiz ) {
        this.raiz = raiz;
    }
  
   
    public Nodo getRaiz() {
        return raiz;
    }
  
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
     
    private void aggNodo( Nodo nodo, Nodo raiz ) {
          if ( raiz == null ) {
          this.setRaiz(nodo);
        }
        else {
                  if ( nodo.getValor() <= raiz.getValor() ) {
               
                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(nodo);
                }
                else {
                    aggNodo( nodo , raiz.getHojaIzquierda() );
                }
            }
            else {
                
                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(nodo);
                }
                else {
                    aggNodo( nodo, raiz.getHojaDerecha() );
                }
            }
        }
    }
  
    public void addNodo( Nodo nodo ) {
        this.aggNodo( nodo , this.raiz );
    }
     
    public int cantidadNodos(Nodo nodo){
        if(nodo == null){
            return 0;
        }
        else{
            return 1 + this.cantidadNodos(nodo.getHojaDerecha())+ this.cantidadNodos(nodo.getHojaIzquierda());
        }
    }
    public int cantidadHojas(Nodo nodo){
        if(nodo == null){
            return 0;
        }
        else{
            if(nodo.getHojaDerecha()== null && nodo.getHojaIzquierda() == null){
                return 1;
            }
            else{
                return this.cantidadHojas(nodo.getHojaIzquierda())+this.cantidadHojas(nodo.getHojaDerecha());  
            }
        }
    }
     
    public int mayor(Nodo nodo){
        if(nodo.getHojaDerecha()==null){
            return nodo.getValor();
        }
        else{
            if(nodo.getValor()>this.mayor(nodo.getHojaDerecha())){
                return nodo.getValor();
            }
            else{
                return this.mayor(nodo.getHojaDerecha());
            }
        }
    }
     
    public void Orden(Nodo nodo){
        if(nodo.getHojaDerecha()!= null){
            Orden(nodo.getHojaDerecha());
        }
        System.out.println(" "+nodo.getValor());
        if(nodo.getHojaIzquierda() != null){
            Orden(nodo.getHojaIzquierda());
        }
    }
       
    public int altura(Nodo nodo){
        if(nodo == null){
            return 0;
        }
        else{
            if(nodo.getHojaDerecha()==null && nodo.getHojaIzquierda()==null){
                return 0;
            }
            else{
                if(this.altura(nodo.getHojaDerecha())>this.altura(nodo.getHojaIzquierda())){
                    return 1+this.altura(nodo.getHojaDerecha());
                }
                else{
                    return 1+this.altura(nodo.getHojaIzquierda());
                }
            }
        }
    }
 
}
