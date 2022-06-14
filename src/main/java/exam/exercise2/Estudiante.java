package exam.exercise2;

public class Estudiante extends Jugador {

    public Estudiante(Mediator mediator, String alias, String nombre, String ranking){
        super(mediator, alias, nombre, ranking);
    }

    @Override
    public void sendAll(String msg) {
        mediator.sendAll(msg, this);
    }

    @Override
    public void sendTeam(String msg) throws ClassNotFoundException {
        mediator.sendTeam(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println(this.getNombre() + " (Estudiante) recibio el mensaje: [" + msg + "]");
    }
}
