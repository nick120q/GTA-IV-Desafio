package com.seduc2.gtavilegal.services;

import com.seduc2.gtavilegal.entities.Armas;
import com.seduc2.gtavilegal.repositories.ArmasRepository;

import java.util.List;

public class ArmasService {
    private final ArmasRepository armasRepository;
    public ArmasService(ArmasRepository armasRepository) {
        this.armasRepository = armasRepository;
    }

    public List<Armas> mostrarArmas(){
        return armasRepository.findAll();
    }

    public void registrarArma(Armas a){
        Armas armas = new Armas(a.getNome(),a.getCategoria(),a.getFabricante(),a.getImagem(),a.getDescricao());
        armasRepository.save(armas);
    }

    public void deletarArma(int id){
        armasRepository.deleteById(id);
    }
}
