package com.compra.inteligente.grupo4.users.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResource {
    private String name;
    private String lastName;
    private String password;
    private String email;
    private String dni;
}
