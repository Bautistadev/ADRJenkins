package com.jenkins.spring.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private Long dni;
}
