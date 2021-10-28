package ead.poo.u2;

public class CarrinhoDeCompras {
    
    // constante
    private static final int MAX = 10;

    private int quant = 0; // default

    private Produto[] produtos;

    public CarrinhoDeCompras() {
        this.produtos = new Produto[MAX];
    }

    public void adicionar(Produto produto) {
        if (quant == MAX) {
            System.out.println("Carrinho cheio!\n");
            
            return;
        }

        produtos[quant] = produto;
        quant++;
    }

    public void remover(Produto produto) {
        for (int i = 0; i < MAX; i++) {
            if (produtos[i] == produto) {
                produtos[i] = null;
                quant--;
                return;
            }
        }
    }

    public void exibir() {
        for (int i = 0; i < MAX; i++) {
            if (produtos[i] != null) {
                System.out.println("Produto: " + produtos[i].getDesc());
            }
        }
    }
}
