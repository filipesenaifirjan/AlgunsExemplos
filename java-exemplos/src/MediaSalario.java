import javax.swing.JOptionPane;
public class MediaSalario {
    public static void main(String[] args) {
 
        int quantidadeFuncionarios = 0;
        float salarioFuncionario = 0;
        float totalSalarios = 0;
        float mediaSalarial = 0;
        //variável contadora para laço
        int contadora = 0;
         
        quantidadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de funcionários","Número de funcionários",JOptionPane.QUESTION_MESSAGE));
         
        while (contadora < quantidadeFuncionarios){
            contadora++;
            salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salário do funcionário","Salário",JOptionPane.QUESTION_MESSAGE));
            totalSalarios = totalSalarios + salarioFuncionario;
        }
         
        mediaSalarial = totalSalarios / quantidadeFuncionarios;
        System.out.println("Média Salarial = " + mediaSalarial);
 
        System.exit(0);
    }
 
}