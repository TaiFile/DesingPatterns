public class controller1 {
    public void action(String nome, String cpf){
        Interface1 sistema1 = ClienteFactory.criarClienteFisico(nome, cpf);
        sistema1.m1();
        sistema1.m2();
        sistema1.m3();
    }
    public void action2(String nome, String cnpj){
        Interface1 sistema1 = ClienteFactory.criarClienteJuridico(nome, cnpj);
        sistema1.m1();
        sistema1.m2();
        sistema1.m3();
    }
}
