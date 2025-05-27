public class controller3{
    public void action3(String name, String cpf) {
        Interface3 sistema3 = ClienteFactory.criarClienteFisico(name, cpf);
        sistema3.m5();
        sistema3.m6();
    }
    public void action31(String name, String cnpj) {
        Interface3 sistema3 = ClienteFactory.criarClienteJuridico(name, cnpj);
        sistema3.m5();
        sistema3.m6();
    }
}