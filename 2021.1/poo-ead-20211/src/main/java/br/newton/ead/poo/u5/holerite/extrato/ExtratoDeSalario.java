package br.newton.ead.poo.u5.holerite.extrato;

import java.time.LocalDate;
import java.util.List;

import br.newton.ead.poo.u5.holerite.empresa.Empresa;
import br.newton.ead.poo.u5.holerite.empresa.Funcionario;

/**
 * Classe responsável por agregar um extrato de salário de um funcionario
 */
public class ExtratoDeSalario {

    private int ano;
    private int mes;
    private LocalDate data;
    private float totalComDesconto;
    private float totalSemDesconto;
    private float horasTrabalhadas;
    private float horasFalta;
    private float irpf;
    private float inss;

    private Empresa empresa;
    private Funcionario funcionario;

    private List<ItemDeExtrato> itens;

    public ExtratoDeSalario(
        int ano,
        int mes,
        float horasTrabalhadas,
        float horasFalta,
        List<ItemDeExtrato> itens
    ) {
        this.data = LocalDate.now();
        this.ano = ano;
        this.mes = mes;
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasFalta = horasFalta;
        this.itens = itens;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public LocalDate getData() {
        return data;
    }

    public float getTotalComDesconto() {
        return totalComDesconto;
    }

    public float getTotalSemDesconto() {
        return totalSemDesconto;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public float getHorasFalta() {
        return horasFalta;
    }

    public float getIrpf() {
        return irpf;
    }

    public float getInss() {
        return inss;
    }

    public List<ItemDeExtrato> getItens() {
        return itens;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void exibir() {
        // informacoes da empresa
        System.out.println(empresa);

        // informacoes do funcionario
        System.out.println(funcionario);

        System.out.println("Ano/Mês: " + this.ano + "/" + this.mes);
        System.out.println("Horas Trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Horas Falta: " + this.horasFalta);

        // listar os itens
        ItemDeExtrato salario = null;
        ItemDeExtrato inss = null;

        this.totalSemDesconto = 0.0f;

        for (var item: itens) {
            System.out.println(item);

            // calcular o valor total sem desconto
            this.totalSemDesconto += item.getValor();
            if (item.getCodigo().equals("001")) {
                salario = item;
            } else if (item.getCodigo().equals("002")) {
                inss = item;
            }
        }

        // calcular IRPF - 15%
        this.irpf = salario.getValor() * 0.15f;

        this.inss = inss.getValor();

        // calcular o valor total com desconto
        this.totalComDesconto = this.totalSemDesconto - this.irpf;

        System.out.println();
        System.out.println("Total sem descontos: " + this.totalSemDesconto);
        System.out.println("Total com descontos: " + this.totalComDesconto);
        System.out.println("IRPF: " + this.irpf);
        System.out.println("INSS: " + this.inss);
    }
}
