package com.seduc2.gtavilegal.services;

import com.seduc2.gtavilegal.repositories.MissoesRepository;

public class MissoesService {
    private final MissoesRepository missoesRepository;
    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }


}
