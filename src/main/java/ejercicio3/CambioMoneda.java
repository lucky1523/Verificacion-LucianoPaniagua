package ejercicio3;

public class CambioMoneda {

        private Util util = new Util();
        private String message;
        public CambioMoneda(){}

        public CambioMoneda(Util utilMock){
            util = utilMock;
        }

        public String saveInNewMoney(int amount, String monedaOriginal, String monedaDestino){
            if (amount> 0){
                message="La cantidad convertida fue : ["+(amount*util.obtenerTipoDeCambio(monedaOriginal,monedaDestino))+"] "+monedaDestino;
            }else{
                message="Cantidad incorrecta";
            }
            return message;
        }
    }

