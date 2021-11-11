package ead.poo.u4.composicao;

import java.time.LocalDateTime;

/**
 * Classe responsável por definir o elemento de nota fiscal.
 */
public class NotaFiscal {
    
    private static int numero;

    private static final float PI = 3.14f;

    /**
     * data de criaçao da nota.
     */
    private LocalDateTime dataDeCriacao;

    private ItemNotaFiscal [] itens;

    // construtor
    public NotaFiscal(ItemNotaFiscal [] itens) {
        if (itens !=null && itens[0] == null) {
            throw new RuntimeException("Lista de itens de nota vazia!!!");
        }

        this.itens = itens;
        this.dataDeCriacao = LocalDateTime.now();
        numero++;
    }

    public ItemNotaFiscal[] getItens() {
        return itens;
    }

    public void exibir() {
        System.out.println("Data de criação: "+ dataDeCriacao);

        for (int i = 0; i < itens.length; i++) {
            var item = itens[i];

            System.out.println(item);

        }

        // exibir valor total da nota
    }
}
