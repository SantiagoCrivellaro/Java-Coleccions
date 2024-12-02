/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;


public class Tree {
    // Mantiene los elementos ordenados
    // No permite claves duplicadas
    // Utiliza una estructura de árbol rojo-negro, lo que significa que las operaciones como búsqueda, inserción y eliminación tienen un costo de tiempo O(log n).
    // Es mas lento que HashMap, debido a su estructura de arbol.
    
    
    public static void main(String[] args) {
        TreeMap<Integer, String> nombres = new TreeMap<>();
        
      nombres.put(2, "Mateo");
      
      nombres.put(1, "Santiago");
      
       // nombres.remove(2);
      
      String value = nombres.get(1);
      
        System.out.println(value);
        System.out.println(nombres);
        
         // Iteracion : Debemos convertir el map en un conjunto de entradas, 
      //donde cada entrada es un objeto Map.Entry<Integere, Striwng>, 
     // luego traemos claves y valores.

        
        for (Map.Entry<Integer, String> index : nombres.entrySet()) {
            System.out.println("Clave : " + index.getKey() + "Valor : " + index.getValue());
    }
        
       //  Usando un comparador personalizado : 
        
     TreeMap<Integer, Integer> edades = new TreeMap<>(Comparator.reverseOrder());
     
     
     edades.put(1, 12);
     edades.put(2, 18);
     edades.put(3, 20);
     
        System.out.println(edades);
        
    }
    
}
        
    
     

    
