package u4composocaoagregacao.agregacao;

public class Dependente {
    private String nome;
    private int idade;
    private String grauDeParentesco;
    private Pessoa responsavel;

    public Dependente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setGrauDeParentesco(String grauDeParentesco) {
        this.grauDeParentesco = grauDeParentesco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public String getGrauDeParentesco() {
        return grauDeParentesco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s, %s", nome, idade, responsavel.getNome(), grauDeParentesco);
    }
}
