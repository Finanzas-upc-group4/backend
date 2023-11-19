package com.compra.inteligente.grupo4.data.service;

import com.compra.inteligente.grupo4.data.domain.entity.GeneralData;
import com.compra.inteligente.grupo4.data.domain.persistence.GeneralDataRepository;
import com.compra.inteligente.grupo4.data.domain.service.GeneralDataService;
import com.compra.inteligente.grupo4.shared.exception.ResourceNotFoundException;
import com.compra.inteligente.grupo4.shared.exception.ResourceValidationException;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Service
public class GeneralDataServiceImpl implements GeneralDataService {


    private static final String Entity = "GeneralData";

    private final GeneralDataRepository generalDataRepository;

    private final Validator validator;

    public GeneralDataServiceImpl(GeneralDataRepository generalDataRepository, Validator validator) {
        this.generalDataRepository = generalDataRepository;
        this.validator = validator;
    }

    @Override
    public List<GeneralData> getAll() {
        return generalDataRepository.findAll();
    }

    @Override
    public GeneralData getById(Long generalDataId) {
        return generalDataRepository.findById(generalDataId)
                .orElseThrow(() -> new ResourceNotFoundException(Entity, generalDataId));
    }


    @Override
    public GeneralData getByIdUsuario(Long idUsuario) {
        return generalDataRepository.findByIdUsuario(idUsuario);
    }

    @Override
    public GeneralData create(GeneralData generalData) {
        Set<ConstraintViolation<GeneralData>> violations = validator.validate(generalData);
        if (!violations.isEmpty()) {
            throw new ResourceValidationException(Entity, violations);
        }

        return generalDataRepository.save(generalData);
    }
}
