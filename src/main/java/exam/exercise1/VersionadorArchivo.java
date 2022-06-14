package exam.exercise1;

public class VersionadorArchivo {
    private Archivo state;

    public void setVersion(Archivo state){
        this.state=state;
    }

    public Version createVersion(){
        return new Version(state);
    }

    public Archivo restoreVersion(Version version){
        this.state= version.getState();
        return this.state;
    }

}
