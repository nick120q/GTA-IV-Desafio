package com.seduc2.gtavilegal.repositories;

import com.seduc2.gtavilegal.entities.Missoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissoesRepository extends JpaRepository<Missoes, Integer> {
}
