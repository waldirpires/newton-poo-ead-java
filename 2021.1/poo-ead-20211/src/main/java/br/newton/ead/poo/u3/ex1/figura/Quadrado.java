package br.newton.ead.poo.u3.ex1.figura;

public class Quadrado extends Figura {

    private float lado;

    public Quadrado(float lado) {
        super("quadrado");
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return lado * lado;
    }

    @Override
    public float calcularPerimetro() {
        return 0;
    }

    @Override
    public String toString() {
        return "Quadrado [lado=" + lado + ", getNome()=" + getNome() + "]";
    }

}
