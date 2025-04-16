
public class Cachorro {
    
    private int patas;
    private String nome;
    private String tutor;

    public Cachorro(int patas, String nome, String tutor) {
        this.patas = patas;
        this.nome = nome;
        this.tutor = tutor;
    }
    
    public Cachorro(){}

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    
    public void chorar(){
        System.out.println("cain cain cain");
    }
    public void latir(){
        System.out.println("AU");
    }
}
