package com.compra.inteligente.grupo4.data.domain.service;

import com.compra.inteligente.grupo4.data.domain.entity.GeneralData;

import java.util.List;

public interface GeneralDataService {

    List<GeneralData> getAll();

    GeneralData getById(Long generalDataId);



    GeneralData getByIdUsuario(Long idUsuario);

    GeneralData create(GeneralData generalData);




}
