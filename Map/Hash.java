/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Santi
 */
public class Hash {
    
    
    //  No usa la misma interfaz que set y list.
    // Clave - Valor
    // La clave puede ser duplicada, el valor no.
    // No esta ordenado.
    // Una clave puede tener diferentes valores.
    // Se accede mediante claves, no INDICES.
    
    public static void main(String[] args) {
  
      HashMap<Integer, String> nombres = new HashMap<>();
      
      // Operaciones basicas
      
      nombres.put(1, "Santiago");
      nombres.put(2, "Mateo");
      nombres.put(3, "Jorge");
      
        System.out.println(nombres.get(1));
      
      String santi = nombres.get(1);
      
        System.out.println(santi);
        
        nombres.remove(2);
        
        boolean existe =  nombres.containsKey(2);
        System.out.println(existe);
        
        System.out.println(nombres.containsKey(2));
        
        boolean existeValor = nombres.containsValue("Santiago");
        System.out.println(existeValor);
        
       // Iteracion : Debemos convertir el map en un conjunto de entradas, 
      //donde cada entrada es un objeto Map.Entry<Integere, Striwng>, 
     // luego traemos claves y valores.
        
     for (Map.Entry<Integer, String> index : nombres.entrySet()) {
    System.out.println("Clave: " + index.getKey() + ", Valor: " + index.getValue());
        }

    }
}
