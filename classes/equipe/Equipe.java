import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import classes.esportes.Esportes;
import classes.usuario.Usuario;

public class Equipe {
  private String nome;
  private ArrayList<Usuario> jogadores;
  private Usuario capitao;
  private int pontuacao;
  private Esportes esporte;

  public Equipe(String nome, Usuario capitao, Esportes esporte) {
    this.nome = nome;
    this.capitao = capitao;
    this.esporte = esporte;
    this.jogadores = new ArrayList<>();
    this.jogadores.add(capitao);
    this.pontuacao = 0;
  }
}
