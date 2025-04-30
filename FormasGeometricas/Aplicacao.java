
public class Aplicacao {

    public static void main(String[] args) {
        
        FormaGeometrica forma = new Quadrado(2);
        
        System.out.println(forma.area());
        
        forma = new Circulo(5);
        
        System.out.println(forma.area());
    }
}
