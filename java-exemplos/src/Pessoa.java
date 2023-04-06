public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
     public String getNome() {
        return nome;
      }
    
    public int getIdade() {
        return idade;
    }
    
    public void dirigir(Carro carro) {
        System.out.println(nome + " está dirigindo " + carro.getMarca() + " " + carro.getModelo());
    }
    
    public void morar(Casa casa) {
        System.out.println(nome + " está morando em " + casa.getEndereco());
    }
    
     public void trabalhar(Emprego emprego) {
        System.out.println(nome + " está trabalhando como " + emprego.getCargo() + " na empresa " + emprego.getEmpresa());
    }
    
    public void praticarEsporte(EsportePreferido esporte) {
         System.out.println(nome + " está praticando " + esporte.getNome() + ", seus esportes prediletos!");
    }
}








