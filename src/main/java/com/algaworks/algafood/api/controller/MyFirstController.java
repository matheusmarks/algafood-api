package com.algaworks.algafood.api.controller;

import com.algaworks.algafood.api.model.Client;
import com.algaworks.algafood.api.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {

    private AtivacaoClienteService ativacaoClienteService;

    public MyFirstController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Client joao = new Client("João", "joaoxyz@gmail.com","2132432423");

        ativacaoClienteService.ativar(joao);

        return "Hello World ";
    }




}
