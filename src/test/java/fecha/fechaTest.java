package fecha;

import ejercicio1.DateUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;


@RunWith(value= Parameterized.class)
public class fechaTest {
    private int dia;
    private String mes;
    private int anio;
    private String result;

    public void fechaTest(int dia, String mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]>objects= new ArrayList<>();
        objects.add(new Object[]{1, "Enero", 2020});
        objects.add(new Object[]{1, "Febrero", 2020});
        objects.add(new Object[]{1, "Marzo", 2020});
        objects.add(new Object[]{1, "Abril", 2020});
        objects.add(new Object[]{1, "Mayo", 2020});
        objects.add(new Object[]{1, "Junio", 2020});
        objects.add(new Object[]{1, "Julio", 2020});
        objects.add(new Object[]{1, "Agosto", 2020});
        objects.add(new Object[]{1, "Septiembre", 2020});
        objects.add(new Object[]{1, "Octubre", 2020});
        objects.add(new Object[]{1, "Noviembre", 2020});
        objects.add(new Object[]{1, "Diciembre", 2020});

        objects.add(new Object[]{31, "Enero", 2020});
        objects.add(new Object[]{28, "Febrero", 2020});
        objects.add(new Object[]{29, "Febrero", 2020});
        objects.add(new Object[]{31, "Marzo", 2020});
        objects.add(new Object[]{30, "Abril", 2020});
        objects.add(new Object[]{31, "Mayo", 2020});
        objects.add(new Object[]{30, "Junio", 2020});
        objects.add(new Object[]{31, "Julio", 2020});
        objects.add(new Object[]{31, "Agosto", 2020});
        objects.add(new Object[]{30, "Septiembre", 2020});
        objects.add(new Object[]{31, "Octubre", 2020});
        objects.add(new Object[]{30, "Noviembre", 2020});
        objects.add(new Object[]{31, "Diciembre", 2020});

        return objects;
    }

    @Test
    public void verify_date_all_values(){
        DateUtils nextDate = new DateUtils();
        String actualResult = nextDate.nextDate(this.dia, this.mes, this.anio);
        Assert.assertEquals("Not what was expected", this.result, actualResult);
    }


}