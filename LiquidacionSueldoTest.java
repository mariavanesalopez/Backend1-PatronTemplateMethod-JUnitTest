package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LiquidacionSueldoTest {
    @Test
    public void calcularSueldoEmpleadoEfectivoTrue(){
        //Given
        LiquidacionSueldo martin= new EmpleadoEfectivo("Martin", "Martinez",789, 400,40,60 );

        //When
       double actual= martin.calcularSueldo();
       double esperado= 420;
        //Then
        Assertions.assertEquals(esperado,actual,"correcto");
    }

}
