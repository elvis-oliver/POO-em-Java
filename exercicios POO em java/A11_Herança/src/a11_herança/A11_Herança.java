package a11_herança;
public class A11_Herança {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ();
        Visitante v1 = new Visitante ();
        Aluno a1 = new Aluno ();
        Bolsista b1 = new Bolsista ();
        
        a1.setNome("ELVIS");
        b1.setNome("RENNE");
        a1.pagarMensalidade();
        b1.pagarMensalidade();
    }
    
}
