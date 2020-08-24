package a10_projetoescola;
public class Pessoa {
    
    //ATRIBUTOS
    private String nome;
    private int idade;
    private String sexo;
    
    //MÉTODOS
    public void fazerNiver() {
        this.idade++;
    }
    
    //GETERS E SETERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}
