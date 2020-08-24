package a12_polimorfismo;
public class A12_Polimorfismo {
    public static void main(String[] args) {
        //POLIMORFISMO SUBSCRIÇÃO
        Mamifero m = new Mamifero ();
        Reptil r = new Reptil ();
        Canguru can = new Canguru ();
        Tartaruga ta = new Tartaruga ();
        
        m.alimentar();
        m.emitirSom();
        m.locomover();
        
        r.alimentar();
        r.emitirSom();
        r.locomover();
        
        can.locomover();
        ta.locomover();
        
        //POLIMORFISMO SOBRECARGA
        Cachorro ca = new Cachorro ();
        
        ca.reagir("OI DOGUINHO");
        ca.reagir("SAI PULGUENTO");
        ca.reagir(5);
        ca.reagir(20);
        ca.reagir(true);
        ca.reagir(false);
        
    }
    
}
