package structure.memento.structure;

public class Client {
    public static void main(String[] ardssd) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        ConcreteObject concreteObject;

        concreteObject = new ConcreteObject("eynar", "State1");
        originator.setMemento(concreteObject); // ----> crear un momento basado PC
        caretaker.addMemento(originator.createMemento()); // ---> guardar el momento [0]
        concreteObject = new ConcreteObject("jose", "State2");
        originator.setMemento(concreteObject);
        concreteObject = new ConcreteObject("maria", "State3");
        originator.setMemento(concreteObject);
        concreteObject = new ConcreteObject("mario", "State4");
        originator.setMemento(concreteObject);
        caretaker.addMemento(originator.createMemento()); // [1]
        concreteObject = new ConcreteObject("juan", "State5");
        originator.setMemento(concreteObject);
        concreteObject = new ConcreteObject("upb", "State6");
        originator.setMemento(concreteObject);
        caretaker.addMemento(originator.createMemento()); // [2]

        concreteObject= originator.restoreMemento(caretaker.getMemento(1));
        System.out.println("*************VALORES ACTUALES ********************");
        concreteObject.showInfo();

    }
}
