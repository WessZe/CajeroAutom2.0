package Cajero2;

public class consulta extends Operaciones {

    @Override
    public void Transaccion() {
        System.out.println("------------------------------------");
        System.out.println("El saldo actual es: " + getSaldo());
        System.out.println("------------------------------------");
    }

}
