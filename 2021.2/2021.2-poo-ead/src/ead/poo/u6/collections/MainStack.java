package ead.poo.u6.collections;

import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {
		// FILO ou LIFO
		
		var pilha = new Stack<String>();
		
		System.out.println("Pilha: " + pilha);
		
		// empilhar
		pilha.push("azul");
		pilha.push("amarelo");
		pilha.push("verde");
		pilha.push("branca");
		pilha.push("vermelho");
		
		System.out.println("Pilha: " + pilha);

		// topo
		System.out.println(pilha.peek());
		
		// desempilhar
		System.out.println("Desempilha: " + pilha.pop());
		System.out.println("Pilha: " + pilha);

		while (!pilha.isEmpty()) {
			System.out.println("Desempilha: " + pilha.pop());
			System.out.println("Pilha: " + pilha);
		}
	}
}
