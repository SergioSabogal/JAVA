package org.ssabogal.udemy.hilos.retos.banco;

public class CuentaBancaria {
    private int idCuenta;
    private Integer saldo;
    private boolean disponible;

    public CuentaBancaria(int idCuenta, Integer saldo) {
        this.idCuenta = idCuenta;
        this.saldo = saldo;
    }



    public synchronized void depositar(int valor) throws InterruptedException {
        this.saldo += valor;
        toString();
        notifyAll();
    }


    public synchronized  String sacar(int valor) throws InterruptedException {
        while (!disponible){
            wait();
        }
        disponible = false;
        if(this.saldo >= valor) {
            this.saldo -= valor;
            wait(100);
            disponible = true;
            notifyAll();
            return "Transferencia realizada con exito ✔";
        }else {
            wait(100);
            disponible = true;
            notifyAll();
            return"Saldo insuficiente...❌";
        }

    }

    @Override
    public String toString() {
        return "CuentaBancaria: " + idCuenta +
                "\nSaldo: " + saldo;
    }
}
