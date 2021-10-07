package Paremetros_Leitura;

import java.util.Scanner;

public class Carro_1 {
    String marca;
    String cor;
    int velocidade;


    void buzinar(){
        System.out.println("buzinou");
    }

    void acelerar(int valor){ // VARIAVEL QUE SÓ FUNCIONA DENTRO DO METODO 
        Scanner ler = new Scanner(System.in);
        System.out.println("O quanto voce deseja acelerar: ");
        valor = ler.nextInt();
        velocidade = velocidade + valor;
        System.out.println("Velocidade: " + velocidade);
    }

    void desacelerar(int valor){
        Scanner ler = new Scanner(System.in);
        System.out.println("O quanto voce deseja desacelerar: ");
        valor = ler.nextInt();
        velocidade = velocidade - valor;
        System.out.println("Velocidade: " + velocidade);
    }
    
}
