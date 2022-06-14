package exam.exercise4;

import java.util.List;

public class OrdenarPorCarrera implements IStrategy {

    @Override
    public List<Estudiante> ordenar(List<Estudiante> listaEstudiantes) {
        System.out.println("Ordenando por Carrera...");
        listaEstudiantes.sort((e1, e2) -> e1.getCarrera().compareTo(e2.getCarrera()));
        return listaEstudiantes;
    }
}
