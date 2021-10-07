package Exercicios;
import java.util.Scanner;
//1. Calcular e mostrar a metade de um número.


public class ex1 {
    public static void main(String[] args) {
        int n, r;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        n = ler.nextInt();
        r = n / 2;
        System.out.println("A metade de " + n + " é: "+ r );    
    }
}
