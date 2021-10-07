package Exercicios;
import java.util.Scanner;
//. Um cliente de supermercado fez uma compra de 20 itens. Leia o preço de cada item e calcule o
//total que a pessoa vai pagar

public class ex7 {
    public static void main(String[] args) {  
    float valor = 0;
    float vfinal = 0;   
        for (int i = 1; i < 21; i++) {
        Scanner ler = new Scanner(System.in);
          
            System.out.println("Digite o valor do item numero " + i + " :");
            valor = ler.nextFloat();
            vfinal = vfinal + valor; // soma o valor de cada item digitado
       
            
            
            
                
        }
    System.out.println("valor final:R$" + vfinal);
    }
    
}
