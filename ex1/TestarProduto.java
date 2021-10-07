package ex1;
import java.util.Scanner; 

public class TestarProduto {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o nome: ");
    String nome = input.nextLine();
    System.out.println("Digite a modelo: ");
    String modelo = input.nextLine();
    System.out.println("Digite o valor: ");
    float valor = input.nextFloat();

    System.out.println("Nome: " + nome);
    System.out.println("modelo: " + modelo);
    System.out.println("Valor: " + valor);


    Produto produto = new Produto(nome, modelo, valor);
    }
}