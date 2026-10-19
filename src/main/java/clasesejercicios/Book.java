package clasesejercicios;

public class Book {

    //Atributos

    String author;
    private String title;

    //Constructor

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    //Métodos

    public void bookDescription(){
        System.out.println("Este libro es " + getTitle() + " del autor/a " + author);
    }

    public String getTitle() {
        return title;
    }
}
