package com.ninha.estruturadados.pilha.teste;

import java.util.Stack;

import com.ninha.estruturadados.pilha.Pilha;

public class Teste {

	public static void main(String[] args) {
		
		//LIFO - last in first out - último a entrar, primeiro a sair
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>(); 
		
		System.out.println(stack.isEmpty()); //está vazia
		
		for ( int i=1; i<10; i++) {
			stack.push(i); //empilha
		}
		System.out.println(stack.isEmpty());
		System.out.println(stack.size()); // tamanho
		System.out.println(stack);
		
		System.out.println(stack.peek()); //topo
		
		int elemento = stack.pop();	//desempilha
		System.out.println(elemento);
		System.out.println(stack.size());
		System.out.println(stack);
		System.out.println(stack.peek());		
		
		
		
		
		
	}

}
