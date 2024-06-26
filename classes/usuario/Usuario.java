package classes.usuario;

public class Usuario {
  private String apelido;
  private String numeroDeTelefone;
  private String email;
  private String senha;
  private String fotoDePerfil;

  public Usuario(String apelido, String numeroDeTelefone, String email, String senha, String fotoDePerfil) {
      this.apelido = apelido;
      this.numeroDeTelefone = numeroDeTelefone;
      this.email = email;
      this.senha = senha;
      this.fotoDePerfil = fotoDePerfil;
  }

  public void atualizarPerfil(String novoApelido, String novoNumeroDeTelefone, String novoEmail, String novaSenha, String novaFotoDePerfil) {
      this.apelido = novoApelido;
      this.numeroDeTelefone = novoNumeroDeTelefone;
      this.email = novoEmail;
      this.senha = novaSenha;
      this.fotoDePerfil = novaFotoDePerfil;
  }

  public void setApelido(String apelido) {
    this.apelido = apelido;
  }

  public void setNumeroDeTelefone(String numeroDeTelefone) {
    this.numeroDeTelefone = numeroDeTelefone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public void setFotoDePerfil(String fotoDePerfil) {
    this.fotoDePerfil = fotoDePerfil;
  }

  public String getApelido() {
    return apelido;
  }

  public String getNumeroDeTelefone() {
    return numeroDeTelefone;
  }

  public String getEmail() {
    return email;
  }

  public String getSenha() {
    return senha;
  }

  public String getFotoDePerfil() {
    return fotoDePerfil;
  }

  
}
