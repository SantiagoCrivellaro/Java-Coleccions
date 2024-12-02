/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set;
import java.util.TreeSet;
import java.util.Comparator;


public class Tree {

    // Elementos ordeandos automaticamente de manera natural
    // No permite duplicados
    // Más lento que HashSet
    
    public static void main(String[] args) {
        
       TreeSet<String> frutas = new TreeSet<>();
       
       frutas.add("Banana");
       frutas.add("Manzana");
       frutas.add("Frutilla");
       
       frutas.remove("Frutilla");
       
       String primero = frutas.first();
       
        
      // System.out.println(primero);
       
       boolean contiene = frutas.contains("Manzana");
       
       // System.out.println(contiene);
        
         // System.out.println("El valor de el TreeSet es : " + frutas.size());
        
      // Ahora con un comparados personalizado :
      
      TreeSet<String> nombres = new TreeSet<>(Comparator.reverseOrder());
      
      nombres.add("Santiago");
      nombres.add("Maria");
      nombres.add("Mateo");
      nombres.add("Ana");
      
      // Ana queda ultimo, por que el comparador los ubica a la reversa.
      
         // System.out.println(nombres);

          // Iteracion : Se usa Un bucle For-Each, debido a que los set no tienen indices.
        for (String index : frutas) {
            System.out.println(index);
        }
    }
}
