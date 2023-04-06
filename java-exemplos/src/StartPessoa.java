public class StartPessoa {
    public static void main(String[] args) {
            Pessoa pessoa = new Pessoa("Filipe", 40);
            Carro carro = new Carro("Toyota", "Hilux");
            Casa casa = new Casa("Rua Afranio Melo Franco, 333");
            Emprego emprego = new Emprego("Empresa T2M", "Gerente de Projetos");
            EsportePreferido esporte = new EsportePreferido("Basquete em cadeira de rodas e depois barzinho");
            
        pessoa.dirigir(carro);
        pessoa.morar(casa);
        pessoa.trabalhar(emprego);
        pessoa.praticarEsporte(esporte);
     }
}
