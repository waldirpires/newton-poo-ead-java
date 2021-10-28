package ead.poo.u2;

public class Main {
    
    public static void main(String[] args) {
        var produto = new Produto("TV Smart LCD 49", "http://foto.jpg", 3400.0f);

        System.out.println(produto.getDesc());

        var carrinho = new CarrinhoDeCompras();

        carrinho.exibir();

        carrinho.adicionar(produto);

        carrinho.exibir();

        carrinho.remover(produto);

        carrinho.exibir();
    }
}
