public class Conta {

    private double saldo;
    private String numero;
    private String titular;
    private String agencia;

    public Conta(){}
    
    public Conta(double saldo, String numero, String titular, String agencia) {
        this.saldo = saldo;
        this.numero = numero;
        this.titular = titular;
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Conta{" + "\nsaldo=" + saldo + "\nnumero=" + numero + "\ntitular=" + titular + "\nagencia=" + agencia + "\n}";
    }

    public void depositar (double valor){
        saldo = saldo + valor;
    }
    
    public void sacar(double valor){
        saldo = saldo - valor;
    }
    
    public void alterarTitular(String novoTitular){
        titular = novoTitular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    
}
