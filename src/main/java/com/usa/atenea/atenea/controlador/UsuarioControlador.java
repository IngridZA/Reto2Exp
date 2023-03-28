package com.usa.atenea.atenea.controlador;

import com.usa.atenea.atenea.dtos.UsuariosDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsuarioControlador {
    @GetMapping("/usuario")
    //logica para realizar el get
    public String obtenerUsuarios(){
        return "Hola mundo";
    }

    @PostMapping("/usuarios")
    public void crearUsuarios(@RequestBody UsuariosDto usuariosDto){
        System.out.println(usuariosDto.toString());

        }

    @DeleteMapping("/usuarios")
    public void eliminarUsuarios(@RequestParam int id){
        System.out.println(id);
        }
    @PutMapping("/usuarios")
    public void actualizarUsuarios(@RequestBody UsuariosDto usuariosDto){
        System.out.println(usuariosDto.toString());
    }


}
