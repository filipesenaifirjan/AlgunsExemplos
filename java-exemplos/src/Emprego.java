public class Emprego {
 private String empresa;
    private String cargo;
    
        public Emprego(String empresa, String cargo) {
            this.empresa = empresa;
            this.cargo = cargo;
        }
    
    public String getEmpresa() {
        return empresa;
    }
    
    public String getCargo() {
        return cargo;
    }
}
