package com.compra.inteligente.grupo4.data.domain.persistence;

import com.compra.inteligente.grupo4.data.domain.entity.GeneralData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GeneralDataRepository extends JpaRepository<GeneralData, Long> {



        Optional<GeneralData> findById (Long id);

        GeneralData findByIdUsuario (Long idUsuario);


}
