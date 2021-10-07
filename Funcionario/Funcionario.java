package Funcionario;



public class Funcionario {
    public String nome;
    public String sobrenome;
    public int horasTrabalhadas;
    public float valorPorHora;

    public Funcionario(String nome, String sobrenome, float valor, int horas){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = horas;
        this.valorPorHora = valor;    
    }//CONSTRUTOR

    String nomeCompleto(){ //O método nomeCompleto deve retornar o atributo nome concatenado ao atributo sobrenome
        return this.nome + " " + this.sobrenome;
    }

    float calcularSalario(){ //faz o cálculo de quanto o funcionário irá receber no mês, multiplicando o atributo horasTrabalhadas pelo atributo "valorPorHora" e retornar esse valor
        return (this.horasTrabalhadas * this.valorPorHora);
    }

    void incrementarHoras(int horas){ //O método de incrementarHoras adiciona um valor passado por parâmetro ao valor já existente no atributo valorPorHora.
        this.horasTrabalhadas =  this.horasTrabalhadas + horas;
}
}