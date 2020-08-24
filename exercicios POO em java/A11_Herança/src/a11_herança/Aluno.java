package a11_herança;
public class Aluno extends Pessoa{
    
    //ATRIBUTOS
    private int matricula;
    private String curso;
    
    //METODOS
    public void pagarMensalidade () {
        System.out.println("Mensalidade de " + this.getNome() + " paga com sucesso!");
    }
    
    //GETERS E SETERS
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
