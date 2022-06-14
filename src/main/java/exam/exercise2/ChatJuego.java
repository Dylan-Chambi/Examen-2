package exam.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ChatJuego implements Mediator {

    private List<Jugador> grupoLista = new ArrayList<>();

    public void addJugador(Jugador jugador){
        grupoLista.add(jugador);
    }


    @Override
    public void sendAll(String msg, Jugador jugador) {
        for(Jugador jugadorReciever : grupoLista){
            if(!jugadorReciever.getAlias().equals(jugador.getAlias())){
                jugadorReciever.received(msg);
            }
        }
    }

    @Override
    public void sendTeam(String msg, Jugador jugador) throws ClassNotFoundException {
        for(Jugador jugadorReciever : grupoLista){
            if(!jugadorReciever.getAlias().equals(jugador.getAlias())){
                if(jugador instanceof Docente){
                    if(jugadorReciever instanceof Docente){
                        jugadorReciever.received(msg);
                    }
                }else if(jugador instanceof Estudiante) {
                    if (jugadorReciever instanceof Estudiante) {
                        jugadorReciever.received(msg);
                    }
                }else{
                    throw new ClassNotFoundException("Esta clase no es valida");
                }
            }
        }
    }
}
