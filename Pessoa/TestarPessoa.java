package Pessoa;

public class TestarPessoa {
    public static void main(String[] args) { // MAIN :SYNTAX QUE FAZ O PRGRAMA RODAR DEVE SER EXECUTADO NA CLASSE PARA TESTAR O PROGRAMA
        Pessoa p = new Pessoa(); // INSTANCIANDO A CLASSE, CRIANDO UM OBJETO A PARTIR DA CLASSE CRIADA, NESSE CASO A CLASSE "PESSOA"


        p.dizerOnome();    // CHAMANDO OS METODOS CRIADOS NA CLASSE PESSOA 
        p.dizerAIdade();
        p.fazerAniversario();


    }
}
