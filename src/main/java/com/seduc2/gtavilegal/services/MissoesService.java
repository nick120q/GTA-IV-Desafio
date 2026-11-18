package com.seduc2.gtavilegal.services;

import com.seduc2.gtavilegal.entities.Missoes;
import com.seduc2.gtavilegal.entities.Personagem;
import com.seduc2.gtavilegal.repositories.MissoesRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {
    private final MissoesRepository missoesRepository;
    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<Missoes> mostrarMissoes(){
        return missoesRepository.findAll();
    }

    public void registrarMissoes(Missoes m){
        Missoes missoes = new Missoes(m.getNome(),m.getDificuldade(),m.getLocal(),m.getImagem(),m.getDescricao());
        missoesRepository.save(missoes);
    }

    public void deletarMissao(int id){
        missoesRepository.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Missoes m){
        Missoes missao = missoesRepository.getReferenceById(id);
        missao.setNome(m.getNome());
        missao.setLocal(m.getLocal());
        missao.setDificuldade(m.getDificuldade());
        missao.setImagem(m.getImagem());
        missao.setDescricao(m.getDescricao());
    }
}
