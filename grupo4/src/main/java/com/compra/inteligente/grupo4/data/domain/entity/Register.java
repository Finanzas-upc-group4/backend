package com.compra.inteligente.grupo4.data.domain.entity;


import com.compra.inteligente.grupo4.shared.domain.model.BaseModel;
import io.cucumber.java.mk_latn.No;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "registers")
@Builder

public class Register extends BaseModel {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String monedaActual;
    @NotNull
    private String fechaDesembolso;
    @NotNull
    private Integer diaDePago;
    @NotNull
    private Long userId;

}
