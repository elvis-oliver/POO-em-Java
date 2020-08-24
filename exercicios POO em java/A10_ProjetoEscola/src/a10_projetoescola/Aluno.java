package a10_projetoescola;
public class Aluno extends Pessoa{
   
    //ATRIBUTOS
    private int matricula;
    private String curso;
    
    //METODOS
    public void cancelarMat () {
        System.out.println("Matricula cancelada");
        this.matricula=0;
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
