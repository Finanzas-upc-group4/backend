package com.compra.inteligente.grupo4.data.domain.entity;


import com.compra.inteligente.grupo4.shared.domain.model.BaseModel;
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
public class GeneralData extends BaseModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
