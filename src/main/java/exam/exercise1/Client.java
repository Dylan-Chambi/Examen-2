package exam.exercise1;

public class Client {
    public static void main(String[] ardssd) {
        Caretaker caretaker = new Caretaker();
        VersionadorArchivo versionadorArchivo = new VersionadorArchivo();

        Archivo archivo;

        archivo = new Archivo("eynar", "State1");
        versionadorArchivo.setMemento(archivo); // ----> crear un momento basado PC
        caretaker.addMemento(versionadorArchivo.createMemento()); // ---> guardar el momento [0]
        archivo = new Archivo("jose", "State2");
        versionadorArchivo.setMemento(archivo);
        archivo = new Archivo("maria", "State3");
        versionadorArchivo.setMemento(archivo);
        archivo = new Archivo("mario", "State4");
        versionadorArchivo.setMemento(archivo);
        caretaker.addMemento(versionadorArchivo.createMemento()); // [1]
        archivo = new Archivo("juan", "State5");
        versionadorArchivo.setMemento(archivo);
        archivo = new Archivo("upb", "State6");
        versionadorArchivo.setMemento(archivo);
        caretaker.addMemento(versionadorArchivo.createMemento()); // [2]

        archivo = versionadorArchivo.restoreMemento(caretaker.getMemento(1));
        System.out.println("*************VALORES ACTUALES ********************");
        archivo.showInfo();

    }
}
