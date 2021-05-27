package br.newton.ead.poo.u4.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nome;

    private List<Disciplina> disciplinas;

    public Curso(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;

        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina d) {
        this.disciplinas.add(d);
        d.setCurso(this);
    }

    public void removerDisciplina(Disciplina d) {
        this.disciplinas.remove(d);
        d.setCurso(null);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Curso{" +
            "codigo='" + codigo + '\'' +
            ", nome='" + nome + '\'' +
            ", disciplinas=" + disciplinas +
            '}';
    }
}
