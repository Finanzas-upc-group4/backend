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

public class GeneralDataResource {


    private Float valorDelVehiculo;
    private Long id;
    private Float cuotaInicial;
    private Float TEA; //tasa efectiva anual
    private Integer cuotasAlAnio;
    private Integer periodoDePago;
    private Float TSD; //tasa seguro desgravamen
    private Float TSVA; //tasa seguro vehicular anual
    private Boolean envioFisicoEstadoDeCuenta;
    private Long idUsuario;
}
