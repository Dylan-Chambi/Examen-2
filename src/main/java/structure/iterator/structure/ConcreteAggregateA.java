package structure.iterator.structure;

public class ConcreteAggregateA implements IAggregate{
    // logica de algun objeto que almacene objetos
    private int position;
    private String [] nameList;

    public ConcreteAggregateA(){
        nameList= new String[5];
    }

    public void add (String value){
        nameList[position]=value;
        position++;
    }

    @Override
    public ConcreteIteratorA createIterator() {
        return new ConcreteIteratorA(nameList);
    }
}
