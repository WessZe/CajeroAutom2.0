package Cajero2;

import java.util.Scanner;

public abstract class Operaciones {

    protected int transacciones, retiro, deposito;
    private static int saldo;

    Scanner entrada = new Scanner(System.in);
    Scanner opcion = new Scanner(System.in);

    public void Seleccion() {

        int seleccion, comodin = 0;

        do {
            do {
                System.out.println("Porfavor seleccione una opcion:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Historial de transacciones.");
                System.out.println("    5. Salir del Sistema.");
                seleccion = opcion.nextInt();

                if (seleccion >= 1 && seleccion <= 5) {
                    comodin = 1;
                } else {
                    System.out.println("------------------------------------------");
                    System.out.println("Opcion No Disponible, Vuelva a intentar");
                    System.out.println("------------------------------------------");
                }
            } while (comodin == 0);

            if (seleccion == 1) {

                Operaciones mensajero = new consulta();
                mensajero.Transaccion();

            } else if (seleccion == 2) {

                Operaciones mensajero = new Retiro();
                mensajero.Transaccion();

            } else if (seleccion == 3) {

                Operaciones mensajero = new Deposito();
                mensajero.Transaccion();

            } else if (seleccion == 4) {
                System.out.println("historial en construccion");

            } else if (seleccion == 5) {
                System.out.println("-------------------------------------------");
                System.out.println("Muchas Gracias por usar nuestros servicios");
                System.out.println("-------------------------------------------");
                comodin = 2;
            }

        } while (comodin != 2);
    }

//consulta
//retiro
    public void Retiro() {
        retiro = entrada.nextInt();
    }

//Deposito
    public void Deposito() {
        //deposito = entrada.nextInt();

    }

//transacaccion
    public abstract void Transaccion();

//consulta y setear 
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo2) {
        this.saldo = saldo2;
    }

}
