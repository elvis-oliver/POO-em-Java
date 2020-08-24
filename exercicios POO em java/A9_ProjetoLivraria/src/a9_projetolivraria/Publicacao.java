package a9_projetolivraria;
public interface Publicacao {
    public void abrir ();
    public abstract void fechar ();
    public abstract void folhear (int p);
    public abstract void avancarPag ();
    public abstract void voltarPag ();
}
