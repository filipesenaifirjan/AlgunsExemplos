import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Rifa {
      public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
            ArrayList<String> nomes = new ArrayList<String>();
            ArrayList<String> nomesApostados = new ArrayList<String>();
            ArrayList<String> nomesSorteados = new ArrayList<String>();
            
        System.out.println("Digite os 10 nomes de meninas para a rifa:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome " + (i+1) + ": ");
            String nome = scan.nextLine();
            nomes.add(nome);
        }
        
        System.out.println("Nomes para a rifa: " + nomes.toString());
        
            System.out.println("Digite o nome da menina que será apostada:");
            String nomeApostado = scan.nextLine();
            nomesApostados.add(nomeApostado);
            
        System.out.println("Nome apostado: " + nomeApostado);
        
        
        
        System.out.println("Pressione enter para sortear uma menina...");
        scan.nextLine();
        
        int indice = random.nextInt(nomes.size());
        String nomeSorteado = nomes.get(indice);
        nomesSorteados.add(nomeSorteado);
        System.out.println("Menina sorteada: " + nomeSorteado);
        scan.close();
        
    }
}