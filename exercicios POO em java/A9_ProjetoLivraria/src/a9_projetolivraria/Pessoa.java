package a9_projetolivraria;
public class Pessoa {
    
    //ATRIBUTOS
    String nome;
    int idade;
    String sexo;
    
    //CONSTRUTOR
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //METODOS
    public void statusP () {
        System.out.println("NOME: " + this.getNome());
        System.out.println("IDADE: " + this.getIdade());
        System.out.println("SEXO: " + this.getSexo());
    }
    public void fazerNiver () {
        this.setIdade(this.getIdade()+1);
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
    
}
