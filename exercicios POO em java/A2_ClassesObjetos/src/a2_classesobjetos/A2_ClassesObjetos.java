package a2_classesobjetos;
public class A2_ClassesObjetos {
    public static void main(String[] args) {
    
    Caneta c1 = new Caneta();
    c1.cor = "Azul";
    c1.ponta = 0.5f;
    c1.destampar();
    c1.status();
    c1.rabiscar();
        System.out.println("///////////////");
    Caneta c2 = new Caneta();
    c2.cor = "Preto";
    c1.ponta = 1f;
    c1.tampar();
    c1.status();
    c1.rabiscar();
    
    
    }
}

