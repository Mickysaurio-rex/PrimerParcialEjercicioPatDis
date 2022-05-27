package primerParcial.ejercicio6;

public class Para extends Descripcion{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Para")){
            context.output= context.output+" Then ";
            context.input= context.input.substring(4);
        }
    }
}
