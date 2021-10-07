package Funcionario;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
         
        System.out.println("Digite o nome do Funcionario: ");
        String nome = input.nextLine();
        System.out.println("Digite o sobrenome do Funcionario: ");
        String sobrenome = input.nextLine();
        System.out.println("Digite o valor por hora do funcionario:  ");
        float valor = input.nextFloat();
        System.out.println("Digite a quantidade de horas trabalhadas");
        int horas = input.nextInt();
       
        Funcionario funcionario = new Funcionario(nome, sobrenome, valor, horas);
        System.out.println(funcionario.nome + " " + funcionario.sobrenome);


    }
}
