package br.newton.ead.poo.u4.agregacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void adicionarDisciplina() {
        // given
        var c = new Curso("001", "teste");
        var d = new Disciplina("002","teste2");

        // test
        c.adicionarDisciplina(d);

        // assert
        assertTrue(c.getDisciplinas().contains(d));
        assertEquals(d.getCurso(), c);
    }

    @Test
    void removerDisciplina() {
    }
}