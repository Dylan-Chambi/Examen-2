package structure.chainofresponsibility.structure;

public class ConcreteHandler4 implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
         // logica cuando podemos solucionar el problema
         // cuando responsables de solucionar problem
         if (amount>=300){
             System.out.println("ConcreteHandler4 esta solucionando su problema... :"+amount);
         }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
