package classes.endereco;

public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String cep;

    public Endereco(String rua, String cep, String numero, String complemento) {
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void setNome(String rua) {
        this.rua = rua;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNome() {
        return rua;
    }

    public String getCep() {
        return cep;
    }

    public String formatCep() {
        String cepEnd = getCep().substring(5, 8);
        String cepStart = getCep().substring(0, 5);
        return cepStart + "-" + cepEnd;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }

    public void getEndereco() {
        System.out.println("Rua: " + this.getRua() + ", " + this.getNumero() + " - " + this.getComplemento() + " - "
                + this.formatCep());
    }
}
