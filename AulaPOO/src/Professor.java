public class Professor {
    private int matricula;
    private String nome;
    private String formacao;

    public Professor(int matricula, String nome, String formacao){
        this.matricula = matricula;
        this.nome = nome;
        this.formacao = formacao;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getFormacao(){
        return formacao;
    }
    public void setFormacao(String formacao){
        this.formacao = formacao;
    }
}
