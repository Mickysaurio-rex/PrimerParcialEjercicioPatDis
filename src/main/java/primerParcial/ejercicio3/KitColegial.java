package primerParcial.ejercicio3;

public class KitColegial implements IKit{
    private Mochila mochila;

    private Libros libros;

    private Computadora computadora;

    public KitColegial(Mochila mochila, Libros libros, Computadora computadora){
        this.mochila = mochila;
        this.libros = libros;
        this. computadora = computadora;
    }

    @Override
    public void showInfo() {
        System.out.println("*-*-*-*-*-*-* Kit Colegial *-*-*-*-*-*-*");

        System.out.println("La mochila cuenta con " + mochila.getNumeroBolsillos() +
                " bolsillos y es de un tamano de " + mochila.getTamano() +" cm");

        System.out.println("Los libros son de " + libros.getAutor() +
                ", y cuentan con las siguientes especificaciones " + libros.getTipo());

        System.out.println("La computadora es marca " + computadora.getMarca() +
                " y funciona con " + computadora.getOs());
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
