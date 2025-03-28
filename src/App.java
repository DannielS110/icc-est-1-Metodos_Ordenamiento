import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arregloOriginal = { 10, 9, 21, 5, 15, 2, -1, 0 };
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        MetodoBurbuja burbuja = new MetodoBurbuja();
        MetodoSeleccion seleccion = new MetodoSeleccion();
        MetodoInsercion insercion = new MetodoInsercion();
        MetodoBurbujaMejorado mbm = new MetodoBurbujaMejorado();

        while (continuar) {
            System.out.println("\n=== Métodos de Ordenamiento ===");
            System.out.println("1 -> Burbuja");
            System.out.println("2 -> Selección");
            System.out.println("3 -> Inserción");
            System.out.println("4 -> Burbuja Mejorado");
            System.out.println("5 -> Salir");

            // int metodo = scanner.nextInt();
            int metodo = getPositive(scanner,"ingrese la opccion ");

            if (metodo == 5) {
                System.out.println("¡Adiós!");
                continuar = false;
                break;
            }

            System.out.print("¿Desea ver los pasos? (true/false): ");
            boolean conPasos = scanner.nextBoolean();

            System.out.print("");
            String orden = getValidString(scanner, new String[]{"A","D"},"Desea ordenar ascendentemente (A) o descendentemente (D)?:" );
            int[] copia = arregloOriginal.clone();
            int[] resultados;

            switch (metodo) {
                case 1:
                    System.out.println("\nMétodo Burbuja");
                    resultados = (orden.equalsIgnoreCase("A"))
                    ?burbuja.ordenarAscendente(arregloOriginal, conPasos)
                    :burbuja.ordenarDescendente(arregloOriginal, conPasos);
                    break;

                case 2:
                    System.out.println("\nMétodo Selección");
                    resultados = (orden.equalsIgnoreCase("A"))
                    ?burbuja.ordenarAscendente(arregloOriginal, conPasos)
                    :burbuja.ordenarAscendente(arregloOriginal, conPasos);
                    break;

                case 3:
                    System.out.println("\nMétodo Inserción");
                    resultados = (orden.equalsIgnoreCase("A"))
                    ?burbuja.ordenarAscendente(arregloOriginal, conPasos)
                    :burbuja.ordenarAscendente(arregloOriginal, conPasos);
                    break;
                    

                case 4:
                    System.out.println("\nMétodo Burbuja Mejorado");
                    resultados = (orden.equalsIgnoreCase("A"))
                    ?burbuja.ordenarAscendente(arregloOriginal, conPasos)
                    :burbuja.ordenarAscendente(arregloOriginal, conPasos);
                    break;
                    

                default:
                    System.out.println("Opción inválida.");
                    continue;
            }

            System.out.println("Arreglo ordenado:");
            printArray(copia);
            System.out.println("Comparaciones -> " + resultados[0]);
            System.out.println("Cambios -> " + resultados[1]);
        }

        scanner.close();
    }

    public static void printArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static String getValidString(Scanner scanner, String[] posibles, String message) {
        String input;
        boolean valido;

        do {
            System.out.println(message + ":");
            input = scanner.next();
            valido = false;
            for (String posible : posibles) {
                if (input.equalsIgnoreCase(posible)) {
                    valido = true;
                    break;
                }
            }
        } while (!valido);
        return input;
    }

    /*
     * // Método Burbuja
     * System.out.println("----- Método Burbuja -----");
     * int[] arregloBurbuja = arregloOriginal.clone();
     * System.out.println("Arreglo Original:");
     * printArray(arregloBurbuja);
     * MetodoBurbuja burbuja = new MetodoBurbuja();
     * burbuja.ordenarAscendente(arregloBurbuja);
     * System.out.println("Arreglo Ordenado ascendente:");
     * printArray(arregloBurbuja);
     * 
     * // Método Selección
     * System.out.println("\n----- Método Selección -----");
     * int[] arregloSeleccion = arregloOriginal.clone();
     * System.out.println("Arreglo Original:");
     * printArray(arregloSeleccion);
     * MetodoSeleccion seleccion = new MetodoSeleccion();
     * seleccion.ordenarDescendente(arregloSeleccion);
     * System.out.println("Arreglo Ordenado descendente:");
     * printArray(arregloSeleccion);
     * 
     * // Método Inserción
     * System.out.println("\n----- Método Inserción -----");
     * int[] arregloInsercion = arregloOriginal.clone();
     * System.out.println("Arreglo Original:");
     * printArray(arregloInsercion);
     * MetodoInsercion insercion = new MetodoInsercion();
     * System.out.println("Arreglo Ordenado Con Pasos");
     * insercion.ordenascendente(arregloInsercion, true);
     * }
     * 
     * public static void printArray(int[] arreglo) {
     * for (int num : arreglo) {
     * System.out.print(num + " ");
     * }
     * System.out.println();
     * }
     */

    /*
     * MetodoBurbujaMejorado Mbm = new MetodoBurbujaMejorado();
     * int resultadoComparaciones;
     * 
     * Mbm.printArray(arregloOriginal);
     * Mbm.ordenarAscendente(arregloOriginal);
     * resultadoComparaciones = Mbm.ordenarAscendente(arregloOriginal)
     * Mbm.printArray(arregloOriginal);
     * System.out.println("comparaciones -> "+ resultadoComparaciones);
     */

    public static int getPositive(Scanner scanner, String message) {
        int input;

        do {
            System.out.println(message + ":");
            input = scanner.nextInt();
            if (input <= 0) {
                System.out.println("el numero debe ser positivo" + "intente nuevamente");
            }
        } while (input <= 0);

        return input;
    }

}
