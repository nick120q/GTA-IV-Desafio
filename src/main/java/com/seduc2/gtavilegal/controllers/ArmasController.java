package com.seduc2.gtavilegal.controllers;

import com.seduc2.gtavilegal.entities.Armas;
import com.seduc2.gtavilegal.services.ArmasService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/armas")
public class ArmasController {
    private final ArmasService armasService;
    public ArmasController(ArmasService armasService) {
        this.armasService = armasService;
    }

    public List<Armas> mostrarArmas(){
        return armasService.mostrarArmas();
    }

    public void criarArma(@RequestBody Armas a){
        armasService.registrarArma(a);
    }
}
