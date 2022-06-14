package exam.exercise5;

public class Client {

    public static void main (String[]args){
        Computer computer = new Computer(new RAM(0, "16GB", "Kingston"), new CPU(0, "AMD", 4));

        computer.setState(new EstadoApagado());
        computer.startComputerState();
        computer.resourceManager();
        computer.openProgram("Word");

        computer.setState(new EstadoPrendido());
        computer.startComputerState();
        computer.resourceManager();
        computer.openProgram("Outlook");
        computer.resourceManager();

        computer.setState(new EstadoReiniciando());
        computer.startComputerState();
        computer.resourceManager();
        computer.openProgram("Adobe Premiere");
        computer.resourceManager();
    }
}
