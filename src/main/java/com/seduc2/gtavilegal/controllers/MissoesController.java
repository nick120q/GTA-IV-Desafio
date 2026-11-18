package com.seduc2.gtavilegal.controllers;

import com.seduc2.gtavilegal.entities.Missoes;
import com.seduc2.gtavilegal.services.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/missoes")
public class MissoesController {
    private final MissoesService missoesService;
    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping
    public List<Missoes> mostrar(){
        return missoesService.mostrarMissoes();
    }

    @PostMapping
    public void criar(@RequestBody Missoes m){
        missoesService.registrarMissoes(m);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        missoesService.deletarMissao(id);
    }

    @PutMapping
    public void alterar(@PathVariable int id,@RequestBody Missoes m){
        missoesService.alterar(id,m);
    }
}
