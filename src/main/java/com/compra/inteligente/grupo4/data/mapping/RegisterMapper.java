package com.compra.inteligente.grupo4.data.mapping;

import com.compra.inteligente.grupo4.data.domain.entity.Register;
import com.compra.inteligente.grupo4.data.resource.RegisterResource;
import com.compra.inteligente.grupo4.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class RegisterMapper implements Serializable {

    @Autowired
    EnhancedModelMapper mapper = new EnhancedModelMapper();

    public RegisterResource toResource(Register model) {
        return mapper.map(model, RegisterResource.class);
    }

    public Page<RegisterResource> modelListPage(List<Register> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, RegisterResource.class), pageable, modelList.size());
    }

    public List<RegisterResource> modelListPage(List<Register> modelList) {
        return mapper.mapList(modelList, RegisterResource.class);


    }
    public Register toModel(RegisterResource resource) {
        return mapper.map(resource, Register.class);
    }
}