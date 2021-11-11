package ead.poo.u4.composicao;

public class ItemNotaFiscal {

    private String codigo;

    private int quantidade;

    private String descricao;

    private float valor;
    
    // construtor
    public ItemNotaFiscal(String codigo, int quantidade, String descricao, float valor) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return  getCodigo() + "\t" + getDescricao() + "\t" + getQuantidade() + 
        "\t" + getValor();
    }
}
