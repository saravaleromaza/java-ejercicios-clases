package clasesejercicios;

public class Manager extends Empleado{

    String departamento;

    public Manager(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
}
