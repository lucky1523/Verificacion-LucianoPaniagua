package ejercicio2;

import ejemplo2.HistorialCredito;

public class GenerateNumbers {

    PrimoUtils primo = new PrimoUtils();

    public GenerateNumbers(PrimoUtils objetoMockeado){
        primo = objetoMockeado;
    }
   // public GenerateNumbers(){}

    public String getNumberValues(int input){
        String numeros="";
        if (primo.esPrimo(input)){
            for(int i = 1; i < input; i++){
                if (i%2==0) {
                    numeros = numeros + i + " ";
                }
            }
        } else if (!primo.esPrimo(input)){
            for(int i = 1; i < input; i++){
                if (i%2!=0) {
                    numeros = numeros + i + " ";
                }
            }
        }
        //System.out.println(numeros);
        return numeros;
    }
}
