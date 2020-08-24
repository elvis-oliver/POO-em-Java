package a5_exercicio;
public class Conta {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //CONSTRUTOR
    public Conta () {
        this.saldo = 0;
        this.status = false;
    }
    //ESTADO ATUAL
    public void estadoAtual () {
            System.out.println("----------------------------------");
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Dono: " + this.getDono());
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Status: " + this.getStatus());
    }   
    //GETERS AND SETERS    
    public int getNumConta () {
        return this.numConta;
    }
    
    public void setNumConta (int nc) {
        this.numConta = nc;
    }
    
    public String getTipo () {
        return this.tipo;
    }
    
    public void setTipo (String t) {
        this.tipo = t;
    }

    public String getDono () {
        return this.dono;
    }
    
    public void setDono (String d) {
        this.dono = d;
    }
    
    public float getSaldo () {
        return this.saldo;
    }
    
    public void setSaldo (float s) {
        this.saldo = s;
    }

    public boolean getStatus () {
        return this.status;
    }
    
    public void setStatus (boolean st) {
        this.status = st;
    }
    
    //METODOS
    public void abrirConta (String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc") {
            this.setSaldo(50);
        } else if (t == "cp") {
            this.setSaldo(150);
    }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta () {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro, saque antes de encerra-la");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com débitos, pagar antes de encerra-la");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada!");
        }
    }
    public void depositar (float v) {
        if (this.getStatus()) {
            this.saldo += v;
            System.out.println("Deposito depositado com sucesso!");
        } else {
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar (float v) {
        if (this.getStatus()==true) {
            if (this.getSaldo() >= v) {
                saldo-= v;
                System.out.println("Saque realizado!");
            } else {
                System.out.println("Saque insuficiente para saldo");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta encerrada!");
        }
    }
    public void pagarMensalidade () {
        int v = 0;
        if (tipo == "cc") {
            v = 12;
        } else if (tipo == "cp") {
            v = 20;
        }
        
        if (this.getStatus()==true) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        
    }
    
    }
