package structure.factorymethod.structure;

public class ConcreteCreatorP1 extends  Creator{
    // puede tener mas logica

    @Override
    public ConcreteProduct1 factoryMethodProduct() {
        System.out.println("factoryMethodProduct ConcreteProduct1");
        ConcreteProduct1 product= new ConcreteProduct1();
        // llenar
        // instaacias objectos
        // agregacion
        // logica de creacion
        return product;
    }
}
