package ejercicio2Test;

import ejercicio2.GenerateNumbers;
import ejercicio2.PrimoUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class NumbersTest {
    PrimoUtils primoMock = Mockito.mock(PrimoUtils.class);

    @Test
    public void generateNumbersTestNoPrimo(){
        Mockito.when(primoMock.esPrimo(12)).thenReturn(false);
        GenerateNumbers generateNumbers = new GenerateNumbers(primoMock);
        String actualResult = generateNumbers.getNumberValues(12);
        String expectedResult = "1 3 5 7 9 11 ";
        Assertions.assertEquals(actualResult,expectedResult,"Error");
        Mockito.verify(primoMock).esPrimo(12);

    }

    @Test
    public void generateNumbersTestPrimo(){
        Mockito.when(primoMock.esPrimo(11)).thenReturn(true);
        GenerateNumbers generateNumbers = new GenerateNumbers(primoMock);
        String actualResult = generateNumbers.getNumberValues(11);
        String expectedResult = "2 4 6 8 10 ";
        Assertions.assertEquals(actualResult,expectedResult,"Error");
        Mockito.verify(primoMock).esPrimo(11);
    }
}

