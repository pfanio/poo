
import java.time.LocalDateTime;

public class ValorNegativoException extends Exception{
    
    public LocalDateTime horaEvento = LocalDateTime.now();
        
    public ValorNegativoException(){ 
        super("Esta operação não aceita valores menores ou iguais a zero.");
    }
}
