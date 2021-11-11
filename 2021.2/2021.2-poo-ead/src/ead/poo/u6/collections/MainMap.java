package ead.poo.u6.collections;

import java.util.HashMap;

public class MainMap {

	public static void main(String[] args) {
		var tabela = new HashMap<Integer, String>(); // tabela de dispersão
		
		System.out.println("Tamanho: "+ tabela.size());
		System.out.println("Tabela: " + tabela);
		
		tabela.put(1, "Minas Gerais");
		tabela.put(2, "Sao Paulo");
		tabela.put(3, "Rio de Janeiro");
		tabela.put(4, "Espirito Santo");
		
		System.out.println("Tamanho: "+ tabela.size());
		System.out.println("Tabela: " + tabela);

		System.out.println(tabela.get(2));
		
		for (var chave: tabela.keySet()) {
			var valor = tabela.get(chave);
			System.out.println(chave + " -> " + valor);
		}
		
		tabela.remove(3);
		
		System.out.println("Tamanho: "+ tabela.size());
		System.out.println("Tabela: " + tabela);		
	}
}
