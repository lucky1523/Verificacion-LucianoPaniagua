package ejemplo2;

import java.util.HashMap;
import java.util.Map;

public class Prestamo {
    HistorialCredito  historialCredito;
    public Prestamo(){
        HistorialCredito  historialCredito = new HistorialCredito();
    }


    //**********PASO 1
    public Prestamo(HistorialCredito objetoMockeado){
        historialCredito = objetoMockeado;
    }

    //TESTEAMOS ESTE METODO
    public String maximoPrestamo(int ci){
        Map<String,String> maximo = new HashMap<>();
        maximo.put("A","maximo a prestar 200000");
        maximo.put("B","maximo a prestar 100000");
        maximo.put("C","no se puede prestar ningun monto");
        String categoria =historialCredito.getCategoriaCrediticia(ci);
        return maximo.get(categoria);
    }
}
