package exam.exercise4;

import java.util.List;

public class OrdenarPorNombre implements IStrategy {

    @Override
    public List<Estudiante> ordenar(List<Estudiante> listaEstudiantes) {
        System.out.println("Ordenando por Nombre...");
        listaEstudiantes.sort((e1, e2) -> e1.getNombre().compareTo(e2.getNombre()));
        return listaEstudiantes;
    }
}
