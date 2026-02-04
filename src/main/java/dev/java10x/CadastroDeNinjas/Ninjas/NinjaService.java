package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    // Injeção de dependência do repositório
    private NinjaRepository ninjaRepository;

    // Injeção de dependência via construtor
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }


    // Adicionar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja); // Insert
    }

    // Listar todos os ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    // Procurar um ninja por ID
    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    // Alterar os dados do NINJA
    public NinjaModel alterarNinja(Long id, NinjaModel dadosAtualizados) {
        return ninjaRepository.findById(id).map(ninja -> {
            ninja.setNome(dadosAtualizados.getNome());
            ninja.setEmail(dadosAtualizados.getEmail());
            ninja.setImgUrl(dadosAtualizados.getImgUrl());
            ninja.setIdade(dadosAtualizados.getIdade());
            ninja.setMissao(dadosAtualizados.getMissao());
            return ninjaRepository.save(ninja); // Update
        }).orElse(null);
    }
    // Deletar um ninja por ID
    public boolean deletarNinjaPorId(Long id) {
        if (ninjaRepository.existsById(id)) {
            ninjaRepository.deleteById(id); // Delete
            return true;
        }
        return false;
    }

}
