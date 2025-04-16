
public class Principal {

    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro();
        c1.latir();
        Cachorro c2 = new Shihtzu();
        
        Shihtzu floquinho = new Shihtzu();
        floquinho.latir();
        floquinho.setNome("floquinho");
        floquinho.setPatas(4);
        floquinho.chorar();
        
        Pitbull dogao = new Pitbull();
        dogao.latir();
        dogao.setNome("dogao");
        dogao.setPatas(3);
        dogao.chorar();
        
        c2.latir();
        if(c2 instanceof Pitbull){
            ((Pitbull)c2).morder();
        }
        
        c2 = new Pitbull();
        c2.latir();
        
        
    }
}
