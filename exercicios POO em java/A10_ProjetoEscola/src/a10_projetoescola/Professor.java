package a10_projetoescola;
public class Professor extends Pessoa{
    
    //ATRIBUTOS
    private String especialidade;
    private float salario;
    
    //METODOS
    public void receberAumento (float au) {
        this.salario = this.salario + au;
    }
    
    //GETERS E SETERS
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
