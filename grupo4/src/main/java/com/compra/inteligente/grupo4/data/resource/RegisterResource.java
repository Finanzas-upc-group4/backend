package com.compra.inteligente.grupo4.data.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResource {

    private Long id;
    private String monedaActual;
    private String fechaDesembolso;
    private Integer diaDePago;
    private Long userId;
}
