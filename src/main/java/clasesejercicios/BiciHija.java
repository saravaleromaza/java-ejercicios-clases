package clasesejercicios;

public class BiciHija extends Vehículo{

    @Override
    public void descripción() {

        System.out.println("Esto es una bicicleta");
    }

    @Override
    public void arranca() {
        System.out.println("La bici no tiene motor para arrancar");
    }
}
