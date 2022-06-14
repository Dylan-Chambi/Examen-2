package structure.command.structure;

public class Client {
    public static void main(String [] args){
           Receiver receiver = new Receiver();
           ChildReceiver p1 = new ChildReceiver();

           ConcreteCommand1 cmd1= new ConcreteCommand1(p1);
           ConcreteCommand2 cmd2= new ConcreteCommand2(p1);
           ConcreteCommand3 cmd3= new ConcreteCommand3(p1);

           Invoker invoker = new Invoker();

           invoker.addCommand(cmd1);
           invoker.addCommand(cmd3);
           invoker.addCommand(cmd2);
           invoker.addCommand(cmd1);

           invoker.runCommands();
    }

}
