package clasesejercicios;

public class CocheHijo extends Vehículo {



    public void bocinazo(){

        System.out.println("PIII PIIIII");
    }

    @Override
    public void descripción() {

        System.out.println("Esto es un coche");
    }

    @Override
    public void arranca() {
        System.out.println("El coche arranca");
    }
}
