package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que esta classe é um controlador REST
@RequestMapping // mapeia a raiz das requisições
public class NinjaController {

    @GetMapping("/boasvindas") // mapeia requisições do tipo GET
    public String boasVindas() {
        return "Bem-vindo ao cadastro de ninjas!";
    }
}
