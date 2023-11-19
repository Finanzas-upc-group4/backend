package com.compra.inteligente.grupo4.data.domain.persistence;

import com.compra.inteligente.grupo4.data.domain.entity.GeneralData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GeneralDataRepository extends JpaRepository<GeneralData, Long> {



        Optional<GeneralData> findById (Long id);
        GeneralData findByCuotaInicial (Float cuotaInicial);

        GeneralData findByTEA (Float TEA);

        GeneralData findByCuotasAlAnio (Integer cuotasAlAnio);

        GeneralData findByPeriodoDePago (Integer periodoDePago);

        GeneralData findByTSD (Float TSD);

        GeneralData findByTSVA (Float TSVA);

        GeneralData findByEnvioFisicoEstadoDeCuenta (Boolean envioFisicoEstadoDeCuenta);

        GeneralData findByIdUsuario (Long idUsuario);


}
