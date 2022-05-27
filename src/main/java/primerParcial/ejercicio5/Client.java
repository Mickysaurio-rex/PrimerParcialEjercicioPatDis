package primerParcial.ejercicio5;

public class Client {
    public static void main(String[] args) {
        Cocinero jose = new Cocinero();
        BuilderPlato pB = new Bife();
        BuilderPlato pL = new Lomito();
        BuilderPlato pT = new Tira();

        jose.setBuilder(pB);
        jose.cocinarPlato();
        Plato plato1 = jose.getPlatoCocinado();
        System.out.println("*-*-*-*-*-*-*Plato de Bife*-*-*-*-*-*-*");
        plato1.showInfo();

        jose.setBuilder(pL);
        jose.cocinarPlato();
        Plato plato2 = jose.getPlatoCocinado();
        System.out.println("*-*-*-*-*-*-*Plato de Lomito*-*-*-*-*-*-*");
        plato2.showInfo();

        jose.setBuilder(pT);
        jose.cocinarPlato();
        Plato plato3 = jose.getPlatoCocinado();
        System.out.println("*-*-*-*-*-*-*Plato de Tira*-*-*-*-*-*-*");
        plato3.showInfo();
    }
}
