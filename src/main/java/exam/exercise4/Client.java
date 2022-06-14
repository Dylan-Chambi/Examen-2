package exam.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main (String[]args){
        List<Estudiante> estudianteList = new ArrayList<>();

        estudianteList.add(new Estudiante("789546", "Dylan", "12/07/02", "Ing Sistemas"));
        estudianteList.add(new Estudiante("456", "Carlos", "12/07/99", "Ing Eletronica"));
        estudianteList.add(new Estudiante("45645", "Esteban", "12/07/05", "Ing Ambiental"));
        estudianteList.add(new Estudiante("189", "Ana", "02/12/15", "Ing Petrolera"));
        estudianteList.add(new Estudiante("9875", "Julio", "01/01/12", "Arquitectura"));

        EstrategiaOrdenamiento estrategiaOrdenamiento = new EstrategiaOrdenamiento(estudianteList);

        for(Estudiante estudiante : estudianteList){
            estudiante.shoInfo();
        }

        estrategiaOrdenamiento.setStrategy(new OrdenarPorCI());
        estrategiaOrdenamiento.ordenar();

        for(Estudiante estudiante : estudianteList){
            estudiante.shoInfo();
        }

        estrategiaOrdenamiento.setStrategy(new OrdenarPorNombre());
        estrategiaOrdenamiento.ordenar();

        for(Estudiante estudiante : estudianteList){
            estudiante.shoInfo();
        }

        estrategiaOrdenamiento.setStrategy(new OrdenarPorCarrera());
        estrategiaOrdenamiento.ordenar();

        for(Estudiante estudiante : estudianteList){
            estudiante.shoInfo();
        }



    }

}
