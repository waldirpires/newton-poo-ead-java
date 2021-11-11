package ead.poo.u4.composicao;

public class MainComposicao {
    
    public static void main(String[] args) {
        // criar um item de nota
        var item = new ItemNotaFiscal("0001", 1, "TV LED 60 polegadas", 8000.0f);
        var item2 = new ItemNotaFiscal("0015", 1, "Playstation 5", 5500.0f);

        var itens = new ItemNotaFiscal[2];
        itens[0] = item;
        itens[1] = item2;

        // criar a nota
        var nota = new NotaFiscal(itens); // composição via construtor da classe

        nota.exibir();

        var nota2 = new NotaFiscal(itens); // composição via construtor da classe

        nota2.exibir();
    }
}
