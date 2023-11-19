package com.compra.inteligente.grupo4.data.controller;


import com.compra.inteligente.grupo4.data.domain.service.RegisterService;
import com.compra.inteligente.grupo4.data.mapping.RegisterMapper;
import com.compra.inteligente.grupo4.data.resource.RegisterResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/register")
public class RegisterController {

    private final RegisterService registerService;
    private final RegisterMapper mapper;

    public RegisterController(RegisterService registerService, RegisterMapper mapper){
        this.registerService = registerService;
        this.mapper = mapper;
    }

    public List<RegisterResource> getAllRegister(){
        return mapper.modelListPage(registerService.getAll());
    }
    @GetMapping("{registerId}")

    public RegisterResource getRegisterById(Long registerId){
        return mapper.toResource(registerService.getById(registerId));
    }
    @GetMapping("/monedaActual/{monedaActual}")
    public RegisterResource getRegisterByMonedaActual(String monedaActual){
        return mapper.toResource(registerService.getByMonedaActual(monedaActual));
    }
    @GetMapping("/fechaDesembolso/{fechaDesembolso}")
    public RegisterResource getRegisterByFechaDesembolso(String fechaDesembolso){
        return mapper.toResource(registerService.getByFechaDesembolso(fechaDesembolso));
    }

    @PostMapping
    public RegisterResource createRegister(RegisterResource resource){
        return mapper.toResource(registerService.create(mapper.toModel(resource)));
    }


}
