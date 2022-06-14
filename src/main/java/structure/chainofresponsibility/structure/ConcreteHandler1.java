package structure.chainofresponsibility.structure;

public class ConcreteHandler1 implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
         // logica cuando podemos solucionar el problema
         // cuando responsables de solucionar problem
         if (amount < 100){
             System.out.println("ConcreteHandler1 esta solucionando su problema... :"+amount);
         } else {
             next.criteriaHandler(amount);
         }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
