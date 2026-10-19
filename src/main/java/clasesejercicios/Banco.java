package clasesejercicios;

public class Banco {

    //atributos

    private double saldo;

    //constructor

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double depositar(double cantidad) {
        if (cantidad > 0){
            this.saldo += cantidad;
            System.out.println("Deposito realizado. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Cantidad no valida.");
        }
        return this.saldo;
    }

    public double retirar(double cantidad) {
        if (cantidad > this.saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo " + this.saldo);
        }
        return this.saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
