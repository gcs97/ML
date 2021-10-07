package Calendario;
import java.util.Scanner; 



public class TesteCalendario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = input.nextInt();
        System.out.println("Digite o mes: ");
        int mes = input.nextInt();
        System.out.println("Digite o ano: ");
        int ano = input.nextInt();
        
        Calendario c = new Calendario(dia,mes,ano);


    }
}
