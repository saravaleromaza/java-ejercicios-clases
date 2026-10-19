package clasesejercicios;

public class Estudiantehijo extends Person{

    private double nota;

    public Estudiantehijo(String name, int age, double nota) {
        super(name, age);
        this.nota = nota;

    }

    public void estudiar(){
        System.out.println("El estudiante está estudiando");
    }
}
