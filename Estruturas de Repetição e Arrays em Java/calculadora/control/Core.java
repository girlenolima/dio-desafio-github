package br.com.projeto.calculadora.control;

import br.com.projeto.calculadora.busines.CalculadoraABS;
import br.com.projeto.calculadora.busines.CalculadoraIMP;
import br.com.projeto.calculadora.model.CalculadoraModel;

public class Core {

    private CalculadoraABS calculadoraABS = new CalculadoraIMP();
    private CalculadoraModel calculadoraModel;


    public Core(CalculadoraModel calculadoraModel) {
        this.calculadoraModel = calculadoraModel;
    }

    private Double selecionarOperacao(){

        Double resultado;

        switch (calculadoraModel.getOperacao()){
            case "+":
                resultado = calculadoraABS.adicao(calculadoraModel.getValor1(), calculadoraModel.getValor2());
                break;
            case "/":
                resultado = calculadoraABS.divisao(calculadoraModel.getValor1(), calculadoraModel.getValor2());
                break;
            case "*":
                resultado = calculadoraABS.multipliacao(calculadoraModel.getValor1(), calculadoraModel.getValor2());
                break;
            case "-":
                resultado = calculadoraABS.divisao(calculadoraModel.getValor1(), calculadoraModel.getValor2());
                break;

            default:
                resultado =  null;
                System.out.println("Sinal de operaçao invalido");


        }

        return resultado;



    }


    public Double calcular(){

        Double resultado = selecionarOperacao();
        return resultado;
    }


}
