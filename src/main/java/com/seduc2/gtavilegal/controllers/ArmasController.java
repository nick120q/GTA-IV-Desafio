package com.seduc2.gtavilegal.controllers;

import com.seduc2.gtavilegal.entities.Armas;
import com.seduc2.gtavilegal.services.ArmasService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/armas")
public class ArmasController {
    private final ArmasService armasService;
    public ArmasController(ArmasService armasService) {
        this.armasService = armasService;
    }

    @GetMapping
    public List<Armas> mostrarArmas(){
        return armasService.mostrarArmas();
    }

    @PostMapping
    public void criarArma(@RequestBody Armas a){
        armasService.registrarArma(a);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        armasService.deletarArma(id);
    }

    @PutMapping
    public void alterar(@PathVariable int id, @RequestBody Armas p){
        armasService.alterar(id,p);
    }
}
