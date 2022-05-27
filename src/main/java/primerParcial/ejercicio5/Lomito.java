package primerParcial.ejercicio5;

public class Lomito extends BuilderPlato{
    @Override
    public void buildTipoCarne() {
        this.plato.setTipoCarne("Lomo");
    }

    @Override
    public void buildSaborRefresco() {
        this.plato.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        this.plato.setGuarniciones("Arroz");
    }
}
