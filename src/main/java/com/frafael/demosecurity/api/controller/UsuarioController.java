package com.frafael.demosecurity.api.controller;


import com.frafael.demosecurity.domain.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RequestMapping("/usuario")
@RestController
public class UsuarioController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping
    public Usuario consultarUsuario(@RequestBody Usuario usuario) {
        return entityManager.find(Usuario.class, usuario.getId());
    }

    @PostMapping
    @Transactional
    public Usuario salvar(@RequestBody Usuario usuario) {
        entityManager.persist(usuario);
        return entityManager.find(Usuario.class, usuario.getId());
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Transactional
    public void remover(@RequestBody Usuario usuario) {
        usuario = entityManager.find(Usuario.class, usuario.getId());
        entityManager.remove(usuario);

    }
}
