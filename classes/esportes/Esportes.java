package classes.esportes;

import java.util.ArrayList;
import classes.quadra.Quadra;

public class Esportes {
    private String nome;
    private int quantidadeJogadores;
    private ArrayList<Quadra> quadras;

    // Construtor
    public Esportes(String nome, int quantidadeJogadores) {
        this.nome = nome;
        this.quantidadeJogadores = quantidadeJogadores;
        this.quadras = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeJogadores() {
        return quantidadeJogadores;
    }

    public void setQuantidadeJogadores(int quantidadeJogadores) {
        this.quantidadeJogadores = quantidadeJogadores;
    }

    public ArrayList<Quadra> getQuadras() {
        return quadras;
    }

    public void setQuadras(ArrayList<Quadra> quadras) {
        this.quadras = quadras;
    }

    // Método para adicionar uma quadra
    public void adicionarQuadra(Quadra quadra) {
        this.quadras.add(quadra);
    }

    // Método para mostrar as quadras
    public void mostrarQuadras() {
        System.out.println("Quadras disponíveis para " + this.nome + ":");
        for (int i = 0; i < quadras.size(); i++) {
            System.out.println((i + 1) + ". " + quadras.get(i).toString());
        }
    }
}

// import java.util.ArrayList;

// public class Esportes {
//     private String nome;
//     private int quantidadeJogadores;
//     private ArrayList<Quadra> quadras;

//     public Esportes(String nome, int quantidadeJogadores) {
//         this.nome = nome;
//         this.quantidadeJogadores = quantidadeJogadores;
//         this.quadras = new ArrayList<>();
//     }

//     public void setQuantidadeJogadores(int quantidadeJogadores) {
//         this.quantidadeJogadores = quantidadeJogadores;
//     }

//     public ArrayList<Quadra> getQuadras() {
//         return quadras;
//     }

//     public void setQuadras(ArrayList<Quadra> quadras) {
//         this.quadras = quadras;
//     }

//     public void adicionarQuadra(Quadra quadra) {
//         if (!quadras.contains(quadra)) {
//             quadras.add(quadra);
//         }
//     }

//     public void mostrarQuadras() {
//         if (quadras.isEmpty()) {
//             System.out.println("Não há quadras disponíveis para " + nome + ".");
//         } else {
//             System.out.println("Quadras disponíveis para " + nome + ":");
//             for (int i = 0; i < quadras.size(); i++) {
//                 System.out.println((i + 1) + ". " + quadras.get(i));
//             }
//         }
//     }

//     // Getters and Setters for nome
//     public String getNome() {
//         return nome;
//     }

//     public void setNome(String nome) {
//         this.nome = nome;
//     }
// }