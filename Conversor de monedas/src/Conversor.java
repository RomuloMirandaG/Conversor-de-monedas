import java.io.IOException;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        try {
            ConsultaCambio consultaCambio = new ConsultaCambio();
            Cambio cambio = consultaCambio.obtenerCambio();
            Conversion conversion = new Conversion(cambio);

            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;

            while (continuar) {
                System.out.println("Seleccione el tipo de conversión que desea realizar:");
                System.out.println("1. Quetzal GT a Dollar Estadounidense");
                System.out.println("2. Dollar Estadounidense a Quetzal GT");
                System.out.println("3. Peso Mexicano a Dollar Estadounidense");
                System.out.println("4. Dollar Estadounidense a Peso Mexicano");
                System.out.println("5. Salir de la aplicación");

                int opcion = scanner.nextInt();
                double cantidad, resultado;

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la cantidad de Quetzales: ");
                        cantidad = scanner.nextDouble();
                        resultado = conversion.convertir(cantidad, "quetzal", "dollar");
                        System.out.println(cantidad + " Quetzales son " + resultado + " Dólares.");
                        break;

                    case 2:
                        System.out.print("Ingrese la cantidad de Dólares: ");
                        cantidad = scanner.nextDouble();
                        resultado = conversion.convertir(cantidad, "dollar", "quetzal");
                        System.out.println(cantidad + " Dólares son " + resultado + " Quetzales.");
                        break;

                    case 3:
                        System.out.print("Ingrese la cantidad de Pesos: ");
                        cantidad = scanner.nextDouble();
                        resultado = conversion.convertir(cantidad, "peso", "dollar");
                        System.out.println(cantidad + " Pesos son " + resultado + " Dólares.");
                        break;

                    case 4:
                        System.out.print("Ingrese la cantidad de Dólares: ");
                        cantidad = scanner.nextDouble();
                        resultado = conversion.convertir(cantidad, "dollar", "peso");
                        System.out.println(cantidad + " Dólares son " + resultado + " Pesos.");
                        break;

                    case 5:
                        continuar = false;
                        System.out.println("Saliendo de la aplicación.");
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 5.");
                }
            }

            scanner.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
