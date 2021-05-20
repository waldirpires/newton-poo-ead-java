package br.newton.ead.poo.u3.ex2.dragao;

public class Main {

    public static void main(String[] args) {
        var dragao = new Dragao();

        var castelo = new Castelo();

        // janela
        castelo.entrarPelaJanela(dragao);

        // porta
        castelo.entrarPeloPortal(dragao);

        dragao.cuspirFogo();
    }

}
