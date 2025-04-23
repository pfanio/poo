public class Vendedor extends Funcionario{
    
    private double percentualComissao;

    public Vendedor(double percentualComissao, int codigo, String nome, double salario) {
        super(codigo, nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    
}
