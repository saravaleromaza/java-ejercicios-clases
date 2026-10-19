//package clasesejercicios;
//
//import java.util.ArrayList;
//
//public class Clases {
//    public static void main(String[] args) {
//
//        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
//        var libro = new Book("Jane Austen", "Orgullo y Prejuicio");
//        System.out.print(libro.author);
//        System.out.print("--");
//        System.out.println(libro.title);
//
//        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
//        var perrito = new Dog("Jota", "Sara", 3);
//        System.out.println("el perro hace " + perrito.bark());
//
//        // 3. Añade un constructor a la clase Book que reciba title y author.
//        libro.bookDescription();
//
//        // 4. Crea una clase Car con atributos brand y model y un método showData().
//        var coche = new Car("BMW", "X3");
//        System.out.println(coche.showData());
//
//        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
//        var estudiante = new Student("Alejandro", 45);
//        System.out.println("Nota de " + estudiante.name + " : " + estudiante.aprobado());
//        var estudiante2 = new Student("Sofía", 84);
//        System.out.println("Nota de " + estudiante2.name + " : " + estudiante2.aprobado());
//
//        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
//        var cuentaBancaria = new Banco(53689);
//        System.out.println(cuentaBancaria.deposito());
//
//        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
//        var rectangulo = new Rectangle(12, 6);
//        System.out.println("Perímetro: " + rectangulo.perimetro());
//        System.out.println("Area: " + rectangulo.area());
//
//
//        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
//        var trabajador = new Worker("Diana", 1200);
//        System.out.println("El salario de " + trabajador.name + " es " + trabajador.suSalario() + "€");
//
//        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
//        var persona = new ArrayList<Person>();
//        persona.add(new Person("Sara", 31));
//        persona.add(new Person("Luis", 51));
//        persona.add(new Person("Irene", 36));
//
//        for (Person p:persona){
//            p.infoPerson();
//        }
//
//        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
//        var producto = new Product("Libro", 19.90);
//        System.out.println(producto.descuento());
//
//
//
//
//
//
//
//        }
//    }
//
