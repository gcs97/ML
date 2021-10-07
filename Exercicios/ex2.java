package Exercicios;
import java.util.Scanner;
//2. Calcular a idade de uma pessoa, sabendo-se o ano de nascimento.

public class ex2 {
    public static void main(String[] args) {
        int n, r, ano;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual ano você nasceu?: ");
        n = ler.nextInt();
        System.out.println("Digite o ano atual: ");
        ano = ler.nextInt();
        r = ano - n;
        System.out.println("Sua Idade é: " + r );
        
    }
    
}
