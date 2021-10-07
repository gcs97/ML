package Pessoa;
import java.util.Scanner;

public class Pessoa {
String nome;
int idade;
 

    public void dizerOnome(){   
        Scanner ler = new Scanner(System.in); // CRIANDO UM SCANNER PARA ARMAZENAR UMA STRING NUMA VARIAVEL
        System.out.println("Escreva o seu nome:");
        nome = ler.nextLine(); // SEMPRE QUE USAR SCANNER BOTAR O NOME DA VARIAVEL ANTES DA SYNTAX PARA SCANNEAR A VARIAVEL
        System.out.println("Nome:" + nome);
    }

    public void dizerAIdade(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva a sua idade:");
        idade = ler.nextInt(); 
        System.out.println("Idade:" + idade + " anos");
    }

    public void fazerAniversario(){
        idade = idade + 1;
        System.out.println("Feliz Aniversário você fez: " + idade + " anos!");
    }

}
