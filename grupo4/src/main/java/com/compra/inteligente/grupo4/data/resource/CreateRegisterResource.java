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
public class CreateRegisterResource {


    @NotNull
    private String monedaActual;
    @NotNull
    private String fechaDesembolso;
    @NotNull
    private Integer diaDePago;
    @NotNull
    private Long userId;
}
