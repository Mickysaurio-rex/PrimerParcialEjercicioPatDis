package primerParcial.ejercicio2;

public class RecursosHumanos {
    public static void main(String[]args){


        Contrato contratoModelo = new Contrato();
        contratoModelo.setSueldo(5000);
        contratoModelo.setCargaHoraria(80);
        contratoModelo.setCursoSuperior(true);
        contratoModelo.setAccesoPlataforma(true);
        contratoModelo.setMarcaoBiometrico(false);
        contratoModelo.setHoraEntrada("8:00");
        contratoModelo.setHoraSalida("18:00");

        Contrato contrato1 = (Contrato) contratoModelo.clone();
        contrato1.setNombre("Juan");
        contrato1.setApellido("Molina");

        Contrato contrato2 = (Contrato) contratoModelo.clone();
        contrato2.setNombre("Miguel");
        contrato2.setApellido("Perico");

        contrato1.showInfo();
        contrato2.showInfo();
    }
}
