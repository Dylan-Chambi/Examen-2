package structure.interpreter.structure;

public class TerminalExpressionA extends AbstractExpression{
    /**
     * dato entrada contexto =A B C D E
     * dato salido = 1
     * si en el mensaje encontramos la letra A remplazamos por
     * el numero 1 en el mensaje original
     * @param context
     */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("A")){
            context.output= context.output+"1";
            context.input= context.input.substring(1);
        }
    }
}
