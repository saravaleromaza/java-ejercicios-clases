package clasesejercicios;

import java.util.Scanner;

public class Product {

    String nombre;
    private double precio;

    public Product(String nombre, double precio){
        this.nombre = nombre;
        this.setPrecio(precio);
    }

    public double descuento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Descuento: ");
        double descuento = sc.nextDouble();

        return precio - descuento;

    }
    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0){
            this.precio = precio;
        } else {
            System.out.println("Precio no valido");
        }
    }
}


