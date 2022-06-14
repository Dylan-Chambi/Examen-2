package structure.builder.structure;

public class ConcreteBuilder1 extends Builder {

    @Override
    public void buildAttribute1() {
        product.setAttribute1("attribute1");
    }

    @Override
    public void buildAttribute2() {
        product.setAttribute2("att2");
    }

    @Override
    public void buildAttribute3() {
        product.setAttribute3("att3");
    }

    @Override
    public void buildAttribute4() {
        product.setAttribute4("att4");
    }

    @Override
    public void buildAttribute5() {
        product.setAttribute5("att5");
    }
}
