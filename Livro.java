public class Livro {

    String titulo;
    String descricao;
    int qtdPaginas;
    String editora;
    Autor autor1 = new Autor();
    Autor autor2 = new Autor();
    
    void imprimir(){
        System.out.println("#########");
        System.out.println(titulo);
        System.out.println(descricao);
        System.out.println(qtdPaginas);
        System.out.println(editora);
                
        autor1.imprimir();
        autor2.imprimir();
    }
}
