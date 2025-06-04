package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Threads {

    public static void main(String[] args) {
        Thread t1, t2, t3, t4, t5;      
        t1 = new Thread(new Tarefa("Tarefa 1", 10));
        t2 = new Thread(new Tarefa("Tarefa 2", 20));
        t3 = new Thread(new Tarefa("Tarefa 3", 30));
        t4 = new Thread(new Tarefa("Tarefa 4", 40));
        t5 = new Thread(new Tarefa("Tarefa 5", 50));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class Tarefa implements Runnable{
    
    private String nome;
    private int limite;
    
    public Tarefa(String nome, int limite){
        this.nome = nome;
        this.limite = limite;
                
    }
    
    @Override
    public void run() {
        
        for(int i=1; i < limite; i++){
            System.out.println(nome+": Passo"+i);
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }  
        System.out.println(nome + " terminou");
    }
    
}
