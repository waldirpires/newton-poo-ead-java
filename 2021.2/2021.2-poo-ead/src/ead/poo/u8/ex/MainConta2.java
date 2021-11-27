package ead.poo.u8.ex;

public class MainConta2 {

	public static void main(String[] args) {
		var conta = new Conta();
		
		conta.ativar();
		// depósito
		conta.depositar(100.0f);
		System.out.println("SALDO: " + conta.getSaldo() + "\n");

		try {
			// sacar um valor válido
			conta.sacar(10.0f);
			System.out.println("SALDO: " + conta.getSaldo() + "\n");
			
			// saque inválido
			conta.sacar(100.0f);
			System.out.println("SALDO: " + conta.getSaldo() + "\n");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("FIM");
	}
}
