package classes.quadra;

import java.util.ArrayList;

import classes.usuario.Usuario;

public class Quadra {
  private String nome;
  private ArrayList<Usuario> jogadores;
  private String endereco;
  private String id;

  public Quadra(String nome, String endereco) {
    this.nome = nome;
    this.endereco = endereco;
    this.jogadores = new ArrayList<>();
  }

  public void verPartida() {

  }

  public void verParticipantes() {

  }

  public void entrarNaFila(Usuario usuario) {
    jogadores.add(usuario);
  }

  public void marcarPontos() {

  }

  public void verDetalhes() {

  }

  public void pararTempo() {

  }

  public void confirmarLocalizacao() {

  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setJogadores(ArrayList<Usuario> jogadores) {
    this.jogadores = jogadores;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public ArrayList<Usuario> getJogadores() {
    return jogadores;
  }

  public String getEndereco() {
    return endereco;
  }

  public String getId() {
    return id;
  }
}
