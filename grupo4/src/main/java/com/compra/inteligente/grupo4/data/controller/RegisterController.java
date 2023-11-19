package com.compra.inteligente.grupo4.data.controller;


import com.compra.inteligente.grupo4.data.domain.service.RegisterService;
import com.compra.inteligente.grupo4.data.mapping.RegisterMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/register")
public class RegisterController {

    private final RegisterService registerService;
    private final RegisterMapper mapper;

    public RegisterController(RegisterService registerService, RegisterMapper mapper){
        this.registerService = registerService;
        this.mapper = mapper;
    }


}
