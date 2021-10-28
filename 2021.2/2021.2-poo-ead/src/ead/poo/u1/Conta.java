package ead.poo.u1;

public class Conta {

	  String nomeCorrentista;
	  private float saldo; // acesso restrito
	  String numero;
	  String agencia;
	  int estado; // 0: inativo, 1: ativo, 2: bloqueada, 3: encerrada

	  // construtor customizado
	  public Conta(
	    String nome, 
	    float valor, 
	    String numeroConta, 
	    String agenciaConta
	  ) {
	    nomeCorrentista = nome;
	    saldo = valor;
	    numero = numeroConta;
	    agencia = agenciaConta;
	    estado = 0; // inativo
	  } 

	  public void ativar() {
	    estado = 1;
	  }

	  public void bloquear() {
	    estado = 2;
	  }

	  public void encerrar() {
	    // zerar ela
	    sacar(saldo);
	    // atualizar o estado
	    estado = 3; // encerrada
	  }

	  public void sacar(float valor) {

		// validação do saldo antes do saque
		if (valor > saldo) {
			System.out.println("ERRO: saldo insuficiente para saque - " + valor);

			return;
		}

	    System.out.println("\nSAQUE antes: " + saldo);
	    saldo = saldo - valor;
	    System.out.println("INFO: saque de " + valor + " efetuado com sucesso.");
	    System.out.println("SAQUE depois: " + saldo);
	  }

	  public void depositar(float valor) {
	    System.out.println("\nDEPÓSITO antes: " + saldo);
	    saldo = saldo + valor;
	    System.out.println("INFO: depósito de " + valor + " efetuado com sucesso.");
	    System.out.println("DEPÓSITO depois: " + saldo);
	  }

	  public float obterSaldo() {
	    return saldo;
	  }

	  public int obterEstado() {
	    return estado;
	  }	
}
