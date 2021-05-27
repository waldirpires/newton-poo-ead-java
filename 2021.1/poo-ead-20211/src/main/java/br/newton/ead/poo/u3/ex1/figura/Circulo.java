package br.newton.ead.poo.u3.ex1.figura;

public class Circulo extends Figura {

    private float raio;

    public Circulo(float raio) {
        super("circulo");
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) Math.PI * raio * raio;
    }

    @Override
    public float calcularPerimetro() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", getNome()=" + getNome() + "]";
    }

}