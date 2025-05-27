public class ClienteFactory {
    public static Cliente criarClienteFisico(String nome, String cpf) {
        return new ClienteFisico(nome, cpf);
    }

    public static Cliente criarClienteJuridico(String nome, String cnpj) {
        return new ClienteJuridico(nome, cnpj);
    }
}
