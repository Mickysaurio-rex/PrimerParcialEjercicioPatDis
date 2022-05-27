package primerParcial.ejercicio1;

public class ManejoSaldo {
    private static ManejoSaldo manejoSaldo;
    private int saldo;

    private ManejoSaldo() {
        saldo = 0;
    }


    private synchronized static void multiThreadControl() {
        if (manejoSaldo == null)
            manejoSaldo = new ManejoSaldo();
    }


    public static ManejoSaldo getInstance() {
        if (manejoSaldo == null)
            multiThreadControl();
        return manejoSaldo;
    }

    public synchronized void pagoCuota(int cantidad) {
        saldo = saldo + cantidad;
        System.out.println("Pago mensualidad: [" + cantidad + "]");
    }

    public synchronized void consultarSaldo() {
        System.out.println("El saldo es: [" + saldo + "]");
    }

    public int getSaldo() {
        return saldo;
    }
}