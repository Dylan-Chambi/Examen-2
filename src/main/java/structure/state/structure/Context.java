package structure.state.structure;

public class Context {
    private String attribute1;
    private String attribute2;
    private IState state = new ConcreteState1();

    public Context(){}

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void request (){
        System.out.println("INFO> Context - request");
        this.state.handle();
    }
}
