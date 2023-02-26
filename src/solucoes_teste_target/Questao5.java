package solucoes_teste_target;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String string = scan.nextLine();
        scan.close();
      
        char[] arraychars = string.toCharArray();
        int left = 0;
        int right = arraychars.length - 1;

        while (left < right) {
            char temp = arraychars[left];
            arraychars[left] = arraychars[right];
            arraychars[right] = temp;
            left++;
            right--;
        }
        
        String stringReversa = new String(arraychars);
        System.out.println("String invertida: " + stringReversa);
    }
}
