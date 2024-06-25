package classes.jogador;

import java.util.Date;

import classes.usuario.Usuario;

public class Jogador {

  private String nome;
  private String fotoDePerfil;
  private Date horaEntradaNaFila;

  public Jogador(String nome, String fotoDePerfil, Date horaEntradaNaFila) {
    this.nome = nome;
    this.fotoDePerfil = fotoDePerfil;
    this.horaEntradaNaFila = horaEntradaNaFila;
  }

  public String getFotoDePerfil() {
    return fotoDePerfil;
  }

  public Date getHoraEntradaNaFila() {
    return horaEntradaNaFila;
  }

  public String getNome() {
    return nome;
  }

}
