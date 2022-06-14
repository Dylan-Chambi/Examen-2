package structure.templatemethod.structure;

public abstract class Persona {

    public void method1 (){
        System.out.println("esto es una implementacion");
    }

    public final void method2 (){
        System.out.println("esto es una implementacion");
    }

    public void method3 (){
        System.out.println("esto es una implementacion");
    }
    abstract void methodAbs1();
    abstract void methodAbs2();
}
