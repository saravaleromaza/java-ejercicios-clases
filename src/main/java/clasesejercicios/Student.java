package clasesejercicios;

public class Student {

    //atributos

    String name;
   private double nota;

    //constructor

    public Student(String name, double nota){
        this.name = name;
        this.nota = nota;
    }

    //métodos


    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean aprobado(){
        if (nota >= 60){
            return true;
        }else{
            return false;
        }
    }


}
