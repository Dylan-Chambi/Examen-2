package exam.exercise1;

public class Client {
    public static void main(String[] ardssd) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        VersionadorArchivo versionadorArchivo = new VersionadorArchivo();

        Archivo archivo = new Archivo(versionadorArchivo, baseDeDatos);

        archivo.addTexto("este documento es una prueba");
        archivo.addTexto("el exito solo depende de tu esfuerzo");
        archivo.addTexto("prologo");
        archivo.addTexto("este documento fue actualizado satisfactoriamente");

        System.out.println("---------------------------Archivo original---------------------------");
        archivo.showInfo();

        System.out.println("---------------------------Archivo recuperado - version 1---------------------------");
        archivo = versionadorArchivo.restoreVersion(baseDeDatos.getVersion("version1"));
        archivo.showInfo();

    }
}
