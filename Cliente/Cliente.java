package Cliente;
import java.util.Scanner;

public class Cliente {
    int conta;
    String nome;
    float saldo;

    void Cadastro(){ //Cadastrar cliente: ler do usuário o nome do cliente e o número da conta
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite o número da conta: ");
        conta = ler.nextInt();

    }

    void Depositar(float n){//Depositar: ler do usuário um valor a ser depositado na conta do mesmo
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual valo que deseja depositar?: ");
        n = ler.nextFloat();
        saldo = saldo + n;

    }
    
    void Sacar(float n){//Sacar: ler do usuário um valor a ser sacado da conta do cliente
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual valo que deseja sacar?: ");
        n = ler.nextFloat();
        saldo = saldo - n;


    }

    void Extrato(){//Extrato: exibir o nome do cliente, a conta e o saldo.
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: " + saldo);

    }
}

//Faça um programa em Java, conforme definições abaixo:

//Leia do usuario uma senha, que deve ser 1234. Use uma constante para testar a senha.

//O sistema só irá liberar o menu de opções abaixo se a senha estiver correta. O usuário tem 3 tentativas de acessar o sistema. Caso ele não acerte a senha, o sistema deve ser finalizado.

//Menu de  opções:

//1 - Cadastrar cliente: ler do usuário o nome do cliente e o número da conta
//2 - Depositar: ler do usuário um valor a ser depositado na conta do mesmo
//3 - Sacar: ler do usuário um valor a ser sacado da conta do cliente
//4 - Extrato: exibir o nome do cliente, a conta e o saldo.
//5 - Sair
//Use a criatividade para fazer algumas validações.

