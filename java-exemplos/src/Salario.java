import javax.swing.JOptionPane; 
 
public class Salario {
 public static void main( String args[] )
   {
 
      String ND, SH, HT;
      int nd;
      float sh, ht, dIR, sb;
      double dINSS, sl;
 
   ND=
   JOptionPane.showInputDialog 
   (null,"Digite número de dependentes","Número de Dependentes",
   JOptionPane.QUESTION_MESSAGE);
 
         nd = Integer.parseInt(ND);
 
   SH=
   JOptionPane.showInputDialog 
   (null,"Digite salário hora","Salário Hora",
   JOptionPane.QUESTION_MESSAGE);
 
   sh = Float.parseFloat(SH);
 
   HT=
      JOptionPane.showInputDialog 
      (null,"Digite número de horas trabalhadas","Número de Horas Trabalhadas",
      JOptionPane.QUESTION_MESSAGE);
    
   ht = Float.parseFloat(HT);
 
   sb = ht*sh+(50*nd);
 
   {JOptionPane.showMessageDialog (
   null, "Salário Bruto" +sb , "Salário Bruto",
   JOptionPane.INFORMATION_MESSAGE );}
 
   if (sb<=1000)
    
   dINSS = sb*8.5/100;
 
   else
    
   dINSS = sb*9/100;
 
   {JOptionPane.showMessageDialog (
   null, "Desconto do INSS" +dINSS , "Desconto do INSS",
   JOptionPane.INFORMATION_MESSAGE );}
 
   if (sb<=500)
 
   dIR = 0;
      
      if (sb>500 && sb<=1000)
 
      dIR = sb*5/100;
 
      else
       
      dIR = sb*7/100;
 
         {JOptionPane.showMessageDialog (
         null, "Desconto do IR" +dIR , "Desconto do IR",
         JOptionPane.INFORMATION_MESSAGE );}
      
   sl = sb-dINSS-dIR;
 
   {JOptionPane.showMessageDialog (
   null, "Salário Líquido" +sl , "Salário Líquido",
   JOptionPane.INFORMATION_MESSAGE ); 
   System.exit( 0 );}
 
}
 }