package classes.usuario;

import classes.endereco.Endereco;

public class Usuario {
  private String apelido;
  private String email;
  private String numeroDeTelefone;
  private String senha;
  private String fotoDePerfil;

  public Usuario(String apelido, String email, String senha) {
    this.apelido = apelido;
    this.email = email;
    this.senha = senha;
  }

  public void setFotoDePerfil(String fotoDePerfil) {
    this.fotoDePerfil = fotoDePerfil;
  }

  public void setNumeroDeTelefone(String numeroDeTelefone) {
    this.numeroDeTelefone = numeroDeTelefone;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public void setApelido(String apelido) {
    this.apelido = apelido;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
