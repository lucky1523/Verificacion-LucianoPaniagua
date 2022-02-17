package mockTest;

import ejemploMock.CalculadoraMock;
import ejemploMock.MultiplicarServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class CalculadoraMockTest {
    MultiplicarServicio servicioMock = Mockito.mock(MultiplicarServicio.class);




    @Test
    public void verifyFactorial(){
        //PASO 3 CREAR EL METODO Y SU COMPORTAMIENTO
        Mockito.when(servicioMock.multi(1,1)).thenReturn(1);
        Mockito.when(servicioMock.multi(1,2)).thenReturn(2);
        Mockito.when(servicioMock.multi(2,3)).thenReturn(6);

        //PASO 4 ENVIAR EL OBJETO MOCKEADO EN EL CONSTRUCTOR
        CalculadoraMock calculadoraMock = new CalculadoraMock(servicioMock);
        int expectedResult=6;
        int actualResult=calculadoraMock.getFactorial(3);
        Assertions.assertEquals(expectedResult,actualResult,"Error");

        //VERIFICACION MOCKS
    }
}


