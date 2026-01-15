package br.com.alura.forumhub.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @GetMapping
    public String listar() {
        return "Listagem de tópicos";
    }

    @PostMapping
    public String criar() {
        return "Criação de tópico";
    }
}
