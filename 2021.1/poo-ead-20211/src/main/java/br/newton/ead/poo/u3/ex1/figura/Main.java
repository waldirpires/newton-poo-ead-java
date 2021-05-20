package br.newton.ead.poo.u3.ex1.figura;

public class Main {

    public static void main(String[] args) {
        var f = new Quadrado(3.4f);

        var f2 = new Circulo(5.0f);

        System.out.println(f);
        System.out.println();

        System.out.println(f2);
        System.out.println();

        System.out.println(f.getNome() + " - área: " + f.calcularArea());
        System.out.println();
        System.out.println(f2.getNome() + " - área: " + f2.calcularArea());
    }

}
