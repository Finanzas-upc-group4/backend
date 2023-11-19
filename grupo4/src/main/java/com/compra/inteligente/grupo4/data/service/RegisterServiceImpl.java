package com.compra.inteligente.grupo4.data.service;

import com.compra.inteligente.grupo4.data.domain.entity.Register;
import com.compra.inteligente.grupo4.data.domain.persistence.RegisterRepository;
import com.compra.inteligente.grupo4.data.domain.service.RegisterService;
import com.compra.inteligente.grupo4.shared.exception.ResourceNotFoundException;
import com.compra.inteligente.grupo4.shared.exception.ResourceValidationException;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;


@Service

public class RegisterServiceImpl implements RegisterService {

    private static final String Entity = "Register";
    private final RegisterRepository RegisterRepository;
    private final Validator validator;

    public RegisterServiceImpl(com.compra.inteligente.grupo4.data.domain.persistence.RegisterRepository registerRepository, Validator validator) {
        RegisterRepository = registerRepository;
        this.validator = validator;
    }

    @Override
    public List<Register> getAll() {
        return RegisterRepository.findAll();
    }

    @Override
    public Register getById(Long registerId) {
        return RegisterRepository.findById(registerId)
                .orElseThrow(() -> new ResourceNotFoundException(Entity, registerId));
    }

    @Override
    public Register getByMonedaActual(String monedaActual) {
        return RegisterRepository.findByMonedaActual(monedaActual);
    }

    @Override
    public Register getByFechaDesembolso(String fechaDesembolso) {
        return RegisterRepository.findByFechaDesembolso(fechaDesembolso);
    }

    @Override
    public Register create(Register register) {
        Set<ConstraintViolation<Register>> violations = validator.validate(register);
        if (!violations.isEmpty()) {
            throw new ResourceValidationException(Entity,violations);
        }
        return RegisterRepository.save(register);
    }


}