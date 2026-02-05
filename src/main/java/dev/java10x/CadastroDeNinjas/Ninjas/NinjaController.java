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

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Bem-vindo ao sistema de cadastro de NINJAS!";
    }

    // Adicionar  (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Listar todos os NINJAS (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {

        return ninjaService.listarNinjas();
    }

    // Procurar NINJA por ID (CREATE)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    // Atualizar NINJA por ID (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaModel atualizarNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    // Deletar NINJA por ID (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
    }

}
