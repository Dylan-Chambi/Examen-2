package structure.observer.structure;

public class Client {
    public static void main (String [] args){
        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver());
        subject.attach(new ConcreteObserver());
        subject.attach(new ConcreteObserver1());
        subject.attach(new ConcreteObserver1());

        subject.action2();

    }
}
