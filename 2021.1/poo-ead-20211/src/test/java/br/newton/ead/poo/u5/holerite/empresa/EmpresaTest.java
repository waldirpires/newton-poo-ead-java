package br.newton.ead.poo.u5.holerite.empresa;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void realizarAdmissaoFuncionario_entradasCorretas_deveAdmitirFuncionario() {
        // Dado:
        var e = new Empresa("Newton Paiva SW", "123.456/0001-32", "Caiçara, BH");

        // criar cargos
        var c = new Cargo("001", "Analista", 2500.0f, FormaPagamentoSalario.MENSAL);
        e.adicionarCargo(c);

        // criar funcionario, realizar admissao
        var f = new Funcionario("0001", "José Pereira", "123.456.789-01", "CB-01");
        f.setCargo(c);

        // Teste:
        var resultado = e.realizarAdmissaoFuncionario(f);

        // Verificação:
        assertTrue(resultado);
        assertTrue(e.getFuncionarios().contains(f));
        assertEquals(LocalDate.now(), f.getDataAdm());
    }

    @Test
    void realizarAdmissaoFuncionario_funcionarioJahExiste_naoDeveAdmitirFuncionario() {
        // Dado:
        var e = new Empresa("Newton Paiva SW", "123.456/0001-32", "Caiçara, BH");

        // criar cargos
        var c = new Cargo("001", "Analista", 2500.0f, FormaPagamentoSalario.MENSAL);
        e.adicionarCargo(c);

        // criar funcionario, realizar admissao
        var f = new Funcionario("0001", "José Pereira", "123.456.789-01", "CB-01");
        f.setCargo(c);

        e.realizarAdmissaoFuncionario(f);

        // Teste:
        var resultado = e.realizarAdmissaoFuncionario(f);

        // Verificação:
        assertFalse(resultado);
        assertEquals(1, e.getFuncionarios().size());
    }

    @Test
    void realizarAdmissaoFuncionario_funcionarioSemCargo_naoDeveAdmitirFuncionario() {
        // Dado:
        var e = new Empresa("Newton Paiva SW", "123.456/0001-32", "Caiçara, BH");

        // criar cargos
        var c = new Cargo("001", "Analista", 2500.0f, FormaPagamentoSalario.MENSAL);
        e.adicionarCargo(c);

        // criar funcionario, realizar admissao
        var f = new Funcionario("0001", "José Pereira", "123.456.789-01", "CB-01");

        // Teste:
        var resultado = e.realizarAdmissaoFuncionario(f);

        // Verificação:
        assertFalse(resultado);
        assertEquals(0, e.getFuncionarios().size());
        assertNull(f.getDataAdm());
    }
}