package cambioMonedaTest;

import ejercicio3.CambioMoneda;
import ejercicio3.Util;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class CambioMonedaTest {
        Util objetoMock = Mockito.mock(Util.class);

        @Test
        public void verify(){

            Mockito.when(objetoMock.obtenerTipoDeCambio("Dólares", "Bolivianos")).thenReturn(7);
            CambioMoneda cambioMoneda = new CambioMoneda(objetoMock);
            String expected = "La cantidad convertida fue : [700] Bolivianos";
            String actual = cambioMoneda.saveInNewMoney(100, "Dólares", "Bolivianos");
            Assertions.assertEquals(expected,actual,"ERROR");
            Mockito.verify(objetoMock).obtenerTipoDeCambio("Dólares", "Bolivianos");
        }

    @Test
    public void verifyWrong(){

        Mockito.when(objetoMock.obtenerTipoDeCambio("Euros", "Bolivianos")).thenReturn(7);
        CambioMoneda cambioMoneda = new CambioMoneda(objetoMock);
        String expected = "Cantidad incorrecta";
        String actual = cambioMoneda.saveInNewMoney(-100, "Euros", "Bolivianos");
        Assertions.assertEquals(expected,actual,"ERROR");
        //Mockito.verify(objetoMock).obtenerTipoDeCambio("Euros", "Bolivianos");
    }
    }

