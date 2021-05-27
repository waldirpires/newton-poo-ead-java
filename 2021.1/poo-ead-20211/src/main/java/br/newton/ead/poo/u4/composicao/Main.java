package br.newton.ead.poo.u4.composicao;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var parede1 = new Parede("verde");
        var parede2 = new Parede("amarela");
        var parede3 = new Parede("azul");
        var parede4 = new Parede("branco");

        var lista = new ArrayList<Parede>();
        lista.add(parede1);
        lista.add(parede2);
        lista.add(parede3);
        lista.add(parede4);

        for (var parede: lista) {
            System.out.println(parede);
            System.out.println();
        }
        System.out.println();

        var casa = new Casa(lista);
        System.out.println(casa);
    }
}
