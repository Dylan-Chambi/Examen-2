package exam.exercise2;

public abstract class Jugador {
       private String alias;
       private String nombre;
       private String ranking;

       public String getAlias() {
              return alias;
       }

       public void setAlias(String alias) {
              this.alias = alias;
       }

       public String getNombre() {
              return nombre;
       }

       public void setNombre(String nombre) {
              this.nombre = nombre;
       }

       public String getRanking() {
              return ranking;
       }

       public void setRanking(String ranking) {
              this.ranking = ranking;
       }

       protected Mediator mediator;

       public Jugador(Mediator mediator, String alias, String nombre, String ranking){
              this.mediator=mediator;
              this.alias=alias;
              this.nombre=nombre;
              this.ranking=ranking;
       }

       public abstract void sendAll(String msg);
       public abstract void sendTeam(String msg) throws ClassNotFoundException;
       public abstract void received(String msg);
}
