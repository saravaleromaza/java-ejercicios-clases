package clasesejercicios;

public class CamionHijo extends Vehículo {

    @Override
    public void descripción() {

        System.out.println("Esto es un camion");
    }

    @Override
    public void arranca() {
        System.out.println("El camión arranca");
    }
}
