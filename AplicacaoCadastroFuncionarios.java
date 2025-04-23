
import java.util.Scanner;

public class AplicacaoCadastroFuncionarios {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;
        String depto, nome;
        int codigo;
        double salario, percentual;
        CadastroFuncionarios bancoDeDados = new CadastroFuncionarios();

        do {
            System.out.println("1 - Inserir");
            System.out.println("2 - Buscar");
            System.out.println("3 - Listar");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("5 - Gerente");
                    System.out.println("6 - Vendedor");
                    opcao = entrada.nextInt();
                    entrada.nextLine();

                    if (opcao == 5) {
                        System.out.println("Digite o depatarmento");
                        depto = entrada.nextLine();

                        System.out.println("Digite o código");
                        codigo = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println("Digite o nome");
                        nome = entrada.nextLine();

                        System.out.println("Digite o salário");
                        salario = entrada.nextDouble();
                        entrada.nextLine();

                        Gerente gerente = new Gerente(depto, codigo, nome, salario);
                        bancoDeDados.inserir(gerente);
                    }

                    if (opcao == 6) {
                        System.out.println("Digite o percentual de comissão");
                        percentual = entrada.nextDouble();
                        entrada.nextLine();

                        System.out.println("Digite o código");
                        codigo = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println("Digite o nome");
                        nome = entrada.nextLine();

                        System.out.println("Digite o salário");
                        salario = entrada.nextDouble();
                        entrada.nextLine();

                        Vendedor vendedor = new Vendedor(percentual, codigo, nome, salario);
                        bancoDeDados.inserir(vendedor);
                    }

                    break;

                case 2:
                    System.out.println("Informe o código");
                    codigo = entrada.nextInt();
                    entrada.nextLine();
                    
                    Funcionario func = bancoDeDados.buscar(codigo);

                    if (func != null) {
                        System.out.println("Codigo: " + func.getCodigo());
                        System.out.println("Nome: " + func.getNome());
                        System.out.println("Salário: " + func.getSalario());
                    }

                    break;

                case 3:
                    imprimeFolha(bancoDeDados.getFuncionarios(),
                            bancoDeDados.getQuantFuncionarios());
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao Inválida!");
                    break;
            }

        } while (opcao != 0);
    }

    public static void imprimeFolha(Funcionario[] funcionarios, int qtd) {
        
        double totalFolha = 0;
        //cabeçalho
        System.out.print("Nome: \t\t");
        System.out.print("Salario: \t\t");
        System.out.print("Funcao: \t\t");
        
        //pula uma linha
        System.out.println("");
        
        for (int indice = 0; indice < qtd; indice++) {
            System.out.print(funcionarios[indice].getNome()+"\t\t");
            System.out.print(funcionarios[indice].getSalario()+"\t\t");
            if(funcionarios[indice] instanceof Gerente){
                //casting
                System.out.print("Gerente -> " + ((Gerente)funcionarios[indice]).getDepartamento());
            }
            else{
             System.out.print("Vendedor -> Comissão: " + ((Vendedor)funcionarios[indice]).getPercentualComissao());   
            }
            
            //pula linha após imprimir
            System.out.println("");
            
            //variável para acumular salários
            totalFolha = totalFolha + funcionarios[indice].getSalario();
        }
        
        System.out.println("Total da folha: " + totalFolha);
    }
}
