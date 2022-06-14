package structure.mediator.structure;

public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("ConcreteColleague1 received: ["+msg+"]");
    }
}
