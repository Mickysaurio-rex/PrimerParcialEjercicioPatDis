package primerParcial.ejercicio6;

public class Como extends Descripcion{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como")){
            context.output= context.output+" Given ";
            context.input= context.input.substring(4);
        }
    }
}
