/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set;
import java.util.HashSet;
/**
 *
 * @author Santi
 */
public class Hash {
    // No permite duplicados
    // No tiene orden
    // Sin claves, solo valores.
    // Utiliza Hashing, asi que es mas rapido para la busqueda.
    
    public static void main(String[] args) {
        
     HashSet<String> nombre = new HashSet<>();
     
     nombre.add("Santiago");
     nombre.add("Mateo");
     nombre.add("Maria");
     nombre.add("Santiago"); // IGNORADO POR QUE SE REPITE
     
     nombre.remove("Mateo");
     
        System.out.println(nombre); // SANTIAGO, MARIA. ORDEN NO GARANTIZADO
        
     boolean contiene = nombre.contains("Santiago");
     
        System.out.println(contiene);
        
     int size = nombre.size();
     
        System.out.println(size);
        
     if (nombre.contains("Maria")) {
         System.out.println("Maria existe en el conjunto.");
     }
     
      // Iteracion : Se usa Un bucle For-Each, debido a que los set no tienen indices.
      
      for ( String index : nombre) {
          System.out.println(index);
      }
    }  
}