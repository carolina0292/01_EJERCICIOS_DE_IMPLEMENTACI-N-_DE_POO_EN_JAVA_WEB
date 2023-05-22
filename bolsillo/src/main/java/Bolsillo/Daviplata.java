package Bolsillo;

public class Daviplata extends Bolsillo {

    private double Recarga;
    private double Retira;
    private double Saldo = 0;

    public Daviplata() {

    }

    public Daviplata(double recarga) {
        Recarga = recarga;
    }

    public double getRecarga() {
        return Recarga;
    }

    public void setRecarga(double recarga) {
        Recarga = recarga;
    }

    public double getRetira() {
        return Retira;
    }

    public void setRetira(double retira) {
        Retira = retira;
    }

    public double RecargarSaldo() {
        double Recargar = Saldo + Recarga;
        return Recargar;
    }

    public double RetirarSaldo() {
        double Retirar = Saldo - Recarga;
        return Retirar;
    }

    public double ConsultarSaldoo() {
        double Consultar = 10000;
        return Consultar;
    }

}
