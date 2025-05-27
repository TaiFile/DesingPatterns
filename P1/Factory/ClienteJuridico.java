public class ClienteJuridico extends Cliente {
    private String cnpj;

    public ClienteJuridico(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "nome='" + getNome() + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public String getNome() {
        return super.getNome() + " - CNPJ: " + cnpj;
    }
}
