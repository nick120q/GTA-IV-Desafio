package com.seduc2.gtavilegal.repositories;

import com.seduc2.gtavilegal.entities.Carros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrosRepository extends JpaRepository<Carros, Integer> {
}
