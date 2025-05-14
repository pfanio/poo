

public class ContaPoupanca extends Conta{
    
    private String telefone;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException{
        if(getSaldo() - valor > 0){
            super.sacar(valor);
        }else{
            throw new SaldoInsuficienteException();
        }
    }
}
