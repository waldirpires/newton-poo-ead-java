package u4composocaoagregacao.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;

    private int idade;

    private List<Dependente> dependentes = new ArrayList<>();

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDependente(Dependente dep) {
        dependentes.add(dep);
        dep.setResponsavel(this);
    }

    public void removerDependente(Dependente dep) {
        dependentes.remove(dep);
        dep.setResponsavel(null);
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s", nome, idade, dependentes);
    }
}
