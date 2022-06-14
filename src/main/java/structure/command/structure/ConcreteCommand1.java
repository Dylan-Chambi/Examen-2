package structure.command.structure;

public class ConcreteCommand1 implements ICommand{
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.action1();
        receiver.action2();
    }
}
