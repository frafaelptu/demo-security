package com.frafael.demosecurity.domain;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Entity
//@Table(name = "usuario")
public class Usuario {

  //  @Id
    private Long id;
    private String nome;
    private String email;
    private String senha;
}
