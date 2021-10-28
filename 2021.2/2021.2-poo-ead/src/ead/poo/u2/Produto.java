package ead.poo.u2;

public class Produto {
    // atributos
    private String desc;
    private String foto;
    private float preco;

    public Produto(String desc, String foto, float preco) {
        this.desc = desc;
        this.foto = foto;
        this.preco = preco;
    }

    public String getDesc() {
        return desc;
    }

    public String getFoto() {
        return foto;
    }

    public float getPreco() {
        return preco;
    }
}
