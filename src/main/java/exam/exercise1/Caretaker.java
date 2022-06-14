package exam.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    // objeto que almacena momentos/stados ---> LIST
    private List<Version> stateList = new ArrayList<>();

    public void addMemento(Version m){
        stateList.add(m);
    }

    // forma de obtener objetos de nuestro almacenador de datos ---> LIST
    public Version getMemento(int position){
        return stateList.get(position);
    }


}
