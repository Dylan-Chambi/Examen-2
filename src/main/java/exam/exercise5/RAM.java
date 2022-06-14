package exam.exercise5;

public class RAM {
    private int usoMemoria;
    private String manufacturador;
    private String capacidadGB;

    public RAM(int usoMemoria, String manufacturador, String capacidadGB) {
        this.usoMemoria = usoMemoria;
        this.manufacturador = manufacturador;
        this.capacidadGB = capacidadGB;
    }

    public int getUsoMemoria() {
        return usoMemoria;
    }

    public void setUsoMemoria(int usoMemoria) {
        this.usoMemoria = usoMemoria;
    }

    public String getManufacturador() {
        return manufacturador;
    }

    public void setManufacturador(String manufacturador) {
        this.manufacturador = manufacturador;
    }

    public String getCapacidadGB() {
        return capacidadGB;
    }

    public void setCapacidadGB(String capacidadGB) {
        this.capacidadGB = capacidadGB;
    }
}
