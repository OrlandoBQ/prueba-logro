package com.bazan.pruebalogro.repository;

import com.bazan.pruebalogro.entity.Denuncia;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DenunciaRepository extends JpaRepository<Denuncia, Integer> {
    List<Denuncia> findByTituloContaining(String titulo, Pageable page);

}
