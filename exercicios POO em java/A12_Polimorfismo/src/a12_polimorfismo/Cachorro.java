package a12_polimorfismo;
public class Cachorro extends Mamifero{
    
    //POLIMORFISMO SOBRECARGA
    public void reagir (String frase) {
        if (frase.equals("OI DOGUINHO") || frase.equals("PEGA A BOLA")) {
            System.out.println("ABANAR O RABO");
        } else {
            System.out.println("ROSNAR");
        }
    }
    public void reagir (int hora) {
        if (hora < 18) {
            System.out.println("BRINCAR");
        } else {
            System.out.println("DORMIR");
        }
    }
    public void reagir (boolean dono) {
        if (dono) {
            System.out.println("CACHORRO FELIZ");
        } else {
            System.out.println("CACHORRO TRISTE");
        }
    }
}
