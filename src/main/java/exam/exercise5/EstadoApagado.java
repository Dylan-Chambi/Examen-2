package exam.exercise5;

import java.util.Arrays;

public class EstadoApagado implements IStateComputer {


    @Override
    public void startComputerState(Computer computer) {
        System.out.println("La computadora esa en estado apagado...");
        Arrays.fill(computer.getProgramasAbiertos(), null);
        computer.setCantidadDeProgramasAbiertos(0);
        computer.getCpu().setUsoCPU(0);
        computer.getRam().setUsoMemoria(0);
    }

    @Override
    public void openProgram(Computer computer, String programName) {
        System.out.println("ERROR> La computadora esta apagada y no puede abrir el programa " + programName + ".");
    }

    @Override
    public void resourceManager(Computer computer) {
        System.out.println("Hay " + computer.getCantidadDeProgramasAbiertos() + " programas abiertos");
        System.out.println("Uso de CPU: " + computer.getCpu().getUsoCPU() + "%");
        System.out.println("Uso de RAM: " + computer.getRam().getUsoMemoria() + "%");
    }
}
