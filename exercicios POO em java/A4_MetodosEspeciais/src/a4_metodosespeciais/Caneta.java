package a4_metodosespeciais;
public class Caneta {
    public String modelo;
    private float ponta;
    
    /* public Caneta () { //metodo construtor
        this.modelo = "BIC cristal";
        this.ponta = 1;
    }
    */
    public Caneta (String m, float p) {
        setModelo(m);
        setPonta(p);
    }
    
    public String getModelo () {
    return this.modelo;
}
    public void setModelo (String m) {
        this.modelo = m;
    }
    
    public float getPonta () {
        return this.ponta;
    }
    public void setPonta (float p) {
        this.ponta = p;
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
    }
}
