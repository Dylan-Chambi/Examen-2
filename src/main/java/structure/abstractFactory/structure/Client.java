package structure.abstractFactory.structure;

public class Client {

    public static void main (String []args){

        miProduct(FactoryProduct.make("product2"));

        FactoryProduct.make("product2").method1();
        FactoryProduct.make("product2").method2();
    }


    public static void miProduct(IProduct p){
       p.method1();
       p.method2();
    }
}
