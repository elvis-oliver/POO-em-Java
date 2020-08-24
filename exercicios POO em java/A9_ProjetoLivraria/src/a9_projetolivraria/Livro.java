package a9_projetolivraria;
public class Livro implements Publicacao {
    //ATRIBUTOS
    String titulo;
    String autor;
    int totPaginas;
    int pagAtual;
    boolean aberto;
    Pessoa leitor;
    
    //METODO CONSTRUTOR
    public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    //METODO
    public String detalhes() {
        return "======LIVRO====== \n" + 
                "titulo: " + titulo + ", autor: " + autor + ", total de paginas: " + totPaginas + ", pagina atual: " + pagAtual + ", aberto: " + aberto + 
                ", \nleitor: " + this.getLeitor().getNome() + ", idade: " + this.getLeitor().getIdade() + ", sexo: " + this.getLeitor().getSexo();
    }
    
    //GETERS E SETERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //METODOS ABSTRATOS
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (this.aberto==false) {
            System.out.println("Você não pode folhear, abra o livro primeiro!");
        } else {
            if (this.totPaginas < p) {
                this.pagAtual = 0;
                System.out.println("O livro só tem: " + this.totPaginas + " paginas");
            } else {
                this.pagAtual = p;   
            }
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto==false) {
            System.out.println("Você não pode folhear, abra o livro primeiro!");
        } else {
            this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if (this.aberto==false) {
            System.out.println("Você não pode folhear, abra o livro primeiro!");
        } else {
            this.pagAtual--;
        }
    }

}
