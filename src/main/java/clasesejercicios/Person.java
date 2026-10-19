package clasesejercicios;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public void infoPerson(){
        System.out.println("Nombre: " + name + " Edad: " + age);
    }

    public String getName(){  //para poder acceder aunque sea privado
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }


}
