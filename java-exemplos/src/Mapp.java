import java.util.HashMap;
import java.util.Map;

public class Mapp {


    public static void main(String[] args) {
        
        
        Map<String, Double> notas = new HashMap<>();
        
        
            notas.put("João", 8.5);
            notas.put("Maria", 9.0);
            notas.put("Pedro", 7.5);
            notas.put("Lucas", 6.0);
        
       
        for (String nome : notas.keySet()) {
            System.out.println(nome + " - " + notas.get(nome));
        }
    }

    
}