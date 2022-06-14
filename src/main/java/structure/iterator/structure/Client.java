package structure.iterator.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Client {
    public static void main(String[]args){
        ConcreteAggregateA bancoUnion = new ConcreteAggregateA();
        bancoUnion.add("jose1");
        bancoUnion.add("jose2");
        bancoUnion.add("jose3");
        bancoUnion.add("jose4");
        bancoUnion.add("jose5");

        ConcreteAggregateB bancoBisa = new ConcreteAggregateB();
        bancoBisa.add("juan1");
        bancoBisa.add("juan2");
        bancoBisa.add("juan3");
        bancoBisa.add("juan4");
        bancoBisa.add("juan5");

        Iterator iterator;
        iterator = bancoUnion.createIterator();

        while (iterator.hasNext()){
            String client = (String) iterator.next();
            System.out.println("banco union: "+client);
        }

        iterator = bancoBisa.createIterator();

        while (iterator.hasNext()){
            String client = (String) iterator.next();
            System.out.println("banco bisa: "+client);
        }

    }
}
