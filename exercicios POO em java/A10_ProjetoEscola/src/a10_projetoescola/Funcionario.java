package a10_projetoescola;
public class Funcionario extends Pessoa{
    
    //ATRIBUTOS
    private String setor;
    private boolean trabalhando;
    
    //METODOS
    public void mudaTrabalho () {
        this.trabalhando = !this.trabalhando;
    }
    
    //GETERS E SETERS
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
