package ead.poo.u8.ex;

public class Conta {

	private float saldo;
	
	private int estado; // 0: bloqueado, 1:ativo, 2: encerrado
	
	public void sacar(float valor) throws Exception{
		// valor não pode ser negativo
		if (valor <= 0) {
			throw new Exception("Valor para saque inválido: " + valor);
		}

		// o saldo deve ser suficiente para o saque
		if (valor > saldo) {
			throw new Exception("Saldo insuficiente.");
		}
		
		if (estado != 1) {
			throw new ContaBloqueadaException("Conta está bloqueada.");
		}
		
		// efetivação do saque na conta
		saldo = saldo - valor;
	}
	
	public void depositar(float valor) {
		// adicionar tratamento de fluxos alternativos no depósito
		saldo = saldo + valor;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void ativar() {
		estado = 1;
	}
}
