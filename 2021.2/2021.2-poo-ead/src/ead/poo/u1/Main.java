package ead.poo.u1;

public class Main {

	  public static void main(String[] args) {
		    // instanciamos o objeto a partir da classe
		    Conta conta = new Conta("José Pereira", 100.0f, "12345-6", "432-1");
		    
		    // setando os atributos do objeto
		    // conta.nomeCorrentista = "José Pereira";
		    // conta.saldo = 100.0f;
		    // conta.numero = "12345-6";
		    // conta.agencia = "432-1";

		    // depositar 100
		    conta.depositar(100f);
		    // sacar 50
		    conta.sacar(250);

		    System.out.println("Saldo da conta: " + conta.obterSaldo());

		    conta.encerrar();

		    System.out.println("Saldo da conta: " + conta.obterSaldo());
		    System.out.println("Estado da conta:" + conta.obterEstado());
		  }
}
