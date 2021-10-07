package Exercicios;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args){
        int n;
        String s;

        Scanner ler = new Scanner(System.in); // CRIANDO SCANNER PARA RECEBER DADOS

        System.out.println("Informe um Número Inteiro: ");
        n = ler.nextInt(); // escanea variavel inteira
        ler.nextLine(); // esvazia o buffer do teclado
        System.out.println("Informe uma String:");
        s = ler.nextLine();//escanea String

        System.out.println("Numero:" + n);
        System.out.println("String :" + s);



    }
}
