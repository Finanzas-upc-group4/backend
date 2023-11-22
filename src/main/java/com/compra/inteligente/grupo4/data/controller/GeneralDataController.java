package com.compra.inteligente.grupo4.data.controller;


import com.compra.inteligente.grupo4.data.domain.service.GeneralDataService;
import com.compra.inteligente.grupo4.data.mapping.GeneralDataMapper;
import com.compra.inteligente.grupo4.data.resource.GeneralDataResource;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value ="/api/v1/generalData")
public class GeneralDataController {

    private final GeneralDataService generalDataService;
    private final GeneralDataMapper mapper;

    public GeneralDataController(GeneralDataService generalDataService, GeneralDataMapper mapper) {
        this.generalDataService = generalDataService;
        this.mapper = mapper;
    }


    @GetMapping
    public List<GeneralDataResource> getAllGeneralData(){
        return mapper.modelListPage(generalDataService.getAll());
    }

    @GetMapping("{generalDataId}")
    public GeneralDataResource getGeneralDataById(@PathVariable Long generalDataId){
        return mapper.toResource(generalDataService.getById(generalDataId));
    }

    @GetMapping("/idUsuario/{idUsuario}")
    public GeneralDataResource getGeneralDataByIdUsuario(@PathVariable  Long idUsuario){
        return mapper.toResource(generalDataService.getByIdUsuario(idUsuario));
    }

    @PostMapping
    public GeneralDataResource createGeneralData(@Valid @RequestBody GeneralDataResource resource){
        return mapper.toResource(generalDataService.create(mapper.toModel(resource)));
    }
}
