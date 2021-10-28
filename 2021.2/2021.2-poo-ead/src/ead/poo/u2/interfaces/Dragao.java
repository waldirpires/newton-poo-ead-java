package ead.poo.u2.interfaces;

public class Dragao implements Passaro, Lagarto{

    @Override
    public void andarNoChao() {
        System.out.println("Andando no chao . . .");        
    }

    @Override
    public void voar() {
        System.out.println("Voando . . .");        
    }
    
}
