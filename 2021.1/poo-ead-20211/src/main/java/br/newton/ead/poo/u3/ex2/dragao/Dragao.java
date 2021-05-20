package br.newton.ead.poo.u3.ex2.dragao;

public class Dragao implements Passaro, Lagarto {

    private String nome;

    @Override
    public void andar() {
        System.out.println("Dragao andando pelo chao");

    }

    @Override
    public void voar() {
        System.out.println("Dragao voando pelo ceu");
    }

    public void cuspirFogo() {
        System.out.println("FOGO!!!!!");
    }

}
