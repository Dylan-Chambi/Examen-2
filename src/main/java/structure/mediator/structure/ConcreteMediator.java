package structure.mediator.structure;

public class ConcreteMediator implements Mediator{
    // necesitamos almacenar todos los colleague que se comunicaran

    private ConcreteColleague1 user1;
    private ConcreteColleague2 user2;

    public void setUser1(ConcreteColleague1 user1) {
        this.user1 = user1;
    }

    public void setUser2(ConcreteColleague2 user2) {
        this.user2 = user2;
    }

    @Override
    public void send(String msg, Colleague colleague) {
        if (colleague == user1)
            user2.received(msg);
        else
            user1.received(msg);

    }
}
