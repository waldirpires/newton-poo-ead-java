package br.newton.ead.poo.u4.classeassociacao;

public class Aluno {
    private String codigo;
    private String nome;

    public Aluno(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
            "codigo='" + codigo + '\'' +
            ", nome='" + nome + '\'' +
            '}';
    }
}
