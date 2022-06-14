package structure.builder.structure;

public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildAttribute1() {
        product.setAttribute1("Builder2 attribute1");
    }

    @Override
    public void buildAttribute2() {
        product.setAttribute2("Builder2 att2");
    }

    @Override
    public void buildAttribute3() {
        product.setAttribute3("Builder2 att3");
    }

    @Override
    public void buildAttribute4() {
        product.setAttribute4("Builder2 att4");
    }

    @Override
    public void buildAttribute5() {
        product.setAttribute5("Builder2 att5");
    }
}
