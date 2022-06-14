package structure.iterator.structure;

import java.util.Vector;

public class ConcreteAggregateB implements IAggregate{
    // logica de algun objeto que almacene objetos
    private Vector<String> nameList;

    public ConcreteAggregateB(){
        nameList= new Vector<>();
    }

    public void add (String value){
        nameList.add(value);
    }

    @Override
    public ConcreteIteratorB createIterator() {
        return new ConcreteIteratorB(nameList);
    }
}
