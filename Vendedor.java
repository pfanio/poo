public class Vendedor extends Funcionario 
        implements Contratado{
    
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

    @Override
    public double calcularFerias() {
        return this.getSalario() + 15.00 - 500;
    }

    @Override
    public double calcularGratificacao() {
        return this.getSalario() * 0.10;
    }

    @Override
    public void baterPonto() {
        System.out.println("Entrada: 08h");
        System.out.println("Saída Almoço: 12h");
        System.out.println("Volta Almoço: 13h");
        System.out.println("Saída: 18h");
    }

    @Override
    public int calcularBancoDeHoras(int qtdHoras) {
        return 50*qtdHoras;
    }
    
    
}
