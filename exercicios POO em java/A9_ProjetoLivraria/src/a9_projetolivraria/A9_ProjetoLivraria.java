package a9_projetolivraria;
public class A9_ProjetoLivraria {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa [2];
        Livro l[] = new Livro [2];
        
        p[0] = new Pessoa ("Elvis", 26, "M");
        p[1] = new Pessoa ("Everton", 30, "F");
        
        l[0] = new Livro ("Harry Potter", "JK Rolling", 200, 0, p[0]);
        l[1] = new Livro ("Pequeno Principe", "Tullyo Ryann", 150, 0, p[1]);
        
        p[0].fazerNiver();
        p[0].statusP();
        
        l[0].abrir();
        l[0].folhear(50);
        System.out.println(l[0].detalhes());
    }
}
