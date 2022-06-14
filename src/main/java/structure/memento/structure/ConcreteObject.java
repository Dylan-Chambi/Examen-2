package structure.memento.structure;

public class ConcreteObject {
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String state;

    public ConcreteObject (String attribute3,String state){
        this.attribute3=attribute3;
        this.state=state;
    }

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

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void showInfo() {
        System.out.println("attribute3 : "+attribute3 );
        System.out.println("state  : "+state );
    }
}
