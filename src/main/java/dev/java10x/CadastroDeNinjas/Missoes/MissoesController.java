package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    // ENDPOINTS CRUD PARA

    // GET -- Mandar uma requisição para o servidor e receber uma resposta
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Lista de todas as missões.";
    }

    // POST -- Enviar dados para o servidor para criar um novo recurso
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão criada com sucesso!";
    }


    // PUT -- Atualizar um recurso existente no servidor
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso!";
    }

    // DELETE -- Deletar um recurso existente no servidor
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missão deletada com sucesso!";
    }
}
