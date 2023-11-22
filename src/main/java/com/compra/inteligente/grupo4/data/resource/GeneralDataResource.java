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

    private Long id;
    private Float valorDelVehiculo;
    private Float cuotaInicial;
    private Float montoPrestamo;
    private Float tea; //tasa efectiva anual
    private Integer cuotasAlAnio;
    private Integer periodoDePago;
    private Float tsd; //tasa seguro desgravamen
    private Float tsva; //tasa seguro vehicular anual
    private Integer envioFisicoEstadoDeCuenta;
    private Long idUsuario;

}
