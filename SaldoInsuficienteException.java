
import java.time.LocalDateTime;

public class SaldoInsuficienteException extends Exception{
    
    public LocalDateTime horaEvento = LocalDateTime.now();
        
    public SaldoInsuficienteException(){ 
        super("Saldo insuficiente para saque.");
    }
}
