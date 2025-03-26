


public class CadastroLivros {

    public static void main(String[] args) {
        
        Livro livro1, livro2;
        livro1 = new Livro();
        
        livro1.titulo = "Narnia";
        livro1.descricao = "Magia, pó, leao";
        livro1.qtdPaginas = 396;
        livro1.editora = "Panini";
        
        livro1.autor1.nome = "Maria penha";
        livro1.autor1.cidade = "Petrolina";
        livro1.autor1.idade = 33;
        
        livro1.autor2.nome = "Ana Silva";
        livro1.autor2.cidade = "Belo Jardim";
        livro1.autor2.idade = 33;
        livro1.imprimir();
        
        livro2 = new Livro();
        livro2.titulo = "Vidas Secas";
        livro2.descricao = "Sertão, baleia";
        livro2.qtdPaginas = 300;
        livro2.editora = "Paulinas";
        
        livro2.autor1.nome = "Joao Silva";
        livro2.autor1.cidade = "Olinda";
        livro2.autor1.idade = 33;
        
        livro2.autor2.nome = "Pedro Maria";
        livro2.autor2.cidade = "Lagoa do carro";
        livro2.autor2.idade = 33;
        
        livro2.imprimir();
        
        
        Livro livro3 = new Livro("Harry Potter", "Livro de bruxo", 100, "Brasil",500.00);
        
        livro3.desconto(10);
                
        Autor autor1livro3 = new Autor("Ze",29,"Olinda");
        Autor autor2livro3 = new Autor("Maria", 34,"Recife");
        
        livro3.autor1 = autor1livro3;
        livro3.autor2 = autor2livro3;
        livro3.imprimir();
        
        
        
        
        
        
        
    }
}
