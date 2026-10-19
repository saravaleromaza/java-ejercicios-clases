package clasesejercicios;

public class Dog {

    //atributos

    String name;
    String dueño;
    int age;


    // constructor

    public Dog (String name, String dueño, int age){
        this.name = name;
        this.dueño = dueño;
        this.age = age;

    }

    public String bark(){
        return "GUAU!!";
    }

}


