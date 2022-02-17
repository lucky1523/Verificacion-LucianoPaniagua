package ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class DateUtils {


            public String nextDate(int dia, String mes, int anio){
                String siguienteFecha;
                List<String> meses = new LinkedList<>();
                meses.add("Enero"); meses.add("Febrero"); meses.add("Marzo"); meses.add("Abril"); meses.add("Mayo"); meses.add("Junio"); meses.add("Julio"); meses.add("Agosto"); meses.add("Septiembre"); meses.add("Octubre"); meses.add("Noviembre"); meses.add("Diciembre");
                if (dia < 1 || dia > 31) {
                    siguienteFecha = "Invalid Day : " + dia;
                } else if (mes.equals("Febrero") && (dia == 30 || dia == 31)) {
                    siguienteFecha = "Invalid Day : " + dia;
                } else if (mes.equals("Febrero") && dia == 29 && anio % 4 != 0 && anio % 100 == 0) {
                    siguienteFecha = "Invalid Day : " + dia;
                } else if (dia == 31 && (mes.equals("Abril") || mes.equals("Junio") || mes.equals("Septiembre") || mes.equals("Noviembre"))) {
                    siguienteFecha = "Invalid day: " + dia;
                } else if (!meses.contains(mes)) {
                    siguienteFecha = "Invalid Month : " + mes;
                } else if (anio < 0) {
                    siguienteFecha = "Invalid Year : " + anio;
                } else if (dia < 28) {
                    int temp = dia + 1;
                    siguienteFecha = temp + " " + mes + " " + anio;
                } else if (dia == 28 && mes.equals("Febrero")) {
                    if (anio % 4 != 0) {
                        siguienteFecha = "1 Marzo " + anio;
                    } else {
                        siguienteFecha = "29 Febrero " + anio ;
                    }
                } else if (dia == 28) {
                    int temp = dia + 1;
                    siguienteFecha = temp + " " + mes + " " + anio;
                } else if (dia == 29 && mes.equals("Febrero")) {
                    siguienteFecha = "1 Marzo " + anio + " 0:0:0";
                } else if (dia == 29) {
                    int temp = dia + 1;
                    siguienteFecha = temp + " " + mes + " " + anio ;
                } else if (dia == 30 && (mes.equals("Abril") || mes.equals("Junio") || mes.equals("Septiembre") || mes.equals("Noviembre"))) {
                    int temp = 0;
                    for (int i = 0; i < meses.size(); i++) {
                        if (meses.get(i).equals(mes)) {
                            temp = i + 1;
                        }
                    }
                    siguienteFecha = "1 " + meses.get(temp) + " " + anio ;
                } else if (dia == 30) {
                    int temp = dia + 1;
                    siguienteFecha = temp + " " + mes + " " + anio ;
                } else if (dia == 31 && !mes.equals("Diciembre")) {
                    int temp = 0;
                    for (int i = 0; i < meses.size(); i++) {
                        if (meses.get(i).equals(mes)) {
                            temp = i + 1;
                        }
                    }
                    siguienteFecha = "1 " + meses.get(temp) + " " + anio ;
                } else {
                    int temp = anio + 1;
                    siguienteFecha = "1 Enero " + temp ;
                }
                System.out.println(siguienteFecha);
                return siguienteFecha;
            }
        }



