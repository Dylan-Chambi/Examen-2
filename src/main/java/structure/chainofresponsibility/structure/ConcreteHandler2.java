package structure.chainofresponsibility.structure;

public class ConcreteHandler2 implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int amount) {
         // logica cuando podemos solucionar el problema
         // cuando responsables de solucionar problem
         if (amount>=100 && amount < 200){
             System.out.println("ConcreteHandler2 esta solucionando su problema... :"+amount);
         } else {
             next.criteriaHandler(amount);
         }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
