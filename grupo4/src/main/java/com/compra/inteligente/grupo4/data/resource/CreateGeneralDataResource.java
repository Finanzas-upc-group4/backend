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

public class CreateGeneralDataResource {
    @NotNull
    private Float valorDelVehiculo;
    @NotNull
    private Float cuotaInicial;
    @NotNull
    private Float montoPrestamo;
    @NotNull
    private Float tea; //tasa efectiva anual
    @NotNull
    private Integer cuotasAlAnio;
    @NotNull
    private Integer periodoDePago;
    @NotNull
    private Float tsd; //tasa seguro desgravamen
    @NotNull
    private Float tsva; //tasa seguro vehicular anual
    @NotNull
    private Integer envioFisicoEstadoDeCuenta;
    @NotNull
    private Long idUsuario;
}
