package main;

public class EmpleadoContratado extends LiquidacionSueldo{
    private int cantidadDeHorasTrabajadas;
    private int valorHora;

    public EmpleadoContratado(String nombre, String apellido, int numeroCuenta, int cantidadDeHorasTrabajadas, int valorHora) {
        super(nombre, apellido, numeroCuenta);
        this.cantidadDeHorasTrabajadas = cantidadDeHorasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    double calcularSueldo() {
        return cantidadDeHorasTrabajadas*valorHora;
    }

    @Override
    void generarRecibo() {
        System.out.println("La liquidacion generada es un documento impreso. Saldo a liquidar: "+this.calcularSueldo());
    }
}
