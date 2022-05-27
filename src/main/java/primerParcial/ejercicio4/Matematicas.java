package primerParcial.ejercicio4;

public class Matematicas implements ISubject{
    @Override
    public void showInfo(Estudiante estudiante) {
        System.out.println("MATEMATICAS");
        System.out.println("Tiene una duracion de " + duracion);
        System.out.println("CI Estudiante " + estudiante.getCi());
        System.out.println("Nombre estudiante" + estudiante.getName());
        System.out.println("El costo es: " + costo);
        System.out.println("La universidad es: " + universidad);
    }
}
