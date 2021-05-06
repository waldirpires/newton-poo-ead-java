package u6;

import u6.vetores.Aluno;

public interface EscolaInterface {

    void adicionarAluno(Aluno a);

    int getQuantidade();

    Aluno[] getAlunos();

}