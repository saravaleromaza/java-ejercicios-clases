//package clasesejercicios;
//
//public class ExModificadoAcceso {
//    public static void main(String[] args) {

//        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
//        Person persona = new Person("Catalina", 56);
//        System.out.println(persona.getName() + ": " + persona.getAge() + " años.");
//        persona.setName("Diego");
//        persona.setAge(17);
//        System.out.println(persona.getName() + ": " + persona.getAge() + " años.");
//
//        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
//
//        Product producto = new Product("mesa", 20.50);
//        System.out.println("Producto: " + producto.nombre + "|" + "Precio: " + producto.getPrecio());
//        producto.setPrecio(15.50);
//        System.out.println("Producto: " + producto.nombre + "|" + "Precio: " + producto.getPrecio());
//
//        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
//
//        Banco cuentaAhorro = new Banco(1000);
//        cuentaAhorro.depositar(200);
//        System.out.println(cuentaAhorro.getSaldo());
//        cuentaAhorro.retirar(500);
//        System.out.println(cuentaAhorro.getSaldo());
//        cuentaAhorro.retirar(30000);
//
//        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
//
//        Book cuento = new Book("Disney", "Blancanieves");
//        System.out.println("Libro: " + cuento.getTitle() + " - " + "Autor: " + cuento.author);
//
//        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
//
//        Temperature temperatura = new Temperature(25);
//        temperatura.setCelsius(75);
//        temperatura.setCelsius(2000);
//
//        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
//
//        User usuario = new User("pepito", "2323contra");
//        usuario.checkPassword("589seguro");
//        usuario.checkPassword("2323contra");
//
//        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
//
//        Worker empleado = new Worker("Antonio", 1200);
//        empleado.aumento(50);
//        System.out.println(empleado.getSalario());
//
//        empleado.aumento(-56);
//
//        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
//
//        Rectangle rectangulo = new Rectangle(15, 6);
//        System.out.println("El area del rectangulo es: " + rectangulo.area());
//        rectangulo.setLargo(23);
//        rectangulo.setAncho(10);
//        System.out.println("El area del rectangulo es: " + rectangulo.area());
//
//        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
//
//        Student alumno = new Student("Yolanda", 60);
//        System.out.println(alumno.aprobado());
//        alumno.setNota(45);
//        System.out.println(alumno.aprobado());
//        alumno.setNota(89);
//        System.out.println(alumno.aprobado());
//
//        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
//        Car coche = new Car("BMW", "X78", 140);
//        coche.brake(40);
//        coche.accelerate(50);
//        coche.accelerate(160);
//
//
//    }
//}
