package br.newton.ead.poo.u4.dependencia;

public class MainDependencia {

    public static void main(String[] args) {
        var i = new Impressora();

        var c = new Computador();

        c.imprimir("hello world", i);
    }
}
