import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ApostaDois {
     public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
            int[] numerosSorteados = new int[6];
            int totalApostado = 0;
            
        System.out.println("Quanto voce quer apostar?");
        int aposta = scanner.nextInt();
        totalApostado += aposta;
        
        System.out.println("Aposte em 6 números entre 0 e 60:");
        int[] numerosApostados = new int[6];
        for (int i = 0; i < numerosApostados.length; i++) {
            System.out.println("Número " + (i+1) + ": ");
            numerosApostados[i] = scanner.nextInt();
          }
        
            System.out.println("Números apostados: " + Arrays.toString(numerosApostados));
            
            for (int i = 0; i < numerosSorteados.length; i++) {
                numerosSorteados[i] = random.nextInt(61);
                System.out.println("Número sorteado " + (i+1) + ": " + numerosSorteados[i]);
            }
        
        int acertos = 0;
        for (int i = 0; i < numerosSorteados.length; i++) {
            if (numerosApostados[i] == numerosSorteados[i]) {
                acertos++;
            }
        }
        
        int premio = aposta * 10 * acertos;
        int lucro = premio - totalApostado;
        
        System.out.println("Voce acertou " + acertos + " números.");
        System.out.println("Seu premio é R$" + premio);
        System.out.println("Seu lucro é R$" + lucro);

        scanner.close();
      }
}

