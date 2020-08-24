package a10_projetoescola;
public class A10_ProjetoEscola {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ();
        Aluno p2 = new Aluno ();
        Professor p3 = new Professor ();
        Funcionario p4 = new Funcionario ();
        
        p1.setNome("Elvis");
        p2.setNome("Everton");
        p3.setNome("Diana");
        p4.setNome("Lucelia");
        
        p1.setIdade(17);
        p3.setIdade(50);

        p2.setSexo("M");        
        p4.setSexo("F");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
