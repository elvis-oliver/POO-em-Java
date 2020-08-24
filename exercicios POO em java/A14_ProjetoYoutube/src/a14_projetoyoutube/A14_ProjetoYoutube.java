package a14_projetoyoutube;
public class A14_ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video ("XVIDEOS");
        v[1] = new Video ("REDTUBE");
        
        //System.out.println(v[0].toString());
        //System.out.println(v[1].toString());
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto ("ELVIS", 26, "M");
        //System.out.println(g[0].toString());
        
        
        
        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao (g[0],v[0]);
        vis[0].avaliar(5);
        vis[1] = new Visualizacao (g[0],v[1]);
        vis[1].avaliar(7f);
        v[1].pause();
        v[0].pause();
        System.out.println(vis[0].toString());
       
    }
    
}
