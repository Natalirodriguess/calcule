package com.example.calcule.controller;


import com.example.calcule.dto.Operacao;
import com.example.calcule.service.CalculadoraService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculadora")
@Tag(name = "Operacoes")
public class CalculadoraController {
    @Autowired
    CalculadoraService calculadoraService;

    @PostMapping("/soma")
    public Double somar(@RequestBody Operacao operacao){
         return calculadoraService.soma(operacao.getOperadorUm(), operacao.getOporadorDois());
    }

    @PostMapping("/subtracao")
    public Double subtrair(@RequestBody Operacao operacao){
        return calculadoraService.subtracao(operacao.getOperadorUm(), operacao.getOporadorDois());
    }

    @PostMapping("/divisao")
    public Double dividir(@RequestBody Operacao operacao){
        return calculadoraService.divisao(operacao.getOperadorUm(), operacao.getOporadorDois());
    }

    @PostMapping("/multiplicacao")
    public Double multiplicar(@RequestBody Operacao operacao){
        return calculadoraService.multiplicacao(operacao.getOperadorUm(), operacao.getOporadorDois());
    }

}
