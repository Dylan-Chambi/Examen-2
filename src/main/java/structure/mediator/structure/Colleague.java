package structure.mediator.structure;

public abstract class Colleague {
       protected Mediator mediator;

       public Colleague(Mediator mediator){
              this.mediator=mediator;
       }

       public abstract void send(String msg);
       public abstract void received(String msg);
}
