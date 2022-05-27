package primerParcial.ejercicio3;

public class CreatorKitEscolar extends Creator{

    @Override
    public KitEscolar createProduct() {
        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(4);
        mochila.setTamano(40);

        Deportivo deportivo = new Deportivo();
        deportivo.setColor("Verde");
        deportivo.setNumeroPrendas(6);
        deportivo.setTalla("M");

        Cuadernos cuadernos = new Cuadernos();
        cuadernos.setNumeroHojasl(100);
        cuadernos.setTipo("Anillado, tamano carta, marca TOP");

        KitEscolar kitEscolar = new KitEscolar(cuadernos, deportivo, mochila);
        return kitEscolar;
    }
}
