package br.newton.ead.poo.u4.classeassociacao;

import java.time.LocalDate;

import br.newton.ead.poo.u4.agregacao.Curso;

public class MainClasseAssociacao {

    public static void main(String[] args) {
        // curso
        var c = new Curso("TADS", "Sistemas de Informação");
        System.out.println(c + "\n");

        // aluno
        var a = new Aluno("2020.1.0002", "José Pereira");
        System.out.println(a + "\n");

        // matricula - classe de associacao
        var m = new Matricula(
            a,
            c,
            LocalDate.now(),
            "CRIADA",
            "000121",
            "2021/1"
        );
        System.out.println(m + "\n");
    }
}
