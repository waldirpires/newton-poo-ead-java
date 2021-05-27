package br.newton.ead.poo.u4.classeassociacao;

import java.time.LocalDate;

import br.newton.ead.poo.u4.agregacao.Curso;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private LocalDate data;
    private String estado;
    private String numero;
    private String semestre;

    public Matricula(
        Aluno aluno,
        Curso curso,
        LocalDate data,
        String estado,
        String numero,
        String semestre
    ) {
        this.aluno = aluno;
        this.curso = curso;
        this.data = data;
        this.estado = estado;
        this.numero = numero;
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Matricula{" +
            "aluno=" + aluno +
            ", curso=" + curso +
            ", data=" + data +
            ", estado='" + estado + '\'' +
            ", numero='" + numero + '\'' +
            ", semestre='" + semestre + '\'' +
            '}';
    }
}
