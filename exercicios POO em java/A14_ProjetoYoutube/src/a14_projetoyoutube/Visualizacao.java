package a14_projetoyoutube;
public class Visualizacao {
    
    //ATRIBUTOS
    private Gafanhoto espectador;
    private Video filme;
    
    //CONSTRUTOR
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
        this.espectador.setExperiencia(this.espectador.getExperiencia() + 1);
        this.filme.setReproduzindo(true);
    }
    
    //METODOS
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    public void avaliar (float porc) {
        float nota;
        if (porc <= 20) {
            nota = 2;
        } else if (porc <= 40) {
            nota = 4;
        } else if (porc <= 60) {
            nota = 6;
        } else if (porc <= 80) {
            nota = 8;
        } else if (porc > 80) {
            nota = 10;
        }
        
    }
    
    //GETERS E SETERS
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    //TO STRING
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + "\nfilme=" + filme + '}';
    }
    
}
