package Bolsillo;

public class Nequi extends Bolsillo {

    private double Recarga;
    private double Retira;
    private double Saldo;

    public Nequi() {

    }

    public Nequi(double recarga, double retira, double saldo) {
        Recarga = recarga;
        Retira = retira;
        Saldo = saldo;
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

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double RecargarSaldo(){
        double Recargar=Saldo+Recarga;
        return Recargar;
    }

    @Override
    public double RetirarSaldo() {
        double Retirar=Saldo+Recarga;
        return Retirar;
    }

    @Override
    public double ConsultarSaldoo() {
        double Consultar=20000;
        return Consultar;
    }

}
