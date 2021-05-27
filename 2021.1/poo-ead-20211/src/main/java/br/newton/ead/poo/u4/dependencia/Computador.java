package br.newton.ead.poo.u4.dependencia;

public class Computador {

    public void imprimir(String texto, Impressora impressora) {
        System.out.println("imprimindo texto: " + texto);

        impressora.imprimir(texto);
    }
}
