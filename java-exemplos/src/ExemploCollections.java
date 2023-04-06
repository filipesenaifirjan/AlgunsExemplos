import java.util.ArrayList;
import java.util.List;

import java.util.Collections;


public class ExemploCollections {

    public static void main(String[] args) {
        
        
        List<Integer> numeros = new ArrayList<>();
        
        
            numeros.add(5);
            numeros.add(2);
            numeros.add(8);
            numeros.add(1);
            
        
        Collections.sort(numeros);
        
        
            System.out.println("Lista ordenada: " + numeros);
        
        
        numeros.remove(2);
        
        
        System.out.println("Lista atualizada: " + numeros);
        
        
        if (numeros.contains(5)) {
            System.out.println("A lista contém o número 5.");
        } else {
            System.out.println("A lista não contém o número 5.");
        }
      }
}