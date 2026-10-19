package clasesejercicios;

public class EmailNotificacion extends Notificacion {

    @Override
    public void enviar() {
        System.out.println("Enviando notificación por email");
    }
}
