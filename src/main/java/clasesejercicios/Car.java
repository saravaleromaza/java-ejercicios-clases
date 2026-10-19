package clasesejercicios;

public class Car {

    //atributos

    String brand;
    String model;
    private int speed;

    //constructor

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }



    //método


    public int getSpeed() {
        return speed;
    }

    public int accelerate(int amount){
        if (amount > 120){
            System.out.println("Has pasado el límite de velocidad");
        } else if (amount <= 120 && amount > 0) {
            this.speed += amount;
            System.out.println("Velocidad actual: " + this.speed);
        } else{
            System.out.println("Debes aumentar la velocidad");
        }
        return this.speed;
    }

    public int brake(int amount){
        if(amount > 0 && amount < speed){
            this.speed -= amount;
            System.out.println("Velocidad actual: " + this.speed);
        }else {
            System.out.println("Debes indicar un valor positivo para frenar");
        }
        return this.speed;
    }

    public String showData(){
        return "Marca: " + brand + " Modelo: " + model + " Velocidad: " + speed;

    }
}
