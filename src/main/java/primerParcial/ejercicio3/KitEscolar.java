package primerParcial.ejercicio3;

public class KitEscolar implements IKit {

    private Mochila mochila;

    private Deportivo deportivo;

    private Cuadernos cuadernos;


    public KitEscolar(Cuadernos cuadernos, Deportivo deportivo, Mochila mochila){
        this.cuadernos = cuadernos;
        this.deportivo = deportivo;
        this.mochila = mochila;
    }

    @Override
    public void showInfo() {
        System.out.println("*-*-*-*-*-*-* Kit Escolar *-*-*-*-*-*-*");

        System.out.println("La mochila cuenta con " + mochila.getNumeroBolsillos() +
                " bolsillos y es de un tamano de " + mochila.getTamano() +" cm");

        System.out.println("El deportivo es de talla " + deportivo.getTalla() +
                ", color " + deportivo.getColor() +" y viene en un conjunto de " +
                deportivo.getNumeroPrendas() + " prendas");

        System.out.println("Sus cuadernos son de " + cuadernos.getNumeroHojasl() +
                " hojas y sus especificaciones son " + cuadernos.getTipo());
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuadernos cuadernos) {
        this.cuadernos = cuadernos;
    }
}
