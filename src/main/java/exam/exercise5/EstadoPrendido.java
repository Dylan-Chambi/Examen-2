package exam.exercise5;

import java.util.Random;

public class EstadoPrendido implements IStateComputer {


    @Override
    public void startComputerState(Computer computer) {
        System.out.println("Computadora en estado prendido....");
        int cantidadDeProgramasAbiertosRandom = new Random().nextInt(computer.getProgramasAbiertos().length);
        for(int i = 0; i < cantidadDeProgramasAbiertosRandom; i++) {
            openProgram(computer, computer.getProgramasInstalados()[new Random().nextInt(computer.getProgramasInstalados().length)]);
            System.out.println("Uso de CPU: " + computer.getCpu().getUsoCPU() + "%");
            System.out.println("Uso de RAM: " + computer.getRam().getUsoMemoria() + "%");
        }
        computer.setCantidadDeProgramasAbiertos(cantidadDeProgramasAbiertosRandom);
        computer.getCpu().setUsoCPU(cantidadDeProgramasAbiertosRandom * 5);
        computer.getRam().setUsoMemoria(cantidadDeProgramasAbiertosRandom * 5);
    }

    @Override
    public void openProgram(Computer computer, String programName) {
        System.out.println("Abriendo programa " + programName + "...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(computer.getCantidadDeProgramasAbiertos() < computer.getProgramasAbiertos().length) {
            computer.setCantidadDeProgramasAbiertos(computer.getCantidadDeProgramasAbiertos() + 1);
            computer.getProgramasAbiertos()[computer.getCantidadDeProgramasAbiertos() - 1] = programName;
            computer.getCpu().setUsoCPU(computer.getCpu().getUsoCPU() + 5);
            computer.getRam().setUsoMemoria(computer.getRam().getUsoMemoria() + 5);
            System.out.println("Se abrio el programa: " + programName);
        } else {
            System.out.println("ERROR> La computadora se quedo sin RAM y CPU.");
        }
    }

    @Override
    public void resourceManager(Computer computer) {
        System.out.println("Hay " + computer.getCantidadDeProgramasAbiertos() + " programas abiertos");
        for(int i = 0; i < computer.getCantidadDeProgramasAbiertos(); i++) {
            System.out.println(" - Programa " + (i + 1) + ": " + computer.getProgramasAbiertos()[i]);
        }
        System.out.println("Uso de CPU: " + computer.getCpu().getUsoCPU() + "%");
        System.out.println("Uso de RAM: " + computer.getRam().getUsoMemoria() + "%");
    }
}
