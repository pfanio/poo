public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String departamento, int codigo, String nome, double salario) {
        super(codigo, nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularFerias() {
        return this.getSalario() + 10000 + 5000 + 3000;
    }
    
    
}
