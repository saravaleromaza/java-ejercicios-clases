package clasesejercicios;

public class SMSNotificacion extends Notificacion {

    @Override
    public void enviar() {
        System.out.println("Enviando notificación por sms");
    }
}
