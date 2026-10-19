package clasesejercicios;

public class Temperature {

    private  double celsius;


    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public double setCelsius(double grades){
        if (grades >= -100 && grades <= 100){
            this.celsius = grades;
            System.out.println("La temperatura actual es de " + this.celsius + " ºC.");
        } else {
            System.out.println("Temperatura invalida");
        }

        return this.celsius;
    }

    public double getCelsius() {
        return celsius;
    }
}
