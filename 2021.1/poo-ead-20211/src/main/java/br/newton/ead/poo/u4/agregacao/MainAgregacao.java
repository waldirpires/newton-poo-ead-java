package br.newton.ead.poo.u4.agregacao;

public class MainAgregacao {

    public static void main(String[] args) {
        var d = new Disciplina(
            "TADS-001",
            "Programação Orientada por Objetos"
        );
        System.out.println(d + "\n");

        var d2 = new Disciplina(
            "TADS-002",
            "Estruturas de Dados"
        );
        System.out.println(d2 + "\n");

        var c = new Curso(
            "TADS",
            "Sistemas de Informação"
        );
        System.out.println(c + "\n");

        c.adicionarDisciplina(d);
        System.out.println(c + "\n");
        System.out.println(d + "\n");
        System.out.println();

        c.adicionarDisciplina(d2);
        System.out.println(c + "\n");
        System.out.println(d2 + "\n");
        System.out.println();

        c.removerDisciplina(d2);
        System.out.println(c + "\n");
        System.out.println(d2 + "\n");
        System.out.println();

    }
}
