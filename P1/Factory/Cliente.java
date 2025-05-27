public abstract class Cliente implements Interface1, Interface2, Interface3{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    public Cliente(){

    }
    public String getNome() {
        return nome;
    }
    public void setCliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void m1() {
        System.out.println("Método m1 da Interface1 implementado.");
    }
    @Override
    public void m2() {
        System.out.println("Método m2 da Interface1 implementado.");
    }
    @Override
    public void m3() {
        System.out.println("Método m3 da Interface1 implementado.");
    }
    @Override
    public void m4() {
        System.out.println("Método m4 da Interface2 implementado.");
    }
    @Override
    public void m5() {
        System.out.println("Método m5 da Interface3 implementado.");
    }
    @Override
    public void m6() {
        System.out.println("Método m6 da Interface3 implementado.");
    }
}
