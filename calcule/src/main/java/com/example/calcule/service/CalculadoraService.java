package com.example.calcule.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService
{

    public Double soma(Double operadorUm, Double operadorDois){
        Double soma = operadorUm + operadorDois;
        numeroFormatado(soma);
        return soma;
    }

    public Double subtracao(Double operadorUm, Double operadorDois){
        Double subtracao = operadorUm - operadorDois;
        numeroFormatado(subtracao);
        return subtracao;
    }

    public Double multiplicacao(Double operadorUm, Double operadorDois){
        Double multiplicacao = operadorUm * operadorDois;
        numeroFormatado(multiplicacao);
        return multiplicacao;
    }

    public Double divisao(Double operadorUm, Double operadorDois){
        Double divisao = operadorUm/operadorDois;
        numeroFormatado(divisao);
        return divisao;
    }

    public Double numeroFormatado(Double numeroNaoFormatado){
        String numeroFormatadoString = String.format("%.2f", numeroNaoFormatado);
        String numeroFormatado = numeroFormatadoString.replace(",", ".");
        return Double.parseDouble(numeroFormatado);
    }
}
