package br.newton.ead.poo.u5.holerite.empresa;

import java.time.LocalDate;

public class Funcionario {

    private String codigo;
    private String nome;
    private String cpf;
    private LocalDate dataAdm;
    private String cbo;

    private Cargo cargo;

    public Funcionario(String codigo, String nome, String cpf, String cbo) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.cbo = cbo;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataAdm() {
        return dataAdm;
    }

    public void setDataAdm(LocalDate dataAdm) {
        this.dataAdm = dataAdm;
    }

    public String getCbo() {
        return cbo;
    }

    public void setCbo(String cbo) {
        this.cbo = cbo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
            "codigo='" + codigo + '\'' +
            ", nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", dataAdm=" + dataAdm +
            ", cbo='" + cbo + '\'' +
            ", cargo='" + cargo + '\'' +
            '}';
    }
}
