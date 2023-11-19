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
    private Float TEA; //tasa efectiva anual
    @NotNull
    private Integer cuotasAlAnio;
    @NotNull
    private Integer periodoDePago;
    @NotNull
    private Float TSD; //tasa seguro desgravamen
    @NotNull
    private Float TSVA; //tasa seguro vehicular anual
    @NotNull
    private Boolean envioFisicoEstadoDeCuenta;
    @NotNull
    private Long idUsuario;
}
