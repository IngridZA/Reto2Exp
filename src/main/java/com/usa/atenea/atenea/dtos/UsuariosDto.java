package com.usa.atenea.atenea.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UsuariosDto {
    private String id;
    private String nombre;
    private int edad;
    private String rol;


}
