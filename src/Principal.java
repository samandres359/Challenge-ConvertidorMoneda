import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Mensajes mensaje = new Mensajes();
        GeneradorAPI generadorAPI = new GeneradorAPI();
        Calculos calculo = new Calculos();
        List<String> tipoCalculo = new ArrayList<>();
        boolean salir = true;

        do {
            int opcionUsuario = mensaje.Menu();
            boolean validacionMenu = mensaje.validacionMenu(opcionUsuario);
            if (validacionMenu) {

                tipoCalculo = calculo.tipoCalculo(opcionUsuario);
                String tipoValorBase = tipoCalculo.get(0);
                String tipoValorAConvertir = tipoCalculo.get(1);

                Moneda respuestaApi = generadorAPI.buscaMoneda(tipoValorBase);

                double valorTipoBase = respuestaApi.getConversionRate(tipoValorBase);
                double valorTipoAConvertir = respuestaApi.getConversionRate(tipoValorAConvertir);

                double valorConvertir = mensaje.LeerValor();
                double totalConversion = valorConvertir * valorTipoAConvertir;

                mensaje.resultadoConversion(tipoValorBase, totalConversion, tipoValorAConvertir, valorConvertir);
            }else{
                salir = false;
            }
        } while (salir);
    }
}