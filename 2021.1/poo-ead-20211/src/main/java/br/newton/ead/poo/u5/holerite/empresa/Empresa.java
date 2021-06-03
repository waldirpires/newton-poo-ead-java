package br.newton.ead.poo.u5.holerite.empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    private String cnpj;
    private String endereço;

    /**
     * Armazena uma lista de funcionarios da empresa.
     */
    private List<Funcionario> funcionarios;

    private List<Cargo> cargos;

    public Empresa(String nome, String cnpj, String endereço) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereço = endereço;

        this.funcionarios = new ArrayList<>();
        this.cargos = new ArrayList<>();
    }

    public boolean realizarAdmissaoFuncionario(Funcionario funcionario) {

        if (this.funcionarios.contains(funcionario)) {
            System.out.println("ERRO: funcionário já existe na empresa!\n");

            return false;
        } else if (funcionario.getCargo() == null) {
            System.out.println("ERRO: funcionário sem cargo!\n");

            return false;
        }

        this.funcionarios.add(funcionario);
        funcionario.setDataAdm(LocalDate.now());

        return true;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public boolean realizarDemissaoFuncionario(Funcionario funcionario) {

        if (!this.funcionarios.contains(funcionario)) {
            System.out.println("ERRO: funcionário NÃO existe na empresa!\n");

            return false;
        } else if (funcionario.getCargo() == null) {
            System.out.println("ERRO: funcionário sem cargo!\n");

            return false;
        }

        this.funcionarios.remove(funcionario);

        return true;
    }

    public void adicionarCargo(Cargo cargo) {
        this.cargos.add(cargo);
    }

    public void removerCargo(Cargo cargo) {
        this.cargos.remove(cargo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Empresa{" +
            "nome='" + nome + '\'' +
            ", cnpj='" + cnpj + '\'' +
            ", endereço='" + endereço + '\'' +
            '}';
    }
}
