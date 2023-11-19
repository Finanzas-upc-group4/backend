package com.compra.inteligente.grupo4.data.domain.service;

import com.compra.inteligente.grupo4.data.domain.entity.Register;

import java.util.List;

public interface RegisterService {

    List<Register> getAll();

    Register getById(Long registerId);

    Register create(Register register);

    Register getByMonedaActual(String monedaActual);

    Register getByFechaDesembolso(String fechaDesembolso);



}
