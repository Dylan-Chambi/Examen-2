package exam.exercise5;

public class EstadoReiniciando implements IStateComputer {


    @Override
    public void startComputerState(Computer computer) {
        System.out.println("La computadora se esta reiniciando...");
        System.out.println("Cerrando " + computer.getCantidadDeProgramasAbiertos() + " programas y reiniciando");
        for(int i = 0; i < computer.getProgramasAbiertos().length; i++){
            computer.getProgramasAbiertos()[i] = null;
        }
        computer.setCantidadDeProgramasAbiertos(0);
        computer.getCpu().setUsoCPU(0);
        computer.getRam().setUsoMemoria(0);
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Reiniciado!");
    }

    @Override
    public void openProgram(Computer computer, String programName) {
        System.out.println("Abriendo programa " + programName + "...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int ultimoProgramaAbiertoIndice = computer.getCantidadDeProgramasAbiertos();
        if(ultimoProgramaAbiertoIndice < computer.getProgramasAbiertos().length) {
            computer.setCantidadDeProgramasAbiertos(ultimoProgramaAbiertoIndice + 1);
            computer.getProgramasAbiertos()[ultimoProgramaAbiertoIndice] = programName;
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
        System.out.println("Uso de CPU: " + computer.getCpu().getUsoCPU() + "%");
        System.out.println("Uso de RAM: " + computer.getRam().getUsoMemoria() + "%");
    }
}
