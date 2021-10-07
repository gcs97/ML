package Exercicios;
import java.util.Scanner;
//Escreva um programa para ler o nome de dois times de futebol e o número de gols marcados por
//cada time na partida. O programa deve imprimir o nome do time vencedor. Caso não haja vencedor
//deverá ser impresso EMPATE.

public class ex4 {
    public static void main(String[] args) {
        int n1,n2;
        String t1,t2;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do primeiro time: ");
        t1 = ler.nextLine();
        System.out.println("Digite o nome do segundo time: ");
        t2 = ler.nextLine();
        System.out.println("Quantos gols o time " + t1 + " fez?");
        n1 = ler.nextInt();
        System.out.println("Quantos gols o time " + t2 + " fez?");
        n2 = ler.nextInt();

        if (n1>n2) {
            System.out.println(t1 + " Venceu!");
        }
        if (n2>n1) {
            System.out.println(t2 + " Venceu!");
        }
        if (n1==n2 || n2==n1) {
            System.out.println("EMPATE!");
        }
    }
}
