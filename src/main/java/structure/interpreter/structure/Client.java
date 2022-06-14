package structure.interpreter.structure;

public class Client {

    public static void main (String[]args){

        String msg=" A A B B A A C C C";
        NonTerminalExpressionParser parser = new NonTerminalExpressionParser(msg);
        System.out.println("msg interpretado: "+parser.evaluateMsg());
    }
}
