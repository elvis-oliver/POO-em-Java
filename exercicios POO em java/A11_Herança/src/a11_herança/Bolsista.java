package a11_herança;
public class Bolsista extends Aluno{
    
    //ATRIBUTOS
    private float bolsa;
    
    //METODOS
    public void renovarBolsa () {
        System.out.println("Renovando bolsa do aluno: " + this.getNome());
    }
    @Override
    public void pagarMensalidade () {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }
    
    //GETERS E SETERS
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
