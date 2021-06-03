package br.newton.ead.poo.u5.holerite.empresa;

public class Cargo {

    private String codigo;
    private String nome;
    private float salarioBase;
    private FormaPagamentoSalario formaPagamentoSalario;

    public Cargo(
        String codigo,
        String nome,
        float salarioBase,
        FormaPagamentoSalario formaPagamentoSalario
    ) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.formaPagamentoSalario = formaPagamentoSalario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public FormaPagamentoSalario getFormaPagamentoSalario() {
        return formaPagamentoSalario;
    }

    public void setFormaPagamentoSalario(FormaPagamentoSalario formaPagamentoSalario) {
        this.formaPagamentoSalario = formaPagamentoSalario;
    }

    @Override
    public String toString() {
        return "Cargo{" +
            "codigo='" + codigo + '\'' +
            ", nome='" + nome + '\'' +
            ", salarioBase=" + salarioBase +
            ", formaPagamentoSalario=" + formaPagamentoSalario +
            '}';
    }
}
