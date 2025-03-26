public class Livro {

    String titulo;
    String descricao;
    int qtdPaginas;
    String editora;
    Autor autor1 = new Autor();
    Autor autor2 = new Autor();
    double preco;
    
   public Livro(){}
   public Livro(String t, String d, int qtd, 
            String e, double preco){
        titulo = t;
        descricao = d;
        qtdPaginas = qtd;
        editora = e;
        this.preco = preco;
   }
    
   
    
    void imprimir(){
        System.out.println("#########");
        System.out.println(titulo);
        System.out.println(descricao);
        System.out.println(qtdPaginas);
        System.out.println(editora);
        System.out.println(preco);
                
        autor1.imprimir();
        autor2.imprimir();
    }
    
    void desconto(double percentual){
        preco = preco - (percentual/100)*preco;
    }
}
