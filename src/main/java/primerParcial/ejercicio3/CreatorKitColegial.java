package primerParcial.ejercicio3;

public class CreatorKitColegial extends Creator{
    @Override
    public KitColegial createProduct() {
        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(4);
        mochila.setTamano(40);

        Libros libros = new Libros();
        libros.setAutor("Julio Verne");
        libros.setTipo("Tapa dura, empastado, editorial Santillana, novela");

        Computadora computadora = new Computadora();
        computadora.setMarca("Toshiba");
        computadora.setOs("Windows 11");

        KitColegial kitColegial = new KitColegial(mochila,libros,computadora);
        return kitColegial;
    }
}
