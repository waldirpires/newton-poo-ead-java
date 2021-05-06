package u3herancapolimorfismo.pilha;

public class PilhaImpl implements Pilha {

    public int pop() {
        return 1;
    }

    public void push(int valor) {
    }

    public int peek() {
        return 1;
    }

    public static void main(String[] args) {
        // Pilha p = new Pilha(); // ERRO: interface não pode ser instanciada
        Pilha p2 = new PilhaImpl();
        p2.peek();
        p2.pop();
        p2.push(20);
    }
}
