
import java.util.Scanner;


public class AplicacaoDisciplina {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int dia, mes, ano, codigo, qtdAlunos;
        String nome, curso;
        
        System.out.println("Digite o dia de admissao do Professor");
        dia = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Digite o mes de admissao do Professor");
        mes = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Digite o ano de admissao do Professor");
        ano = teclado.nextInt();
        teclado.nextLine();
        
        Data dataAdm = new Data(dia, mes, ano);
        
        System.out.println("Digite o código do Depto. do Professor");
        codigo = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Digite o nome do Depto. do Professor");
        nome = teclado.nextLine();
        
        Departamento dpt = new Departamento(codigo, nome);
        
        System.out.println("Digite o código do Professor");
        codigo = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Digite o nome do Professor");
        nome = teclado.nextLine();
        
        Professor professor = new Professor(codigo, nome, dataAdm, dpt);
        
        System.out.println("Digite o nome da disciplina");
        nome = teclado.nextLine();
        
        System.out.println("Digite o curso da disciplina");
        curso = teclado.nextLine();
        
        System.out.println("Digite a quantidade de alunos da disciplina");
        qtdAlunos = teclado.nextInt();
        teclado.nextLine();
        
        Disciplina disciplina = new Disciplina(nome, curso, professor, qtdAlunos);
        
    }
}
