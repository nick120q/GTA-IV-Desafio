package com.seduc2.gtavilegal.repositories;

import com.seduc2.gtavilegal.entities.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {
}
