package com.seduc2.gtavilegal.repositories;

import com.seduc2.gtavilegal.entities.Armas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmasRepository extends JpaRepository<Armas, Integer> {
}
