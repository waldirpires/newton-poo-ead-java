package u6.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    // List e ArrayList
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno a) {
        alunos.add(a);
    }

    public void adicionarAluno(int pos, Aluno a) {
        alunos.add(pos, a);
    }

    public int getQuantidade() {
        return alunos.size();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void imprimirAlunos() {
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }
}
