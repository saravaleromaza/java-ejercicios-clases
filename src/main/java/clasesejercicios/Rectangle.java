package clasesejercicios;

public class Rectangle {

    private int largo;
    private int ancho;

    public Rectangle(int largo, int ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public void setLargo(int largo){
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getLargo() {
        return largo;
    }

    public int perimetro(){
        return 2 * (largo + ancho);
    }

    public int area(){
        return largo * ancho;
    }


}
