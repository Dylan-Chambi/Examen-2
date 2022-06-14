package exam.exercise5;

public class CPU {
    private int usoCPU;
    private String manufacturador;
    private int cantidadDeNucleos;

    public CPU(int usoCPU, String manufacturador, int cantidadDeNucleos) {
        this.usoCPU = usoCPU;
        this.manufacturador = manufacturador;
        this.cantidadDeNucleos = cantidadDeNucleos;
    }

    public int getUsoCPU() {
        return usoCPU;
    }

    public void setUsoCPU(int usoCPU) {
        this.usoCPU = usoCPU;
    }

    public String getManufacturador() {
        return manufacturador;
    }

    public void setManufacturador(String manufacturador) {
        this.manufacturador = manufacturador;
    }

    public int getCantidadDeNucleos() {
        return cantidadDeNucleos;
    }

    public CPU setCantidadDeNucleos(int cantidadDeNucleos) {
        this.cantidadDeNucleos = cantidadDeNucleos;
        return this;
    }
}
