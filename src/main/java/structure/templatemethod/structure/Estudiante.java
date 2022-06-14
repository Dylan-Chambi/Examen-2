package structure.templatemethod.structure;

public class Estudiante extends Persona{
    @Override
    void methodAbs1() {
        System.out.println("implementando m1");
    }

    @Override
    void methodAbs2() {
        System.out.println("implementando m2");
    }

    @Override
    public void method1 (){
        System.out.println("Estudiante esto es una implementacion");
    }

}
