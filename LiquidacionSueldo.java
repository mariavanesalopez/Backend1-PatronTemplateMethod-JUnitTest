package main;

public abstract class LiquidacionSueldo {
private String nombre;
private String apellido;
private int numeroCuenta;

    public LiquidacionSueldo(String nombre, String apellido, int numeroCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
    }

    final void liquidarSueldo(){
        calcularSueldo();
        generarRecibo();
        depositarSueldo();
    }

    abstract double calcularSueldo();
    abstract void generarRecibo();
    public void depositarSueldo(){
        System.out.println("Realizado deposito en Banco");

    }

  public String getNombre(){
        return nombre;
  }

  public String getApellido(){
    return apellido;
    }
}
