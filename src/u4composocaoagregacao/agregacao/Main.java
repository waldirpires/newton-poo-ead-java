package u4composocaoagregacao.agregacao;

public class Main {

    public static void main(String[] args) {

        var pessoa = new Pessoa("José Pereira", 34);

        var dependente = new Dependente("Ricard Pereira", 12);
        dependente.setGrauDeParentesco("filho");

        pessoa.adicionarDependente(dependente);

        System.out.println(pessoa);

        System.out.println(dependente);

    }
}
