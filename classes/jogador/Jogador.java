package classes.jogador;

import java.util.Date;

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
    return this.fotoDePerfil;
  }

  public Date getHoraEntradaNaFila() {
    return this.horaEntradaNaFila;
  }

  public String getNome() {
    return this.nome;
  }

}
