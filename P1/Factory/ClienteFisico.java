public class ClienteFisico extends Cliente{
    private String cpf;

    public ClienteFisico(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public ClienteFisico() {
        super();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return super.getNome() + " - CPF: " + cpf;
    }
    
}
