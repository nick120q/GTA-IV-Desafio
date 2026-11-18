package com.seduc2.gtavilegal.services;

import com.seduc2.gtavilegal.entities.Carros;
import com.seduc2.gtavilegal.repositories.CarrosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrosService {
    private final CarrosRepository carrosRepository;
    public CarrosService(CarrosRepository carrosRepository) {
        this.carrosRepository = carrosRepository;
    }

    public List<Carros> mostrarCarros(){
        return carrosRepository.findAll();
    }

    public void registrarCarro(Carros c){
        Carros carro = new Carros(c.getNome(),c.getCategoria(),c.getFabricante(),c.getImagem(),c.getDescricao());
        carrosRepository.save(carro);
    }

    public void deletarCarro(int id){
        carrosRepository.deleteById(id);
    }

    public void alterarCarro(int id, Carros c){
        Carros carro = carrosRepository.getReferenceById(id);
        carro.setNome(c.getNome());
        carro.setCategoria(c.getCategoria());
        carro.setDescricao(c.getDescricao());
        carro.setFabricante(c.getFabricante());
        carro.setImagem(c.getImagem());
    }
}
