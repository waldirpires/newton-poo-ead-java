package ead.poo.u2.interfaces;

public class Main {
    
    static void entrarPelaJanela(Passaro p) {
        p.voar();
    }

    static void entrarPelaPorta(Lagarto l) {
        l.andarNoChao();
    }

    public static void main(String[] args) {
        var dragao = new Dragao();

        entrarPelaJanela(dragao);

        entrarPelaPorta(dragao);
    }
}
