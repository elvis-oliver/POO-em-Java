package a14_projetoyoutube;
public class Gafanhoto extends Pessoa{
    
    //ATRIBUTOS
    private String login;
    private int totAssistido;
    
    //CONSTRUTOR
    public Gafanhoto(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;   
    }
    
    //METODOS
    public void viuMaisUm () {
        totAssistido++;
    }
    
    //GETERS E SETERS
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //TO STRING
    @Override
    public String toString() {
        return super.toString() + " \n Gafanhoto{" + "login=" 
                + login + ", totAssistido=" 
                + totAssistido + '}';
    }
    
}
