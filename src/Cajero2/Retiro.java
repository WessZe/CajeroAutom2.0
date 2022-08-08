package Cajero2;

public class Retiro extends Operaciones {

    @Override
    public void Transaccion() {

        System.out.print("Bienvenidos Ingrese la cantidad a retirar: ");
        Retiro();
        int minpermitido = 100;
        int maxpermitido = 5000;

        if (retiro >= minpermitido && retiro <= maxpermitido) {

            if (retiro <= getSaldo()) {
                transacciones = getSaldo();
                setSaldo(transacciones - retiro);

                System.out.println("Se retiraron " + retiro);
                int[] billetes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
                int[] desglose = {0, 0, 0, 0, 0, 0, 0, 0, 0};

                for (int i = 0; i < billetes.length; i++) {
                    if (retiro >= billetes[i]) {
                        desglose[i] = (retiro / billetes[i]);
                        retiro = retiro - (desglose[i] * billetes[i]);
                    }
                }

                System.out.println("    ***Desglose***    ");
                for (int i = 0; i < billetes.length; i++) {
                    if (desglose[i] > 0) {
                        if (billetes[i] > 0) {
                            System.out.println(" Billetes de " + billetes[i] + " LPS: " + desglose[i]);
                        }
                    }
                }
                System.out.println("-------------------------------");
                System.out.println(" Saldo actual es: " + getSaldo());
                System.out.println("-------------------------------");
            } else {
                System.out.println("------------------");
                System.out.println("Saldo Insuficiente");
                System.out.println("------------------");
            }
        } else {
            System.out.println("***************");
            System.out.println("Transaccion no disponible");
            System.out.println("Favor Ingresar una cantidad dentro de los limites de este Sistema 100 a 5,000 Lps");
            System.out.println("***************");
        }
    }
}
