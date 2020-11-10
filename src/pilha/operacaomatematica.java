package pilha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class operacaomatematica {

	/* empilhando a expressão aritmetica*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		StringBuffer numBuffer = new StringBuffer();

		Stack<Float> stack = new Stack<>();
		List<String> operadores = new ArrayList<String>();
		
	
		System.out.println("Expressão matemática: " + input);
		System.out.println(" numBuffer: " + numBuffer);


		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			System.out.println("c: " + c);

			if (Character.isDigit(c) || c == ',' || c == '.') {
				numBuffer.append(c);
				System.out.println("numBuffer: " + numBuffer);
			} else {
				if (numBuffer.length() > 0) {
					try {
						float numero = Float.parseFloat(numBuffer.toString());
						System.out.println("número: " + numero);
						stack.push(numero);
					} catch (NumberFormatException nfe) {
						System.out.println("ERRO de sintaxe!");
						return;
					} finally {
						numBuffer = new StringBuffer();
					}
				}
				if (c == '/' || c == '*' || c == '-' || c == '+') {					
					String recebeOperador = String.valueOf(c);
					operadores.add(recebeOperador);
				}
			}
		}
		System.out.println("Números na pilha: " + stack);
		System.out.println("Operadores: " + operadores);		
		
		
		scanner.close();	
		
	/* falta desempilhar e calcular a expressão aritmetica*/ 
	
	
	
	}
}