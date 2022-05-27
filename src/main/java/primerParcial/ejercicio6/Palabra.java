package primerParcial.ejercicio6;

public class Palabra extends Descripcion{
    @Override
    public void interpreter(Context context) {
            context.output= context.output + context ;
            context.input= context.input.substring(context.input.length());
    }
}
