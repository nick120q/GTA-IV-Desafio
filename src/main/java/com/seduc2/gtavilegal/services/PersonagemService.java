package com.seduc2.gtavilegal.services;

import com.seduc2.gtavilegal.entities.Personagem;
import com.seduc2.gtavilegal.repositories.PersonagemRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {
    private final PersonagemRepository personagemRepository;
    public PersonagemService(PersonagemRepository personagemRepository) {
        this.personagemRepository = personagemRepository;
    }
    public List<Personagem> mostrarPersonagens(){
        return personagemRepository.findAll();
    }

    public void registrarPersonagem(Personagem p){
        Personagem personagem = new Personagem(p.getNome(),p.getApelido(),p.getCategoria(),p.getImagem(),p.getDescricao());
        personagemRepository.save(personagem);
    }

    public void deletarPersonagem(int id){
        personagemRepository.deleteById(id);
    }

    // alterar (PUT)
    @Transactional
    public void alterar(int id, Personagem p){
        Personagem personagem = personagemRepository.getReferenceById(id);
        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        personagem.setImagem(p.getImagem());
        personagem.setDescricao(p.getDescricao());
    }
}
