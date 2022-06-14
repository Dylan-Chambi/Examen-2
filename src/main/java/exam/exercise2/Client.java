package exam.exercise2;

public class Client {

    public static void main(String[]args) throws ClassNotFoundException {
        ChatJuego mediator = new ChatJuego();

        Estudiante estudiante1 = new Estudiante(mediator, "Daef", "Dylan", "Oro");
        Estudiante estudiante2 = new Estudiante(mediator, "Maiaa", "Maria", "Plata");
        Estudiante estudiante3 = new Estudiante(mediator, "Zayk", "Juan", "Oro");

        Docente docente1 = new Docente(mediator, "Ponce", "Paul", "Bronce");
        Docente docente2 = new Docente(mediator, "Malik", "Mario", "Platino");
        Docente docente3 = new Docente(mediator, "Jomy", "Joseph", "Oro");

        mediator.addJugador(estudiante1);
        mediator.addJugador(estudiante2);
        mediator.addJugador(estudiante3);
        mediator.addJugador(docente1);
        mediator.addJugador(docente2);
        mediator.addJugador(docente3);

        docente1.sendTeam("Hola team de docentes");

        estudiante1.sendTeam("Hola team de estudiantes");

        estudiante3.sendAll("Hola a todos");


    }

}
