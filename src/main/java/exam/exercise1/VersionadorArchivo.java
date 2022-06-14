package exam.exercise1;

public class VersionadorArchivo {
    private Archivo state;

    public void setMemento(Archivo state){
        this.state=state;
    }

    public Version createMemento(){
        return new Version(state);
    }

    public Archivo restoreMemento(Version m){
        this.state= m.getState();
        return this.state;
    }

}
