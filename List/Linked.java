/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;
import java.util.LinkedList;

/**
 *
 * @author Santi
 */
public class Linked {
    
   // Lista doblemente enlazada, cada nodo tiene un puntero hacia el anterior y posterior.
   // Mas rapida que las ArrayList
   // Más uso de memoria debido a referencias
    public static void main(String[] args) {
        
    
    LinkedList<String> nombres = new LinkedList<String>();
    
    //Operaciones basicas : 
    
    nombres.add("Santiago");
    nombres.add("Mateo");
    nombres.add("Jorge");
    
    nombres.addFirst("Ignacio");
    nombres.addLast("Miguel");
    
    nombres.set(1, "Matiu");
    
        
        
        System.out.println("Primer elemetno : " + nombres.getFirst()) ;
        System.out.println("Primer elemetno : " + nombres.getLast()) ;
        
        nombres.remove(0);
    
        System.out.print(nombres.get(0));
        
        System.out.println(nombres);
        
/* Si necesitás realizar inserciones/eliminaciones frecuentes en el medio de la lista.
Si estás trabajando con operaciones de cola o pila, como addFirst() y removeLast().
*/
    
    // Iteracion :  Podemos usar Bucles For normales, debido a que list tiene indices.  
    
    for (int i = 0; i < nombres.size(); i++) {
        System.out.println(nombres.get(i));
        
    }

}

}