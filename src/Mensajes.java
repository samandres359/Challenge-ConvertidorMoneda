import java.util.Scanner;

public class Mensajes {

    public int Menu(){
        String menu = """
                
                Sea Bienvenido/a al Conversor de Moneda =]
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real Brasileño
                4) Real Brasileño =>> Dólar
                5) Dólar =>> Peso Colombiano
                6) Peso Colombiano =>> Dólar
                7) Salir
                Elija una opción válida:
                
                ***************************************************************
                """;
        Scanner lectura = new Scanner(System.in);
        System.out.println(menu);
        return lectura.nextInt();
    }

    public double LeerValor(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir");
        return lectura.nextDouble();
    }

    public void resultadoConversion(String tipoValorBase, double valorFinal, String tipoValorconvertir, double monto){
        System.out.println("El valor " + monto + "[" + tipoValorBase + "] corresponde al valor final de =>> " + valorFinal + " [" + tipoValorconvertir + "]");
    }

    public boolean validacionMenu(int valorMenu){
        if (valorMenu > 0 && valorMenu <= 7) {
            if (valorMenu == 7) {
                System.out.println("Proceso finalizado!, Adios.");
                return false;
            }else{
                return true;
            }
        }else{
            System.out.println("Error!: La opcion elegida no existe dentro del menu");
            return false;
        }
    }

}
