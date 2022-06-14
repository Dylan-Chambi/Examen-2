package exam.exercise4;

import java.util.List;

public class EstrategiaOrdenamiento {
    private IStrategy strategy;

    private List<Estudiante> listaEstudiantes;

    public EstrategiaOrdenamiento(List<Estudiante> listaEstudiantes) {
        strategy = new OrdenarPorCI();
        this.listaEstudiantes=listaEstudiantes;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void ordenar(){
        listaEstudiantes = strategy.ordenar(listaEstudiantes);
    }
}
