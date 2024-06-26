package classes.partida;

import java.util.ArrayList;

import classes.usuario.Usuario;

public class Partida {
    private String nome;
    private ArrayList<Usuario> jogadores;
    private String[] regras;
    private String modalidade;
    private boolean emPartida;
    private ArrayList<Usuario> time1;
    private ArrayList<Usuario> time2;

    public Partida(String nome, ArrayList<Usuario> jogadores, String[] regras, String modalidade, boolean emPartida,
            ArrayList<Usuario> time1, ArrayList<Usuario> time2) {
        this.nome = nome;
        this.jogadores = jogadores;
        this.regras = regras;
        this.modalidade = modalidade;
        this.emPartida = emPartida;
        this.time1 = time1;
        this.time2 = time2;
    }

    public void criarTime(Usuario usuario) {
        if (time1.size()<3) {
        time1.add(usuario);
        time1.add(usuario);
        time1.add(usuario);
        }else if (time1.size()==2 && time2.size()<3) {
         time2.add(usuario);
         time2.add(usuario);
         time2.add(usuario);
        }
 } 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setJogadores(ArrayList<Usuario> jogadores) {
        this.jogadores = jogadores;
    }

    public void setRegras(String[] regras) {
        this.regras = regras;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public void setEmPartida(boolean emPartida) {
        this.emPartida = emPartida;
    }


    public String getNome() {
        return nome;
    }

    public ArrayList<Usuario> getJogadores() {
        return jogadores;
    }

    public String[] getRegras() {
        return regras;
    }

    public String getModalidade() {
        return modalidade;
    }

    public boolean isEmPartida() {
        return emPartida;
    }

    public ArrayList<Usuario> getTime1() {
        return time1;
    }
    
    public ArrayList<Usuario> getTime2() {
        return time2;
    }
}
