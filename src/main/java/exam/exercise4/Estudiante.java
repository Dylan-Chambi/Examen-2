package exam.exercise4;

public class Estudiante {
    private String ci;
    private String nombre;
    private String fechaNacimiento;
    private String carrera;

    public Estudiante(String ci, String nombre, String fechaNacimiento, String carrera) {
        this.ci = ci;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void shoInfo(){
        System.out.println("ci: "+ci +" nombre: "+nombre+" fechaNacimiento: "+fechaNacimiento+" carrera: "+carrera);
    }
}
