package primerParcial.ejercicio3;

public class Client {
    public static void main (String []args){
        KitEscolar kit1 = new CreatorKitEscolar().createProduct();
        kit1.showInfo();

        KitColegial kit2 = new CreatorKitColegial().createProduct();
        kit2.showInfo();
    }
}
