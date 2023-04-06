import java.util.Random;
import java.util.Scanner;

public class Aposta {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[6];
        int totalApostado = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(61);
            System.out.println("Número " + (i+1) + ": " + numeros[i]);
                          }
        
        System.out.println("Quanto você quer apostar?");
        int aposta = scanner.nextInt();
        totalApostado += aposta;
      
        
        int acertos = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Qual número você acha que foi sorteado para a posição " + (i+1) + "?");
            int palpite = scanner.nextInt();
            if (palpite == numeros[i]) {
                acertos++;
             }
        }
        
        int premio = aposta * 10 * acertos;
        int lucro = premio - totalApostado;
        
        System.out.println("Você acertou " + acertos + " números.");
        System.out.println("Seu prêmio é R$" + premio);
        System.out.println("Seu lucro é R$" + lucro);
        scanner.close();
     }
   
}
