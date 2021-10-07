package Exercicios;
import java.util.Scanner;
//5. Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

public class ex6 {
    public static void main(String[] args) {
    int idade, n = 0;
        for (int i = 1; i <= 20; i++) { // o programa vai se repetir 20 vezes usando o metodo FOR
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite a idade da pessoa: ");
            idade = ler.nextInt();

            if (idade>18) { // se o valor digitado da idade for 18, a variavel 'n' recebe o valor 1 e vai acumulando conforme o numero 18 for digitado
            }
       
            
        }
     System.out.println("Quantidad de maiores de idade: " + n);        
    }
}
