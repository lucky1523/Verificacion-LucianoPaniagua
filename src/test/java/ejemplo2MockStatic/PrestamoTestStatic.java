package ejemplo2MockStatic;

import ejemplo2Static.HistorialCredito;
import ejemplo2Static.Prestamo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class PrestamoTestStatic {


    @BeforeAll
    public static void before(){
        MockedStatic<HistorialCredito> mocked = Mockito.mockStatic(HistorialCredito.class);
        mocked.when(()->HistorialCredito.getCategoriaCrediticia(555555)).thenReturn("A");
        mocked.when(()->HistorialCredito.getCategoriaCrediticia(5555557)).thenReturn("B");
        mocked.when(()->HistorialCredito.getCategoriaCrediticia(1111)).thenReturn("C");
    }


    @Test
    public void verifyPrestamoA(){
        Prestamo prestamo = new Prestamo();
        Assertions.assertEquals("maximo a prestar 200000",
                prestamo.maximoPrestamo(555555),
                "error");
    }

    @Test
    public void verifyPrestamoB(){

        Prestamo prestamo = new Prestamo();
        Assertions.assertEquals("maximo a prestar 100000",
                prestamo.maximoPrestamo(5555557),
                "error");
    }

    @Test
    public void verifyPrestamoC(){

        Prestamo prestamo = new Prestamo();
        Assertions.assertEquals("no se puede prestar ningun monto",
                prestamo.maximoPrestamo(1111),
                "error");
    }
}
