package primerParcial.ejercicio1;

public class Client {
    public static void main(String [] args){

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero cajeroColegio = new Cajero(new Person("Jose "),567);
                System.out.println("El Saldo inicial es: " + ManejoSaldo.getInstance().getSaldo());
                System.out.print("El estudiante " + cajeroColegio.getPerson().getName() + " realizo la accion de: ");
                cajeroColegio.pagarCuota(100);
                cajeroColegio.darSaldo();
                cajeroColegio.setPerson(new Person("Miguel"));
                System.out.print("El estudiante " + cajeroColegio.getPerson().getName() + " realizo la accion de: ");
                cajeroColegio.pagarCuota(100);
                cajeroColegio.darSaldo();
                cajeroColegio.setPerson(new Person("Juan"));
                System.out.print("El estudiante " + cajeroColegio.getPerson().getName() + " realizo la accion de: ");
                cajeroColegio.pagarCuota(100);
                cajeroColegio.darSaldo();
                cajeroColegio.setPerson(new Person("Nestor"));
                System.out.print("El estudiante " + cajeroColegio.getPerson().getName() + " realizo la accion de: ");
                cajeroColegio.pagarCuota(100);
                cajeroColegio.darSaldo();
                cajeroColegio.setPerson(new Person("Nestor"));
                System.out.print("El estudiante " + cajeroColegio.getPerson().getName() + " realizo la accion de: ");
                cajeroColegio.pagarCuota(100);
                cajeroColegio.darSaldo();
            }
        });


        hilo1.start();

    }
}
