import classes.endereco.Endereco;

public class Main {
  public static void main(String[] args) {
    Endereco endereco = new Endereco("Guido viaro", "85813440", "210", "nenhum");

    System.out.println(endereco.formatCep());
  }
}
