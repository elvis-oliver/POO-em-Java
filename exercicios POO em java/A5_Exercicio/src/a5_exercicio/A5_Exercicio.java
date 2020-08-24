package a5_exercicio;
public class A5_Exercicio {
    public static void main(String[] args) {
    Conta p1 = new Conta ();
    p1.setNumConta(111);
    p1.setDono("JUBILEU");
    p1.abrirConta("cc");
    
    Conta p2 = new Conta ();
    p2.setNumConta(222);
    p2.setDono("CREUZA");
    p2.abrirConta("cp");
    
    p1.depositar(100);
    p2.depositar(500);
    p2.sacar(100);
    p2.sacar(300);
    p1.fecharConta();
    p1.pagarMensalidade();
    
    p2.estadoAtual();
    p1.estadoAtual();
    }
}
