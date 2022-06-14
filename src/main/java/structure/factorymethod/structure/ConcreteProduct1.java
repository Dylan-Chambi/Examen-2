package structure.factorymethod.structure;

public class ConcreteProduct1 implements IProduct{

    private String attribute1;
    private String attribute2;
    private String attribute3;

    public ConcreteProduct1(){
        System.out.println("creando ConcreteProduct1");
    }

    @Override
    public void create() {

    }


    // sus propios metodos
}
