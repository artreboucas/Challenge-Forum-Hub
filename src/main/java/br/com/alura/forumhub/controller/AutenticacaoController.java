package br.com.alura.forumhub.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AutenticacaoController {

    @PostMapping("/login")
    public String login() {
        return "Autenticação realizada";
    }
}
