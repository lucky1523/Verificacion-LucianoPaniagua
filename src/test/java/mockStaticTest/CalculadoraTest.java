package mockStaticTest;

import ejemploMock.CalculadoraMock;
import ejemploMockEstatico.CalculadoraMockStatic;
import ejemploMockEstatico.MultiplicarServicioStatic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CalculadoraTest {
    @Test
    public void verifyFactorialStatic(){
        MockedStatic<MultiplicarServicioStatic> objetoMock = Mockito.mockStatic(MultiplicarServicioStatic.class);
        objetoMock.when(() ->MultiplicarServicioStatic.multi(1,1)).thenReturn(1);
        objetoMock.when(() ->MultiplicarServicioStatic.multi(1,2)).thenReturn(2);
        objetoMock.when(() ->MultiplicarServicioStatic.multi(2,3)).thenReturn(6);
        objetoMock.when(() ->MultiplicarServicioStatic.multi(6,4)).thenReturn(24);

        CalculadoraMockStatic calculadoraMockStatic = new CalculadoraMockStatic();

        int expectedResult=24;
        int actual = calculadoraMockStatic.getFactorial(4);
        Assertions.assertEquals(expectedResult,actual,"error");
    }
}
