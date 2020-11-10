package com.ninha.estruturadados.pilha.teste;

import com.ninha.estruturadados.pilha.Pilha;

public class Teste {

	public static void main(String[] args) {
		
		//LIFO - last in first out - último a entrar, primeiro a sair
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		pilha.empilha(4);
		
		System.out.println(pilha);
		System.out.println("Desempilhando elemento " + pilha.desempilha());
		System.out.println(pilha);
	}

}
