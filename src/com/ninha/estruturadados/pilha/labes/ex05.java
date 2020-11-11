package com.ninha.estruturadados.pilha.labes;

import java.util.Scanner;

import com.ninha.estruturadados.pilha.Pilha;

public class ex05 {

	public static void main(String[] args) {
	
		imprimeResultado("ADA");
		
	}

	public static void imprimeResultado(String palavra) { 
		System.out.println(palavra + " >> é polindromo ? >>> " + testaPolindromo(palavra));
	}
	
	
	public static boolean testaPolindromo(String palavra) { 
		
		Pilha<Character> pilha = new Pilha<>(); 
		
		for(int i=0; i<palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}
		
		String palavraInversa = ""; 
		while(!pilha.estaVazia()) { 
			palavraInversa += pilha.desempilha(); 
		}
	
		if(palavraInversa.equalsIgnoreCase(palavra)) {
			return true; 
		}
		
		return false; 
	
	}
}
