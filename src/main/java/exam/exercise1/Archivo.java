package exam.exercise1;

public class Archivo {
    private String texto = "";
    private VersionadorArchivo versionadorArchivo;
    private BaseDeDatos baseDeDatos;

    public Archivo(VersionadorArchivo versionadorArchivo, BaseDeDatos baseDeDatos, String texto){
        this.versionadorArchivo = versionadorArchivo;
        this.baseDeDatos = baseDeDatos;
        this.texto = texto;
    }
    public Archivo(VersionadorArchivo versionadorArchivo, BaseDeDatos baseDeDatos){
        this.versionadorArchivo = versionadorArchivo;
        this.baseDeDatos = baseDeDatos;
        this.texto = texto;
    }

    public void addTexto(String texto){
        this.texto += (" " + texto);
        if(texto.split(" ").length >= 5){
            versionadorArchivo.setVersion(new Archivo(this.versionadorArchivo, this.baseDeDatos, this.texto));
            baseDeDatos.addVersion(versionadorArchivo.createVersion(), "version" + baseDeDatos.getVersionContador());
        }
    }

    public void showInfo(){
        System.out.println(this.texto);
    }
}
