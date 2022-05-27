package primerParcial.ejercicio4;

public class FactorySubject {
    public static ISubject make(SubType subType){
        ISubject materia;
        switch (subType){
            case MATEMATICAS:
                materia=new Matematicas();
                break;
            case LENGUAJE:
                materia=new Lenguaje();
                break;
            case HISORIA:
                materia=new Historia();
                break;
            default:
                materia=new Ingles();
                break;
        }
        return materia;
    }
}

