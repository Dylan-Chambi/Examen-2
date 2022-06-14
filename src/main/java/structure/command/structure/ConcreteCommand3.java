package structure.command.structure;

public class ConcreteCommand3 implements ICommand{
    private Receiver receiver;

    public ConcreteCommand3(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
         receiver.action3();
    }
}
