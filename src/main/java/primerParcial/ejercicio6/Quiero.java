package primerParcial.ejercicio6;

public class Quiero extends Descripcion{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Quiero")){
            context.output= context.output+" When ";
            context.input= context.input.substring(6);
        }
    }
}
