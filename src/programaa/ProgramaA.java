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
import java.util.Random;
 import java.util.Scanner;
public class ProgramaA{
    public static void main(String[] args) {
        int numero;
        Nodo nodo;
       Random generador = new Random();
        
        System.out.println("\nDame la cantidad de nodos: ");
     Scanner entrada= new Scanner(System.in);
     int tam= entrada.nextInt();
     System.out.println("\nDame la altura: ");
     Scanner altura= new Scanner(System.in);
     int al= entrada.nextInt();
      Arbol arbol = new Arbol(al);
        for(int i = 0; i < tam; i++){
           numero = (int) (Math.random() * tam) + 1;
           System.out.println(numero);
           nodo = new Nodo(numero);
           arbol.addNodo(nodo);
        }
       
        System.out.println("Impresion en Orden");
        arbol.Orden(arbol.getRaiz());
        System.out.println("\nLa cantidad de nodos del arbol son: "+arbol.cantidadNodos(arbol.getRaiz()));
        System.out.println("La cantidad de hojas del arbol que tiene: "+arbol.cantidadHojas(arbol.getRaiz()));
        System.out.println("La profundidad del arbol es: "+(arbol.altura(arbol.getRaiz())));
    System.out.println("La altura  del arbol es: "+arbol.mayor(arbol.getRaiz()));
    }
}
