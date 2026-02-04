package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // indica que esta classe é um controlador REST
@RequestMapping("/ninjas") // mapeia a raiz das requisições
public class NinjaController {

    // Injeção de dependência do serviço
    private final NinjaService ninjaService;

    // Injeção de dependência via construtor
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // ENDPOINTS CRUD PARA NINJAS
    // O que é um CRUD?
    // CREATE - criar novos registros
    // READ - ler ou listar registros
    // UPDATE - atualizar registros existentes
    // DELETE - deletar registros

    // O que é um endpoint?
    // Um endpoint é uma URL específica onde um serviço web pode ser acessado por um cliente


    // Adicionar  (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado com sucesso!";
    }

    // Listar todos os NINJAS (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }
    // Procurar NINJA por ID (CREATE)
    @GetMapping("/listarID")

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
