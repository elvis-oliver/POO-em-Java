package a12_polimorfismo;
public class Mamifero extends Animal {
    
    //ATRIBUTOS
    private String corPelo;
    
    //MÉTODOS ABSTRATOS
    @Override
    public void locomover() {
        System.out.println("Andando");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamifero comendo");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
    //GETERS E SETERS
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
