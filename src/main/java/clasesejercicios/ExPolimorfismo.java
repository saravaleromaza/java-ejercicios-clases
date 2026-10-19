package clasesejercicios;

import java.util.ArrayList;

public class ExPolimorfismo {
    public static void main(String[] args) {
        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Gato());
        animales.add(new Perro());
        animales.add(new Vaca());

            //recorrer la lista para llamar al metodo
        for (Animal animal:animales){
            animal.hacerSonido();
        }

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.

        ArrayList<FormaAbstracta> formas = new ArrayList<>();

        formas.add(new Circulo(20));
        formas.add(new Rectangulo(12,6));

        for (FormaAbstracta figura:formas){
            System.out.println(figura.calcularArea());
        }

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.

        Printer imp = new Printer();

        imp.imprimir("Isabel");
        imp.imprimir(25);
        imp.imprimir(1.85);

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.

        Saludador hello = new Saludador();
        hello.saludar();
        hello.saludar("Sara");

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.

        ArrayList<Vehículo> vehiculos = new ArrayList<>();

        vehiculos.add(new CocheHijo());
        vehiculos.add(new BiciHija());
        vehiculos.add(new CamionHijo());

        for (Vehículo vehiculo:vehiculos){
            vehiculo.arranca();
        }

        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

        Notificacion rin = new Notificacion();

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.

        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.

        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
    }

    public void sendNotificacion(Notificacion n){

        n.enviar();
    }
}
