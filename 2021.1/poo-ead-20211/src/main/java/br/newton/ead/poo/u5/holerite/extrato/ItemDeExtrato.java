package br.newton.ead.poo.u5.holerite.extrato;

public class ItemDeExtrato {

    private String codigo;
    private String descricao;
    private String ref;
    private float valor;

    public ItemDeExtrato(String codigo, String descricao, String ref, float valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ref = ref;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ItemDeExtrato{" +
            "codigo='" + codigo + '\'' +
            ", descricao='" + descricao + '\'' +
            ", ref='" + ref + '\'' +
            ", valor=" + valor +
            '}';
    }
}
