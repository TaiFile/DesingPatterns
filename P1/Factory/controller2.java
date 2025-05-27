public class controller2 {
    public void action2(String name, String cnpj) {
        Interface2 sistema2 = ClienteFactory.criarClienteJuridico(name, cnpj);
        sistema2.m3();
        sistema2.m4();
    }
    public void action21(String name, String cpf) {
        Interface2 sistema3 = ClienteFactory.criarClienteFisico(name, cpf);
        sistema3.m3();
        sistema3.m4();
    }
}
