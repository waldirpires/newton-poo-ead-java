package u6.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Banco {

    private Queue<Cliente> fila = new LinkedList<>();

    public void entrarNaFila(Cliente c) {
        fila.offer(c);
    }

    public Cliente sairDaFila() {
        return fila.poll();
    }

    public Cliente obterFrente() {
        return fila.element();
    }

    public int getQuantidade() {
        return fila.size();
    }

    public void imprimirFila() {
        System.out.println("================================================\n");

        for (Cliente c : fila) {
            System.out.println(c);
        }
        System.out.println("================================================\n");

    }
}
