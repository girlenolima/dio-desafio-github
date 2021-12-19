package br.com.projeto.calculadora.busines;

public class CalculadoraIMP implements  CalculadoraABS{


    @Override
    public Double adicao(Double valor1, Double valor2) {

        return valor1 + valor2;
    }

    @Override
    public Double subtracao(Double valor1, Double valor2) {
        return valor1 - valor2;
    }

    @Override
    public Double multipliacao(Double valor1, Double valor2) {
        return valor1 * valor2;
    }

    @Override
    public Double divisao(Double valor1, Double valor2) {
        return valor1 / valor2;
    }
}
