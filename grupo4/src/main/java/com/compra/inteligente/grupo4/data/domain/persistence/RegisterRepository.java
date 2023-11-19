package com.compra.inteligente.grupo4.data.domain.persistence;

import com.compra.inteligente.grupo4.data.domain.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {

    Optional<Register> findById (Long id);

    Register findByMonedaActual (String monedaActual);

    Register findByFechaDesembolso (String fechaDesembolso);


}
