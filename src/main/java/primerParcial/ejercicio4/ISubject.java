package primerParcial.ejercicio4;

public interface ISubject {

    int duracion=300;
    Estudiante estudiante =new Estudiante("default",0);
    int costo=27;
    String universidad = "UMSA";


    void showInfo(Estudiante estudiante);
}
