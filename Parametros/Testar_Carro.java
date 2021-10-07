package Parametros;

public class Testar_Carro {
    public static void main(String[] args) {
        Carro c = new Carro();
        
        c.velocidade = 0;
        c.marca = "Fiat";
        c.cor = "preto";


        c.acelerar(22);
        c.buzinar();
        c.desacelerar(10);

        
    }
}
