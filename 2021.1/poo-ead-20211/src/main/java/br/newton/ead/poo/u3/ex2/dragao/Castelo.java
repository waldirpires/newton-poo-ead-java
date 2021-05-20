package br.newton.ead.poo.u3.ex2.dragao;

public class Castelo {

    void entrarPelaJanela(Passaro x) {
        // somente passaro
        System.out.println("Entrou pela janela: " + x);
    }

    void entrarPeloPortal(Lagarto y) {
        // somente lagarto
        System.out.println("Entrou pelo portão: " + y);
    }
}
