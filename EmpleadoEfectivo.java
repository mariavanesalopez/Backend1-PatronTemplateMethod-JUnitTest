package main;

public class EmpleadoEfectivo extends LiquidacionSueldo{
    private double sueldoBasico;
    private double descuento;
    private double premios;

    public EmpleadoEfectivo(String nombre, String apellido, int numeroCuenta, double sueldoBasico, double descuento, double premios) {
        super(nombre, apellido, numeroCuenta);
        this.sueldoBasico = sueldoBasico;
        this.descuento = descuento;
        this.premios = premios;
    }

    @Override
    double calcularSueldo() {
        return (sueldoBasico-descuento+premios);
    }

    @Override
    void generarRecibo() {
        System.out.println("La liquidacion generada es digital. Saldo a liquidar: "+" "+ this.calcularSueldo());
    }
}
