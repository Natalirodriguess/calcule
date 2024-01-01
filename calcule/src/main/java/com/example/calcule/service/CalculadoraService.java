package com.example.calcule.service;

public class CalculadoraService
{
    Double operadorUm;
    Double operadorDois;

    public Double soma(){
        Double soma = operadorUm + operadorDois;
        numeroFormatado(soma);
        return soma;
    }

    public Double subtracao(){
        Double subtracao = operadorUm - operadorDois;
        numeroFormatado(subtracao);
        return subtracao;
    }

    public Double multiplicacao(){
        Double multiplicacao = operadorUm * operadorDois;
        numeroFormatado(multiplicacao);
        return multiplicacao;
    }

    public Double divisao(){
        Double divisao = operadorUm/operadorDois;
        numeroFormatado(divisao);
        return divisao;
    }

    public Double numeroFormatado(Double numeroNaoFormatado){
        String numeroFormatado = String.format("%2f", numeroNaoFormatado);
        return Double.valueOf(numeroFormatado);
    }
}
