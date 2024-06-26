package classes.esportes;

import classes.quadra.Quadra;

import java.util.ArrayList;

public class Esportes {
    protected ArrayList<Quadra> quadras;

    public Esportes() {
        this.quadras = new ArrayList<>();
    }

    public void mostrarQuadras() {
        for (Quadra quadra : quadras) {
            quadra.verDetalhes();
        }
    }

    public void setQuadras(ArrayList<Quadra> quadras) {
        this.quadras = quadras;
    }

    public ArrayList<Quadra> getQuadras() {
        return quadras;
    }

    public void addQuadra(Quadra quadra) {
        quadras.add(quadra);
    }

    public void removerQuadra(String quadraId) {
        this.quadras.removeIf(quadra -> quadra.getId() == quadraId);
    }

    public int getNumeroMinimoJogadores() {

    }
}
