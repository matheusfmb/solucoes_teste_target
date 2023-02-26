package solucoes_teste_target;

import java.util.Scanner;

public class Questao2 {
	/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
	escreva um programa na linguagem que desejar onde,
	informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
	*/
	private static int numero;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.println("Informe um número: ");
		numero = scan.nextInt();
		scan.close();	
		if(verificar()) {
			System.out.println("O número "+numero+" pertence a sequência de Fibonacci");
		}
		else {
			System.out.println("O número "+numero+" Não pertence a sequência de Fibonacci");
		}
	}
	public static boolean verificar() {
		int i = 0;
        int k = 1;
        int j = 1;

        while (j < numero) {
            j = i + k;
            i = k;
            k = j;
        }
        if (j == numero) {
            return true;
        } else {
            return false;
        }
    }
}

