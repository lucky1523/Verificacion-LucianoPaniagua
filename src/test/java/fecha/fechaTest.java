package fecha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ejercicio1.DateUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;
public class fechaTest {

@ParameterizedTest
@CsvSource({
        "3,Enero,2004,4 Enero 2004",
        "29,Mayo,2005,30 Mayo 2005",
        "29,Julio,2005,30 Julio 2005",
        "29,Agosto,2005,30 Agosto 2005",
        "29,Octubre,2005,30 Octubre 2005",
        "29,Diciembre,2005,30 Diciembre 2005",
        "2,Febrero,2004,3 Febrero 2004",
        "28,Febrero,2006,1 Marzo 2006",
        "28,Febrero,2004,29 Febrero 2004",
        "5,Agosto,2100,6 Agosto 2100",
        "31,Enero,2005,1 Febrero 2005",
        "29,Febrero,2005,Invalid Day : 29",
        "29,Febrero,2,Invalid Day : 29",
        "28,Febrero,2020,29 Febrero 2020",
        "28,Febrero,2001,1 Marzo 2001",
        "64,Enero,2004,Invalid Day : 64",
        "8,Enero,32004,9 Enero 32004",
        "8,Abril,2004,9 Abril 2004",
        "8,Junio,2004,9 Junio 2004",
        "8,Julio,2004,9 Julio 2004",
        "8,Agosto,2004,9 Agosto 2004",
        "8,Septiembre,2004,9 Septiembre 2004",
        "8,Octubre,2004,9 Octubre 2004",
        "8,Noviembre,2004,9 Noviembre 2004",
        "8,Diciembre,2004,9 Diciembre 2004",
        "31,Diciembre,2004,1 Enero 2005",
        "31,ssadsda,2004,Invalid Month : ssadsda",
        "65,Febrero,300212,Invalid Day : 65",
        "1,Enero,2004,2 Enero 2004",
        "32,Diciembre,2020 ,Invalid Day : 32",
        "-2,Diciembre,2004,Invalid Day : -2",
        "5,Octubre,1,6 Octubre 1",
        "0,Diciembre,2004,Invalid Day : 0",
        "1000,Diciembre,2004,Invalid Day : 1000",
        "5,Julio,5,6 Julio 5",
        "2,Enero,1000,3 Enero 1000",
        "31,Diciembre,-1,Invalid Year : -1",
        "8,Hola,2004,Invalid Month : Hola",
        "1, Agosto, 2006, 2 Agosto 2006",
        "8, Enero, 1978, 9 Enero 1978",
        "8, Febrero, 1978, 9 Febrero 1978",
        "8, Marzo, 1978, 9 Marzo 1978",
        "8, Abril, 1978, 9 Abril 1978",
        "8, Mayo, 1978, 9 Mayo 1978",
        "8, Junio, 1978, 9 Junio 1978",
        "8, Julio, 1978, 9 Julio 1978",
        "8, Agosto, 1978, 9 Agosto 1978",
        "8, Septiembre, 1978, 9 Septiembre 1978",
        "8, Octubre, 1978, 9 Octubre 1978",
        "8, Noviembre, 1978, 9 Noviembre 1978",
        "8, Diciembre, 1978, 9 Diciembre 1978",
        "10, Junio, 2000, 11 Junio 2000",
        "22, Diciembre, 1975, 23 Diciembre 1975",
        "19, Marzo, 2012, 20 Marzo 2012",
        "28, Febrero, 2019, 1 Marzo 2019",
        "29, Febrero, 2000, 1 Marzo 2000",
        "27, Febrero, 2000, 28 Febrero 2000",
        "27, Febrero, 1000, 28 Febrero 1000",
        "31, Enero, 1900, 1 Febrero 1900",
        "31, Marzo, 1900, 1 Abril 1900",
        "30, Abril, 1900, 1 Mayo 1900",
        "29, Abril, 1900, 30 Abril 1900",
        "30, Febrero, 1900, Invalid Day : 30",
        "31, Febrero, 1900, Invalid Day : 31",
        "29, Junio, 1900, 30 Junio 1900",
        "29, Septiembre, 1900, 30 Septiembre 1900",
        "29, Noviembre, 1900, 30 Noviembre 1900",
        "31, Mayo, 1900, 1 Junio 1900",
        "30, Junio, 1900, 1 Julio 1900",
        "31, Julio, 1900, 1 Agosto 1900",
        "31, Agosto, 1900, 1 Septiembre 1900",
        "30, Septiembre, 1900, 1 Octubre 1900",
        "31, Octubre, 1900, 1 Noviembre 1900",
        "30, Noviembre, 1900, 1 Diciembre 1900",
        "31, Diciembre, 1900, 1 Enero 1901",
        "31, Diciembre, 1900, 1 Enero 1901",

        /*Incorrect Day*/
        "-1, Enero, 2000,Invalid Day : -1",
        "29, Febrero, 2006,Invalid Day : 29",
        "33, Marzo, 2001, Invalid Day : 33",
        "0, Marzo, 2001,Invalid Day : 0",

        /*Incorrect Month*/
        "10, January, 2000, Invalid Month : January",
        "1, June, 2015, Invalid Month : June",
        "14, maoy, 1964, Invalid Month : maoy",
        "1, HelloWorld, 1999,Invalid Month : HelloWorld",

        /*Incorrect Year*/
        "28, Marzo, -3, Invalid Year : -3",
        "11, Abril, 0, Invalid Year : 0",
        "3, Octubre, -11, Invalid Year : -11",
        "11, Noviembre, -100, Invalid Year : -100",

        /*More Than One Incorrect Info*/
        "-1 , marzo, -3,Invalid Day : -1",
        "11, HelloWorld, -1, Invalid Month : HelloWorld",
        "-1, HelloWorld, 11, Invalid Day : -1",
        "-11, HelloWorld, -100, Invalid Day : -11",

})

    public void dateUtilsTest(int dia, String mes, int anio, String expectedResult){
        DateUtils nextDate = new DateUtils();
        String actualResult = nextDate.nextDate(dia, mes, anio);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR!!!");
    }


}