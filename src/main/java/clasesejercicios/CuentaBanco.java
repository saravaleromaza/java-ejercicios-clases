package clasesejercicios;

import java.util.Scanner;

public class CuentaBanco extends Banco{


    public CuentaBanco(double saldoInicial) {
        super(saldoInicial);
    }

   public void intereses(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Añade el tipo de interes: ");
       int intereses = sc.nextInt();

       System.out.println("Tipo de interes = " + intereses + "%");
   }
}
