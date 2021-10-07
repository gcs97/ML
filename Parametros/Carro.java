package Parametros;

public class Carro {
    String marca;
    String cor;
    int velocidade;


    void buzinar(){
        System.out.println("buzinou");
    }

    void acelerar(int valor){
        velocidade = velocidade + valor;
        System.out.println("Velocidade: " + velocidade);
    }

    void desacelerar(int valor){
        velocidade = velocidade - valor;
        System.out.println("Velocidade: " + velocidade);
    }
}
