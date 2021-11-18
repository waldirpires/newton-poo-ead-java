package ead.poo.u7.dialogo;

import javax.swing.JOptionPane;

public class MainDialogo {

	
	public static void main(String[] args) {
		// entrada: número inteiro 
		var entrada = JOptionPane.showInputDialog("Digite um número inteiro:");
		
		// converte de string para inteiro
		var n = Integer.parseInt(entrada);
		
		// saída: se o número é PAR ou IMPAR
		String msg = null;
		if (n % 2 == 0) {
			msg = "O número ["+n+"] informado é PAR.";
		} else {
			msg = "O número ["+n+"] informado é IMPAR.";
		}
		
		// resultado
		JOptionPane.showMessageDialog(null, msg);
	}
}
