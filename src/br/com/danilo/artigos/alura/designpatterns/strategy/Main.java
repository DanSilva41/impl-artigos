package br.com.danilo.artigos.alura.designpatterns.strategy;

public class Main {

    public static void main(String[] args) {

        Funcionario atendente = new Funcionario("Maria da Silva", 1200.00, Cargo.ATENDENTE);
        Venda novaVenda = new Venda(atendente, 200.0);

        System.out.println("Valor da comissão: "+ novaVenda.calculaComissao());
    }
}
