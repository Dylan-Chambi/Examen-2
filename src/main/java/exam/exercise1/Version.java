package exam.exercise1;

public class Version {
    private Archivo state;

    public Version(Archivo archivo){
        state= archivo;
    }

    public Archivo getState() {
        return state;
    }
}
