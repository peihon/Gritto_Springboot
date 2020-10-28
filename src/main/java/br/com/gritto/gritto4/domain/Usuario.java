package br.com.gritto.gritto4.domain;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Usuario implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "rg")
  private String rg;

  @Column(name = "cpf")
  private String cpf;

  @Column(name = "dataNascimento")
  private String dataNascimento;

  @Column(name = "telefone")
  private String telefone;

  @Column(name = "senha")
  private String senha;

  @Column(name = "email")
  private String email;

  @Column(name = "sexo")
  private String sexo;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
  @JsonIdentityReference
  private List<Publicacao> publicacao;



}
