/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set;
import java.util.LinkedHashSet;


public class LinkedHash {
    // No permite elementos duplicados.
    // Buen rendimiento debido a su algoritmo interior "HASH"
    // Mantiene orden de insercion
   public static void main(String[] args) {
  LinkedHashSet<String> nombres = new LinkedHashSet<>();
  
  // Operaciones basicas :
  
  nombres.add("Santiago");
  nombres.add("Maria");
  nombres.add("Mateo");
  
  nombres.remove("Mateo");
  
  if (nombres.contains("Santiago")) {
      System.out.println("En La lista enlazada existe el nombre Santiago");
  }
  
  // Iteracion : Se usa Un bucle For-Each, debido a que los set no tienen indices.
  
    for (String index : nombres) {
      System.out.println(index);
  }
  
   }
}
