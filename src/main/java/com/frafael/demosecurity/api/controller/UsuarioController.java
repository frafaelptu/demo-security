package com.frafael.demosecurity.api.controller;


import com.frafael.demosecurity.domain.UsuarioDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/usuario")
@RestController
public class UsuarioController {


    @GetMapping
    public UsuarioDTO buscarUsuarioPorEmail(String email){
        return UsuarioDTO.builder().id(1L).email("maria@mail.com").nome("Maria").build();
    }
}
