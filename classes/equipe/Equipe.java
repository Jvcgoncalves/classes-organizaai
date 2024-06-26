package classes.equipe;

import java.util.ArrayList;
import classes.usuario.Usuario;
import classes.esportes.Esportes;

public class Equipe {
  private String nome;
  private ArrayList<Usuario> jogadores;
  private Usuario capitao;
  private int pontuacao;
  private Esportes esporte;

  public Equipe(String nome, Usuario capitao, Esportes esporte) {
    validarParametros(nome, capitao, esporte);
    this.nome = nome;
    this.capitao = capitao;
    this.esporte = esporte;
    this.jogadores = new ArrayList<>();
    this.jogadores.add(capitao);
    this.pontuacao = 0;
  }

  private void validarParametros(String nome, Usuario capitao, Esportes esporte) {
    if (nome == null || capitao == null || esporte == null) {
      throw new IllegalArgumentException("Nome, capitão e esporte não podem ser nulos.");
    }
  }

  public void adicionarJogador(Usuario jogador) {
    if (!jogadores.contains(jogador)) {
      jogadores.add(jogador);
    }
  }

  public void removerJogador(Usuario jogador) {
    if (jogador != capitao) {
      jogadores.remove(jogador);
    }
  }

  public void adicionarPontuacao(int pontos) {
    this.pontuacao += pontos;
  }

  public void diminuirPontuacao(int pontos) {
    this.pontuacao -= pontos;
  }

  public boolean estaCompleto(int maxJogadores) {
    return jogadores.size() == maxJogadores;
  }

  public int getNumeroJogadores() {
    return jogadores.size();
  }

}