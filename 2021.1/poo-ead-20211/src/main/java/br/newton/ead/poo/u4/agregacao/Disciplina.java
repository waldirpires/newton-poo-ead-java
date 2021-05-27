package br.newton.ead.poo.u4.agregacao;

public class Disciplina {
    private String codigo;
    private String nome;

    private Curso curso;

    public Disciplina(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
            "codigo='" + codigo + '\'' +
            ", nome='" + nome + '\'' +
            ", curso=" + (curso != null? curso.getNome(): "null") +
            '}';
    }
}
