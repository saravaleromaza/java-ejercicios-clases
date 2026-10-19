package clasesejercicios;

public class Worker {

    String name;
    private double salario;

    public Worker(String name, double salario){
        this.name = name;
        this.salario = salario;
    }

//    public double suSalario(){
//        return salario;
//    }


    public double getSalario() {
        return salario;
    }

    public double aumento(double porcentaje){
        if (porcentaje > 0){
            this.salario += this.salario * (porcentaje / 100);
        } else {
            System.out.println("El aumento debe ser positivo");
        }
        return this.salario;
    }


}
