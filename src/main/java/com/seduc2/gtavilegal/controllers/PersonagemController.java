package com.seduc2.gtavilegal.controllers;

import com.seduc2.gtavilegal.entities.Personagem;
import com.seduc2.gtavilegal.services.PersonagemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/personagens")
public class PersonagemController {
    private final PersonagemService personagemService;
    public PersonagemController(PersonagemService personagemService) {
        this.personagemService = personagemService;
    }

    @GetMapping
    public List<Personagem> mostrar(){
        return personagemService.mostrarPersonagens();
    }

    @PostMapping
    public void criar(@RequestBody Personagem p){
        personagemService.registrarPersonagem(p);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        personagemService.deletarPersonagem(id);
    }

    @PutMapping
    public void alterar(@PathVariable int id,@RequestBody Personagem p){
        personagemService.alterar(id,p);
    }
}
