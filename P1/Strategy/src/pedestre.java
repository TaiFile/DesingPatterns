public class pedestre {
    private String name;
    private IBehavior behavior;
    public pedestre(String name) {
        this.name = name;
    }

    public pedestre(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void getBehavior(pedestre pedestre) {
        behavior.routeCommand(pedestre);
    }
    public void setBehavior(IBehavior behavior) {
        this.behavior = behavior;
    }
}
