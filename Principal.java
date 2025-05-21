
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws SaldoInsuficienteException, ValorNegativoException {

        Scanner teclado = new Scanner(System.in);
        Conta poupanca, corrente;
        int opcao;
        double valor;
        poupanca = new Conta();
        corrente = new Conta();
        boolean sacou;
                
        
        do {
            System.out.println("1 - Cadastrar Poupança");
            System.out.println("2 - Cadastrar Corrente");
            System.out.println("3 - Depositar Poupança");
            System.out.println("4 - Depositar Corrente");
            System.out.println("5 - Sacar Poupança");
            System.out.println("6 - Sacar Corrente");
            System.out.println("7 - Transf. C->P");
            System.out.println("8 - Transf. P->C");
            System.out.println("0 - Consulta ");
            System.out.println("9 - Sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite saldo");
                    poupanca.setSaldo(teclado.nextDouble());
                    teclado.nextLine();

                    System.out.println("Digite nº poupanca");
                    poupanca.setNumero(teclado.nextLine());

                    System.out.println("Digite titular poupanca");
                    poupanca.setTitular(teclado.nextLine());

                    System.out.println("Digite agencia poupanca");
                    poupanca.setAgencia(teclado.nextLine());
                    break;

                case 2:
                    System.out.println("Digite saldo");
                    corrente.setSaldo(teclado.nextDouble());
                    teclado.nextLine();

                    System.out.println("Digite nº corrente");
                    corrente.setNumero(teclado.nextLine());

                    System.out.println("Digite titular corrente");
                    corrente.setTitular(teclado.nextLine());

                    System.out.println("Digite agencia corrente");
                    corrente.setAgencia(teclado.nextLine());
                    break;

                case 3:
                    System.out.println("Quanto deseja depositar?");
                    poupanca.depositar(teclado.nextDouble());
                    teclado.nextLine();
                    break;
                    
                case 4:
                    try{
                        System.out.println("Quanto deseja depositar?");
                        corrente.depositar(teclado.nextDouble());
                    }catch (ValorNegativoException ex){
                        System.out.println("Mensagem: " + exception.getMessage());
                        System.out.println("Hora erro: " + exception.horaEvento);
                    }
                    teclado.nextLine();
                    break;
                    
                case 5:
                    sacou = false;
                    do{
                        try{
                            System.out.println("Quanto deseja sacar?");
                            poupanca.sacar(teclado.nextDouble());
                            sacou = true;
                        }catch(SaldoInsuficienteException exception){
                            System.out.println("Mensagem: " + exception.getMessage());
                            System.out.println("Hora erro: " + exception.horaEvento);
                            System.out.println("Seu saldo atual: "+ poupanca.getSaldo());
                        }
                    }while(!sacou && poupanca.getSaldo() > 0);
                    teclado.nextLine();
                    break;
                    
                case 6:
                    sacou = false;
                    do{
                        try{
                            System.out.println("Quanto deseja sacar?");
                            corrente.sacar(teclado.nextDouble());
                            sacou = true;
                        }catch(SaldoInsuficienteException exception){
                            System.out.println("Mensagem: " + exception.getMessage());
                            System.out.println("Hora erro: " + exception.horaEvento);
                            System.out.println("Seu saldo atual: "+ corrente.getSaldo());
                        }
                    }while(!sacou && poupanca.getSaldo() > 0);
                    teclado.nextLine();
                    break;
                
                case 7:
                    sacou = false;
                    do{
                        try{
                            System.out.println("Quanto deseja transferir?");
                            valor = teclado.nextDouble();
                            corrente.sacar(valor);
                            poupanca.depositar(valor);
                            sacou = true;
                        }catch(SaldoInsuficienteException exception){
                            System.out.println("Mensagem: " + exception.getMessage());
                            System.out.println("Hora erro: " + exception.horaEvento);
                            System.out.println("Seu saldo atual: "+ corrente.getSaldo());
                        }
                    }while(!sacou && corrente.getSaldo() > 0);
                    teclado.nextLine();
                    break;
                    
                case 8:
                    System.out.println("Quanto deseja transferir?");
                    valor = teclado.nextDouble();
                    teclado.nextLine();
                    poupanca.sacar(valor);
                    corrente.depositar(valor);
                    break;
                
                case 9: break;
                
                default: 
                    System.out.println("Digite uma opcao valida, seu bandido!");
                    break;
                    
                case 0:
                    System.out.println(poupanca.toString());
                    System.out.println(corrente.toString());
                    break;
                    
            }
        } while (opcao != 9);
    }
}
