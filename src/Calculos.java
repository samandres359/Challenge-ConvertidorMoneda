import java.util.ArrayList;
import java.util.List;

public class Calculos {

    private String monedaBase;
    private String monedaConvertir;
    Mensajes mensaje = new Mensajes();

    public ArrayList<String> tipoCalculo(int leerOpcion) {

        ArrayList<String> listaTipoCalculo = new ArrayList<>();

        switch (leerOpcion){
            case 1:
                monedaBase = "USD";
                monedaConvertir = "ARS";
                break;
            case 2:
                monedaBase = "ARS";
                monedaConvertir = "USD";
                break;
            case 3:
                monedaBase = "USD";
                monedaConvertir = "BRL";
                break;
            case 4:
                monedaBase = "BRL";
                monedaConvertir = "USD";
                break;
            case 5:
                monedaBase = "USD";
                monedaConvertir = "COP";
                break;
            case 6:
                monedaBase = "COP";
                monedaConvertir = "USD";
                break;
        }
        listaTipoCalculo.add(monedaBase);
        listaTipoCalculo.add(monedaConvertir);

        return listaTipoCalculo;
    }


}
