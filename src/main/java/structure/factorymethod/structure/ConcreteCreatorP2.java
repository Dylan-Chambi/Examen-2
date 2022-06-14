package structure.factorymethod.structure;

public class ConcreteCreatorP2 extends  Creator{
    // puede tener mas logica

    @Override
    public ConcreteProduct2 factoryMethodProduct() {
        System.out.println("factoryMethodProduct ConcreteProduct2");
        ConcreteProduct2 product= new ConcreteProduct2();
        // llenar
        // instaacias objectos
        // agregacion
        // logica de creacion
        return product;
    }
}
