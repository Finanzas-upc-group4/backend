package com.compra.inteligente.grupo4.data.mapping;

import com.compra.inteligente.grupo4.data.domain.entity.GeneralData;
import com.compra.inteligente.grupo4.data.resource.GeneralDataResource;
import com.compra.inteligente.grupo4.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class GeneralDataMapper implements Serializable {

    @Autowired
    EnhancedModelMapper mapper;

    public GeneralDataResource toResource(GeneralData model) {
        return mapper.map(model, GeneralDataResource.class);
    }

    public Page<GeneralDataResource> modelListPage(List<GeneralData> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, GeneralDataResource.class), pageable, modelList.size());
    }

    public List<GeneralDataResource> modelListPage(List<GeneralData> modelList) {
        return mapper.mapList(modelList, GeneralDataResource.class);
    }

    public  GeneralData toModel(GeneralDataResource resource) {
        return mapper.map(resource, GeneralData.class);
    }

}
