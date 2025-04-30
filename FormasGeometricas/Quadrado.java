public class Quadrado implements FormaGeometrica{

    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public double comprimento() {
        return lado*4;
    }
    
   
    
}
