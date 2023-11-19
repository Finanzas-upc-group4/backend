package com.compra.inteligente.grupo4.data.domain.entity;


import io.cucumber.java.mk_latn.No;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "general_data")
@Builder
public class GeneralData {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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



 /*   valor del vehiculo
    cuota inicial
    monto de prestamo
    tasa efectiva anual
    cuotas al año
    periodo de pago
    tasa seguro des
    tasa seguro vehicular anual
    envio fisico de estado de cuenta*/
}
