/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map;
import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHash {
    // Tabla Hash para ser rapidas
    // Listas Enlazadas para mantener el orden.
    // Por defecto mantiene orden de insercion Y/O orden de acceso (LRU)
    
    public static void main(String[] args) {
        
       LinkedHashMap<Integer, String> nombres = new LinkedHashMap<>();
       
       // Operaciones basicas :
       
       nombres.put(1, "Santiago");
       nombres.put(2, "Maria");
       nombres.put(3, "Mateo");
       
        System.out.println(nombres.get(1));
        
        nombres.remove(2);
        
        System.out.println("En la posicion 3 se encuentra el nombre : " + nombres.get(3));
        
        
      // Iteracion : Debemos convertir el map en un conjunto de entradas, 
      //donde cada entrada es un objeto Map.Entry<Integere, Striwng>, 
     // luego traemos claves y valores.
       
       for (Map.Entry<Integer, String> index : nombres.entrySet()) {
           System.out.println("Clave : " + index.getKey() + " Valor : " + index.getValue());
       }
    }
}
