package com.ninha.estruturadados.pilha.labes;

import java.util.Scanner;

import com.ninha.estruturadados.pilha.Pilha;

public class ex02 {

	public static void main(String[] args) {

		Pilha<Integer> pilhaPar = new Pilha<Integer>();
		Pilha<Integer> pilhaImpar = new Pilha<Integer>();

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<10; i++) { 

			System.out.print("Entre com um número: ");

			int num = sc.nextInt();

			if (num == 0) { 

				//pilhar par

				Integer desempilhado = pilhaPar.desempilha(); 

				if (desempilhado == null) { 
					System.out.println("Pilha par vazia!");
				} else { 
					System.out.println("Desempilhando da pilhar par: " + desempilhado);
				}

				//pilha impar 

				desempilhado = pilhaImpar.desempilha(); 

				if(desempilhado == null) { 
					System.out.println("Pilha impar vazia!");
				} else {
					System.out.println("Desempilhando a pilha impar: " + desempilhado);
				}


			} else if (num % 2 == 0) { 
				System.out.println("Número par, empilhando na pilhar pra: " + num);
				pilhaPar.empilha(num);
			} else { 
				System.out.println("Número impar, empilhando na pilha impar: " + num);
				pilhaImpar.empilha(num);
			}
		}

		System.out.println("Desempilhando todos os números da pilha par");
		
		while(!pilhaPar.estaVazia()) {
			System.out.println("Desempilhando da pilha par: " + pilhaPar.desempilha());
		}
		
		System.out.println("Desempilhando todos os números da pilha impar");
		
		while(!pilhaImpar.estaVazia()) { 
			System.out.println("Desempilhando da pilha impar:  " + pilhaImpar.desempilha());
		}
	}
}
