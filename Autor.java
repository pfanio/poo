public class Autor {
    
    String nome;
    int idade;
    String cidade;
    
    public Autor(){}

    public Autor(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
    
    
    
    void imprimir(){
        System.out.println(nome + "\n" + idade + "\n" + cidade);
    }
}
