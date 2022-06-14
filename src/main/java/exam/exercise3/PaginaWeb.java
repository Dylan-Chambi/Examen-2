package exam.exercise3;

import java.util.*;

public class PaginaWeb implements ISubject {

    private HashMap<IObserver, HashSet<TipoNotificacion>> subscripciones = new HashMap<>();


    public PaginaWeb(){

    }


    @Override
    public void subscribirUsuario(IObserver observer, TipoNotificacion tipoNotificacion) {
        if(subscripciones.containsKey(observer)){
            subscripciones.get(observer).add(tipoNotificacion);
        }else{
            subscripciones.put(observer, new HashSet<>(Set.of(tipoNotificacion)));
        }
    }


    @Override
    public void desubscribirUsuario(IObserver observer, TipoNotificacion tipoNotificacion) {
        if(subscripciones.containsKey(observer)){
            subscripciones.get(observer).remove(tipoNotificacion);
        }
    }

    @Override
    public void notifyObservers(String msg, TipoNotificacion tipoNotificacion) {
        for (Map.Entry<IObserver, HashSet<TipoNotificacion>> entry : subscripciones.entrySet()) {
            if(entry.getValue().contains(tipoNotificacion)){
                entry.getKey().update(msg);
            }
        }
    }
}
