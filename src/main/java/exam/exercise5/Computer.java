package exam.exercise5;

import java.util.Arrays;

public class Computer {
    private String[] programasAbiertos = new String[20];
    private String[] programasInstalados = {"Discord", "AnyDesk", "Zoom", "Google Chrome", "Explorador de Archivos"};

    private int cantidadDeProgramasAbiertos;

    private RAM ram;

    private CPU cpu;

    public String[] getProgramasInstalados() {
        return programasInstalados;
    }

    private IStateComputer state = new EstadoApagado();

    public Computer(RAM ram, CPU cpu) {
        this.cantidadDeProgramasAbiertos = 0;
        Arrays.fill(this.programasAbiertos, null);
        this.ram = ram;
        this.cpu = cpu;
    }

    public String[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public int getCantidadDeProgramasAbiertos() {
        return cantidadDeProgramasAbiertos;
    }

    public void setCantidadDeProgramasAbiertos(int cantidadDeProgramasAbiertos) {
        this.cantidadDeProgramasAbiertos = cantidadDeProgramasAbiertos;
    }

    public RAM getRam() {
        return ram;
    }

    public Computer setRam(RAM ram) {
        this.ram = ram;
        return this;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Computer setCpu(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public IStateComputer getState() {
        return state;
    }

    public void setState(IStateComputer state) {
        this.state = state;
    }

    public void startComputerState(){
        this.state.startComputerState(this);
    }

    public void openProgram(String program) {
        this.state.openProgram(this, program);
    }

    public void resourceManager() {
        this.state.resourceManager(this);
    }
}
