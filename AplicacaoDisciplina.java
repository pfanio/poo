
import java.util.Scanner;


public class AplicacaoDisciplina {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int dia, mes, ano, codigo, qtdAlunos;
        String nome, curso;
        
        Professor.boasVindas();
        
        Data dataAdm = preencheData(teclado); 
        Departamento dpt = preencheDepartamento(teclado);
        Professor professor = preencheProfessor(teclado, dataAdm, dpt);
        preencheDisciplina(teclado, professor);
        
    }

    public static void preencheDisciplina(Scanner teclado, Professor professor) {
        String nome;
        String curso;
        int qtdAlunos;
        System.out.println("Digite o nome da disciplina");
        nome = teclado.nextLine();
        System.out.println("Digite o curso da disciplina");
        curso = teclado.nextLine();
        System.out.println("Digite a quantidade de alunos da disciplina");
        qtdAlunos = teclado.nextInt();
        teclado.nextLine();
        Disciplina disciplina = new Disciplina(nome, curso, professor, qtdAlunos);
    }

    public static Professor preencheProfessor(Scanner teclado, Data dataAdm, Departamento dpt) {
        int codigo;
        String nome;
        System.out.println("Digite o código do Professor");
        codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o nome do Professor");
        nome = teclado.nextLine();
        Professor professor = new Professor(codigo, nome, dataAdm, dpt);
        return professor;
    }

    public static Departamento preencheDepartamento(Scanner teclado) {
        int codigo;
        String nome;
        System.out.println("Digite o código do Depto. do Professor");
        codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o nome do Depto. do Professor");
        nome = teclado.nextLine();
        Departamento dpt = new Departamento(codigo, nome);
        return dpt;
    }

    public static Data preencheData(Scanner teclado) {
        int dia;
        int mes;
        int ano;
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
        return dataAdm;
    }
    
    public static void alteraDadosGerais(Disciplina d){
    
        String nome;
        String curso;
        int qtdAlunos;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome da disciplina");
        nome = teclado.nextLine();
        System.out.println("Digite o curso da disciplina");
        curso = teclado.nextLine();
        System.out.println("Digite a quantidade de alunos da disciplina");
        qtdAlunos = teclado.nextInt();
        
        d.setCurso(curso);
        d.setNome(nome);
        d.setQuantidadeAlunos(qtdAlunos);
    }
    
    public static void alteraProfessor(Disciplina d){
        
        Scanner teclado = new Scanner(System.in);
        
        Data novaDataAdm = preencheData(teclado);
        Departamento novoDepartamento = preencheDepartamento(teclado);
        Professor novoProf = preencheProfessor(teclado, novaDataAdm, novoDepartamento);
        
        d.setProfessor(novoProf);
    }
}
