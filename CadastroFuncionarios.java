public class CadastroFuncionarios {

    private int quantFuncionarios;
    private Funcionario[] funcionarios;

    public CadastroFuncionarios() {
        this.quantFuncionarios = 0;
        this.funcionarios = new Funcionario[50];
    }

    public int getQuantFuncionarios() {
        return quantFuncionarios;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
    
    public boolean inserir(Funcionario func){
        
        if(quantFuncionarios == 50)
            return false;
        
        if(func == null){
            return false;
        }
        
        for(int indice = 0; indice < quantFuncionarios; indice++){
            if(funcionarios[indice].getCodigo() == func.getCodigo())
                return false;
        }
        
        funcionarios[quantFuncionarios] = func;
        quantFuncionarios++;
        return true;
    }
    
    public Funcionario buscar(int cod){
        for(int indice = 0; indice < quantFuncionarios; indice++){
            if(funcionarios[indice].getCodigo() == cod)
                return funcionarios[indice];
        }
        return null;
    }
}
