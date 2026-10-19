//package clasesejercicios;
//
//import java.util.ArrayList;
//
//public class ExHerencia {
//    public static void main(String[] args) {
//        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
//        Vehículo vehiculo = new Vehículo();
//        vehiculo.moverse();
//
//        CocheHijo coche = new CocheHijo();
//        coche.moverse();
//        coche.bocinazo();
//
//        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
//        Person persona = new Person("Olivia", 23);
//        Estudiantehijo estudiante = new Estudiantehijo("pepe", 25, 5.5);
//        estudiante.estudiar();
//
//        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
//        Animal animalGenerico = new Animal();
//        animalGenerico.hacerSonido();
//        Perro perroHijo = new Perro();
//        perroHijo.hacerSonido();
//        Gato gatoHijo = new Gato();
//        gatoHijo.hacerSonido();
//
//        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
//        Empleado empleado = new Empleado("Ana", 1598);
//        Manager managerEmpleado = new Manager("Sergio", 1687, "RRHH");
//
//        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
//
//        Circulo circulo = new Circulo(16);
//        System.out.println("El area del circulo es " + circulo.calcularArea());
//
//        Rectangulo rectangulo = new Rectangulo(15,10);
//        System.out.println("El area del rectangulo es " + rectangulo.calcularArea());
//
//        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
//        Pajaro pajarito = new Pajaro();
//        pajarito.volar();
//
//        Aguila rapaz = new Aguila();
//        rapaz.volar();
//
//        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
//        Dispositivo dispositivo = new Dispositivo();
//        dispositivo.divice();
//        Movil telefono = new Movil();
//        telefono.divice();
//
//        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
//        CuentaBanco cuentaBanco = new CuentaBanco(2365);
//        cuentaBanco.intereses();
//
//        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
//        Vehículo vehículo = new Vehículo();
//        vehículo.descripción();
//
//        CocheHijo cochecito = new CocheHijo();
//        cochecito.descripción();
//
//        BiciHija bici = new BiciHija();
//        bici.descripción();
//
//        CamionHijo camion = new CamionHijo();
//        camion.descripción();
//
//        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
//        ArrayList<Animal> animales = new ArrayList<>();
//
//        animales.add(new Perro());
//        animales.add(new Gato());
//        animales.add(new Pajaro());
//
//        for (Animal animal:animales){
//            animal.hacerSonido();
//        }
//
//
//    }
//}
