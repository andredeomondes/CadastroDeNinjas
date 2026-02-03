package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController // indica que esta classe é um controlador REST
@RequestMapping // mapeia a raiz das requisições
public class NinjaController {


    // ENDPOINTS CRUD PARA NINJAS
    // O que é um CRUD?
    // CREATE - criar novos registros
    // READ - ler ou listar registros
    // UPDATE - atualizar registros existentes
    // DELETE - deletar registros

    // O que é um endpoint?
    // Um endpoint é uma URL específica onde um serviço web pode ser acessado por um cliente


    // Mensagem de boas-vindas
    @GetMapping("/boasvindas") // mapeia requisições do tipo GET
    public String boasVindas() {
        return "Bem-vindo ao cadastro de ninjas!";
    }

    // Adicionar  (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado com sucesso!";
    }

    // Listar todos os NINJAS (READ)
    @GetMapping("/todos")
    public String listarNinjas() {
        return "Lista de todos os ninjas.";
    }

    // Procurar NINJA por ID (CREATE)
    @GetMapping("/todosID")

    public String procurarNinjaPorID() {
        return "Ninja encontrado por ID.";
    }

    // Alterar os dados do NINJA (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinja() {
        return "Ninja alterado com sucesso!";
    }

    // Deletar NINJA por ID (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarID() {
        return "Ninja deletado com sucesso!";
    }

}
