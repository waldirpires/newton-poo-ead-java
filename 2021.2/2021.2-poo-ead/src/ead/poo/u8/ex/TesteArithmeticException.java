package ead.poo.u8.ex;

public class TesteArithmeticException {
	
	public static void main(String[] args) {
	
		int a = 2;
		int b = 0;
		
		try {
			
			int r = a / b;
			
			System.out.println(r);	
						
		}catch (ArithmeticException ex) {
			System.out.println("ERRO: tentantiva de divisão por zero");
		}
		
		System.out.println("FIM");
	}

}
