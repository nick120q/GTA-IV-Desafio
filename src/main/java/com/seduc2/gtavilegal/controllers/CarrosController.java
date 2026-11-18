package com.seduc2.gtavilegal.controllers;

import com.seduc2.gtavilegal.entities.Carros;
import com.seduc2.gtavilegal.entities.Personagem;
import com.seduc2.gtavilegal.services.CarrosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/veiculos")
public class CarrosController {
    private final CarrosService carrosService;
    public CarrosController(CarrosService carrosService) {
        this.carrosService = carrosService;
    }

    @GetMapping
    public List<Carros> mostrar(){
        return carrosService.mostrarCarros();
    }

    @PostMapping
    public void registrar(@RequestBody Carros c){
        carrosService.registrarCarro(c);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        carrosService.deletarCarro(id);
    }

    @PutMapping
    public void alterar(@PathVariable int id,@RequestBody Carros c){
        carrosService.alterarCarro(id,c);
    }
}
