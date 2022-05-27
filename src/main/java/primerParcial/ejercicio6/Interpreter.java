package primerParcial.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends Descripcion{

    private List<Descripcion> grammar = new ArrayList<>();

    private Context context;

    public Interpreter(String msgToInterpreter){
        context = new Context(msgToInterpreter.replace(" ",""));
        for ( String charOriginal :  msgToInterpreter.split(" ")) {
            switch (charOriginal){
                case "Como":
                    grammar.add(new Como());
                    break;
                case "Quiero":
                    grammar.add(new Quiero());
                    break;
                case "Para":
                    grammar.add(new Para());
                    break;
                default:
                    grammar.add(new Para());
                    break;


            }
        }
    }

    public String evaluateMsg(){

        for (Descripcion expression:grammar) {
            expression.interpreter(context);
        }

        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}
