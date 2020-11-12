package u1.conta;

public class Banco {
    static final int MAX_CONTAS = 100;
    String agencia;
    String nome;

    Conta[] contas;
    int numContas;
    int capacidade;

    public Banco(String nome, String agencia, int capacidade) {
        this.agencia = agencia;
        this.nome = nome;
        this.capacidade = capacidade;
        contas = new Conta[capacidade];
    }

    public boolean adicionarConta(Conta conta) {
        if (numContas == capacidade) {
            System.out.println("Espaço insuficiente para adição de conta");

            return false; // nao criou
        }

        contas[numContas] = conta;
        numContas++;

        return true; // adicionou no banco
    }
}
