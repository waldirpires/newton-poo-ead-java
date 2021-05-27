package br.newton.ead.poo.u4.composicao;

public class Parede {
    private String cor;

    public Parede(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Parede{" +
            "cor='" + cor + '\'' +
            '}';
    }
}
