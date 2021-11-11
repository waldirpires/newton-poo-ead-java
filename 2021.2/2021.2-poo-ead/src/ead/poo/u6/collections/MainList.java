package ead.poo.u6.collections;

import java.util.ArrayList;

public class MainList {

	public static void main(String[] args) {
		
		var cidades = new ArrayList<String>(); // dinâmico
		
		cidades.add("Belo Horizonte");
		cidades.add("Contagem");
		cidades.add("Betim");
		cidades.add("Lagoa Santa");
		
		System.out.println("Tamanho: " + cidades.size());
		
		System.out.println("Existe: " + cidades.contains("Nova Lima"));
		
		for (int i = 0; i < cidades.size(); i++) { // for clássico
			var cidade = cidades.get(i);
			System.out.println("Cidade: " + cidade);
		}
		
		for (var cidade: cidades) { // for avançado
			System.out.println("Cidade: " + cidade);
		}
		
		cidades.remove(0);
		System.out.println(cidades);
	}
}
