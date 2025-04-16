public class Professor {

    int codigo;
    String nome;
    Data dataAdmissao;
    Departamento departamento;

    public Professor(int codigo, String nome, Data dataAdmissao, Departamento departamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.departamento = departamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Data dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
