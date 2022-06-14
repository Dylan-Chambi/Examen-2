package structure.interpreter.structure;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpressionParser extends AbstractExpression{
      private List<AbstractExpression> grammar = new ArrayList<>();
      private Context context;

      public NonTerminalExpressionParser(String msgToInterpreter){
                                // asegurando que el msg original no tenga espacios - regla gramatica
          context = new Context(msgToInterpreter.replace(" ",""));
          for ( String charOriginal :  msgToInterpreter.split(" ")) {
              switch (charOriginal){
                  case "A":
                      grammar.add(new TerminalExpressionA());
                      break;
                  case "B":
                      grammar.add(new TerminalExpressionB());
                      break;
                  case "C":
                      grammar.add(new TerminalExpressionC());
                      break;
                  case "D":
                      grammar.add(new TerminalExpressionD());
                      break;
                  case "E":
                      grammar.add(new TerminalExpressionE());
                      break;
                  default:
                      break;


              }
          }
      }

      public String evaluateMsg(){

          for (AbstractExpression expression:grammar) {
              expression.interpreter(context);
          }

          return context.output;
      }


    @Override
    public void interpreter(Context context) {

    }
}
