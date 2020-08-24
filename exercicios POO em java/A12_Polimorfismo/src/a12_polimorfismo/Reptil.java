package a12_polimorfismo;
public class Reptil extends Animal {

    //ATRIBUTOS
    private String corEscama;
    
    //MÉTODOS ABSTRATOS
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Reptil comendo");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
    
    //GETERS E SETERS
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
