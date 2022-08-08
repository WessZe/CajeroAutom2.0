package Cajero2;

import java.util.Scanner;

public class Deposito extends Operaciones {

    @Override
    public void Transaccion() {
        Scanner entrada = new Scanner(System.in);
        int quiniento, dosciento, cien, cincuenta, veinte, diez, cinco, dos, uno, total;

        //System.out.print("Cuanto desea depositar: ");
        //Deposito();
        System.out.println("Que denominacion desea hacer el deposito:");
        System.out.print("Quinientos: ");
        quiniento = opcion.nextInt();
        System.out.print("dosciento: ");
        dosciento = opcion.nextInt();
        System.out.print("cien: ");
        cien = opcion.nextInt();
        System.out.print("cincuenta: ");
        cincuenta = opcion.nextInt();
        System.out.print("veinte: ");
        veinte = opcion.nextInt();
        System.out.print("diez: ");
        diez = opcion.nextInt();
        System.out.print("cinco: ");
        cinco = opcion.nextInt();
        System.out.print("dos: ");
        dos = opcion.nextInt();
        System.out.print("uno: ");
        uno = opcion.nextInt();

        if (quiniento > 0) {
            quiniento = quiniento * 500;
        }
        if (dosciento > 0) {
            dosciento = dosciento * 200;
        }
        if (cien > 0) {
            cien = cien * 100;
        }
        if (cincuenta > 0) {
            cincuenta = cincuenta * 50;
        }
        if (veinte > 0) {
            veinte = veinte * 20;
        }
        if (diez > 0) {
            diez = diez * 10;
        }
        if (cinco > 0) {
            cinco = cinco * 5;
        }
        if (dos > 0) {
            dos = dos * 2;
        }

        total = quiniento + dosciento + cien + cincuenta + veinte + diez + cinco + dos + uno;

        transacciones = getSaldo();
        setSaldo(transacciones + total);

        System.out.println("Se Depositaron " + deposito);
        /*int[] billetes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] desglose = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < billetes.length; i++) {
            if (deposito >= billetes[i]) {
                desglose[i] = (deposito / billetes[i]);
                deposito = deposito - (desglose[i] * billetes[i]);
            }
        }

        System.out.println("    ***Desglose***    ");
        for (int i = 0; i < billetes.length; i++) {
            if (desglose[i] > 0) {
                if (billetes[i] > 0) {
                    System.out.println(" Billetes de " + billetes[i] + " LPS: " + desglose[i]);
                }
            }
        }*/
        System.out.println("-------------------------------");
        System.out.println(" Saldo actual es: " + getSaldo());
        System.out.println("-------------------------------");

    }
}
