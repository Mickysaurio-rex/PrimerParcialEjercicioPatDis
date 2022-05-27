package primerParcial.ejercicio4;

public class Client {
    public static void main (String[]args){

        Estudiante estudiante1 = new Estudiante("Miguel", 6897622);
        Estudiante estudiante2 = new Estudiante("Juan", 3283289);
        Estudiante estudiante3 = new Estudiante("Rebeca", 9694146);
        Estudiante estudiante4 = new Estudiante("Camila", 24892042);
        Estudiante estudiante5 = new Estudiante("Nestor", 2748220);


        FactorySubject.make(SubType.MATEMATICAS).showInfo(estudiante1);
        FactorySubject.make(SubType.HISORIA).showInfo(estudiante2);
        FactorySubject.make(SubType.LENGUAJE).showInfo(estudiante3);
        FactorySubject.make(SubType.INGLES).showInfo(estudiante4);
        FactorySubject.make(SubType.MATEMATICAS).showInfo(estudiante5);

    }
}
