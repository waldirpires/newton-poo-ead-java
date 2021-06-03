package br.newton.ead.poo.u5.holerite;

import java.util.ArrayList;

import br.newton.ead.poo.u5.holerite.empresa.Cargo;
import br.newton.ead.poo.u5.holerite.empresa.Empresa;
import br.newton.ead.poo.u5.holerite.empresa.FormaPagamentoSalario;
import br.newton.ead.poo.u5.holerite.empresa.Funcionario;
import br.newton.ead.poo.u5.holerite.extrato.ExtratoDeSalario;
import br.newton.ead.poo.u5.holerite.extrato.ItemDeExtrato;

public class MainHolerite {

    public static void main(String[] args) {
        // criar empresa
        var e = new Empresa("Newton Paiva SW", "123.456/0001-32", "Caiçara, BH");

        // criar cargos
        var c = new Cargo("001", "Analista", 2500.0f, FormaPagamentoSalario.MENSAL);
        e.adicionarCargo(c);

        // criar funcionario, realizar admissao
        var f = new Funcionario("0001", "José Pereira", "123.456.789-01", "CB-01");
        f.setCargo(c);

        e.realizarAdmissaoFuncionario(f);

        // criar itens de extrato
        var itens = new ArrayList<ItemDeExtrato>();
        // salario total
        var i1 = new ItemDeExtrato("001", "Salário base", "REF01", 2500.0f);
        itens.add(i1);
        // inss
        var i2 = new ItemDeExtrato("002", "INSS", "REF02", -450.f);
        itens.add(i2);
        // beneficios
        var i3 = new ItemDeExtrato("003", "Vale Refeição", "REF04", -30.f);
        itens.add(i3);

        // criar extrato
        var extrato = new ExtratoDeSalario(2021, 5, 170, 0, itens);
        extrato.setEmpresa(e);
        extrato.setFuncionario(f);

        // exibir o holerite
        extrato.exibir();
    }
}
