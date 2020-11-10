package pilha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class exemplo {

	static String calculoResultado;
	static Float recebeValorDireita;
	static Float recebeValorEsquerda;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String operador;
		Float valorDaDireita;
		Float valorDaEsquerda;

		char c = '\u0000';

		String input = scanner.nextLine();
		StringBuffer numBuffer = new StringBuffer();

		Stack<Float> stack = new Stack<>();
		List<String> operadores = new ArrayList<String>();

		System.out.println("input:" + input);
		System.out.println("numBuffer: " + numBuffer);

		for (int i = 0; i < input.length(); i++) {
			c = input.charAt(i);
			System.out.println("c: " + c);

			if (Character.isDigit(c) || c == ',' || c == '.') {
				numBuffer.append(c);
				System.out.println("numBuffer: " + numBuffer);
			} else {
				if (numBuffer.length() > 0) {
					try {
						float numero = Float.parseFloat(numBuffer.toString());
						System.out.println("numero: " + numero);
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
					stack.push(Float.parseFloat(recebeOperador));
					operadores.add(recebeOperador);
				}
			}
		}
		System.out.println("Notação pós-fixada é igual a: " + stack);
		
		calculoResultado = operador = operadores.remove(operadores.size() - 1);
		System.out.println("Operador: " + calculoResultado);

		if (stack != null) {
			recebeValorDireita = valorDaDireita = stack.pop();
			System.out.println("Valor Direita: " + recebeValorDireita);
			recebeValorEsquerda = valorDaEsquerda = stack.pop();
			System.out.println("Valor Esquerda: " + recebeValorEsquerda);
		}
		Float resultado = calculo(recebeValorDireita, recebeValorEsquerda, calculoResultado);
		stack.push(resultado);
		System.out.println("Resultado:" + resultado);
		scanner.close();
	}

	public static float calculo(Float resultado1, Float resultado2, String operador) {

		if (calculoResultado.equals("/")) {
			return resultado1 / resultado2;
		} else if (calculoResultado.equals("*")) {
			return resultado1 * resultado2;
		} else if (calculoResultado.equals("-")) {
			return resultado1 - resultado2;
		} else if (calculoResultado.equals("+")) {
			return resultado1 + resultado2;
		} else {
			return 0;
		}
	}
	
}
