package com.compra.inteligente.grupo4.users.domain.entity;

import com.compra.inteligente.grupo4.shared.domain.model.BaseModel;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Builder
public class User extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String password;
    private String email;
    private String dni;
}
