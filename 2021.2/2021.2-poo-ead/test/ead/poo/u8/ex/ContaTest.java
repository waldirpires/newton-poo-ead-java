package ead.poo.u8.ex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContaTest {

	@Test
	void test_sacar_comValorValido_deveSacarComSucesso() throws Exception {
		// given (dado)
		var conta = new Conta();
		conta.ativar();
		conta.depositar(100);
		
		// teste
		conta.sacar(50.0f);
		
		// asserções
		Assertions.assertEquals(50.0f, conta.getSaldo());		
	}

	@Test
	void test_sacar_comValorNegativo_develancarErro() {
		// given (dado)
		var conta = new Conta();
		conta.ativar();
		
		// teste
		try {
			conta.sacar(-50.0f);			
		} catch (Exception ex) {
			// asserções
			Assertions.assertEquals("Valor para saque inválido: -50.0", ex.getMessage());
		}		
	}

	@Test
	void test_sacar_comSaldoInsuficiente_develancarErro() {
		// given (dado)
		var conta = new Conta();
		conta.ativar();
		
		// teste
		try {
			conta.sacar(1.0f);			
		} catch (Exception ex) {
			// asserções
			Assertions.assertEquals("Saldo insuficiente.", ex.getMessage());
		}		
	}

	@Test
	void test_sacar_comContaBloqueada_develancarErro() {
		// given (dado)
		var conta = new Conta();
		conta.depositar(1);
		
		// teste
		try {
			conta.sacar(1.0f);			
		} catch (Exception ex) {
			// asserções
			Assertions.assertEquals("Conta está bloqueada.", ex.getMessage());
		}		
	}

}
