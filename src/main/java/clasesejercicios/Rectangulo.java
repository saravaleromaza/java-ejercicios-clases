package clasesejercicios;

public class Rectangulo extends FormaAbstracta{

    double base;
    double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
