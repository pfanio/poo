
public class Principal {

    public static void main(String[] args) {
        
        Conta c1 = new Conta(1000.00, "123", "Paulo", "3500-X");
        c1.depositar(100);
        c1.sacar(50);
        
        System.out.println(c1.toString());
        c1.alterarTitular("Severino");
        System.out.println(c1.toString());
        
    }
}
