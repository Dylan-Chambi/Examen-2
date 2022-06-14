package structure.chainofresponsibility.structure;

public class Client {
    public static void main(String []args){

        ManagerHandler managerHandler= new ManagerHandler();
        managerHandler.criteriaHandler(900);

    }
}
