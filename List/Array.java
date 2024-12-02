/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package List;
import java.util.ArrayList;
import java.util.List;

public class Array {

   
    public static void main(String[] args) {
        // Un ArrayList : Ordenado, se puede acceder por indice, permite duplicados.     
        // Parecido a un array, pero es dinamico, es decir, puede aumentar.
        
        ArrayList<String> nombres = new ArrayList<>();
        
      
        nombres.add("Santiago");
        nombres.add("Mateo");
        nombres.add("Mateo");
        nombres.remove("Mateo");
        nombres.set(1, "Matiu");
        
        
       // System.out.println(nombres.get(1));
         // System.out.println(nombres);
        
       // System.out.println("Esta vacia? " + nombres.isEmpty());
        
        nombres.clear();
       
        nombres.add("Santiago");
        nombres.add("Mateo");
        nombres.add("Mateo");
        nombres.add("Santiago");
        nombres.add("Mateo");
        nombres.add("Mateo");
        nombres.add("Santiago");
        nombres.add("Mateo");
        nombres.add("Mateo");
       
       // System.out.println("Esta vacia? " +  nombres.isEmpty());
       
     // Iteracion :  Podemos usar Bucles For normales, debido a que list tiene indices.  
       
       
       for (int i = 0; i <nombres.size(); i++) {
         if (nombres.get(i).equals("Santiago")) {
            continue;
           }
        System.out.println(nombres.get(i));
        
        
        }
        
       }

    }
    
    
