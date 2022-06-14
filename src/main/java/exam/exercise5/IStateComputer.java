package exam.exercise5;

public interface IStateComputer {
    void startComputerState(Computer computer);

    void openProgram(Computer computer, String programName);

    void resourceManager(Computer computer);

}
