package com.frafael.demosecurity.domain;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {


    private Long id;
    private String nome;
    private String email;
}
