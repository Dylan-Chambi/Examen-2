package structure.factorymethod.structure;

public class Client {

    public static void main (String []args){

        ConcreteProduct1 prod1 = new ConcreteCreatorP1().factoryMethodProduct();
        prod1.create();


    }

}
