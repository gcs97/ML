package Exercicios;
import java.util.Scanner;
//Ler um número e determinar se ele é maior ou igual ou menor do que zero

public class ex3 {
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        n = ler.nextInt();
        if (n>0) {
            System.out.println("o numero é maior que 0.");
        }
        if (n==0) {
            System.out.println("o numero é igual a 0");
        }
        if (n<0) {
            System.out.println("o numero é menor que 0");
        }

    }

}
