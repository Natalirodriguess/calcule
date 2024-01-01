package com.example.calcule.controller;


import com.example.calcule.model.Operacao;
import com.example.calcule.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
    @Autowired
    CalculadoraService calculadoraService;

    @PostMapping("/soma")
    public Double somar(@RequestBody Operacao operacao){
         return calculadoraService.soma(operacao.getOperadorUm(), operacao.getOporadorDois());
    }
}
