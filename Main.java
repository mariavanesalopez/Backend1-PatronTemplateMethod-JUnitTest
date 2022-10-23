package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Liquidacion de haber mensual");
        System.out.println("------------------------------------");
        LiquidacionSueldo emi= new EmpleadoEfectivo("Emiliano","Lopez",1234,1000,100,700);
       double resultado1= emi.calcularSueldo();
        System.out.println("La liquidacion de sueldo de"+" "+ emi.getNombre()+" "+ emi.getApellido() +" es:"+  "  $"+resultado1);
        emi.generarRecibo();
        emi.depositarSueldo();
        System.out.println("------------------------------------");
        LiquidacionSueldo juan= new EmpleadoContratado("Juan","Perez",5678,8,300);
        System.out.println("La liquidacion de sueldo de"+" "+ juan.getNombre()+" "+ juan.getApellido() +" es:"+  "  $"+juan.calcularSueldo());
        juan.generarRecibo();
        juan.depositarSueldo();
    }
}
