package structure.iterator.structure;

import java.util.Vector;

public class ConcreteIteratorB implements Iterator{

    private Vector<String> nameList;
    private int position;

    public ConcreteIteratorB(Vector<String> nameList){
         this.nameList=nameList;
        position=0;
    }

    @Override
    public Object next() {
        return nameList.get(position++);
    }

    @Override
    public boolean hasNext() {
        return nameList.size() != 0 && position < nameList.size();
    }
}
