import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arregloOriginal = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
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

            int metodo = getOpcionValida(scanner, "Ingrese la opción", 1, 5);

            if (metodo == 5) {
                System.out.println("¡Adiós!");
                break;
            }

            System.out.print("¿Desea ver los pasos? (true/false): ");
            boolean mostrarPasos = getBooleanValido(scanner, "\n--------------------------------");

            String orden = getValidString(scanner, new String[] { "A", "D" },
                    "¿Desea ordenar ascendentemente (A) o descendentemente (D)?");

            int[] copia = arregloOriginal.clone();
            int[] resultados = new int[2];
            boolean ascendente = orden.equalsIgnoreCase("A");

           switch (metodo) {
            case 1:
                System.out.println("\n[ Ordenamiento por Burbuja ]");
                if (ascendente) {
                    System.out.println("Iniciando ordenamiento ascendente con Burbuja...");
                    resultados = burbuja.ordenarAscendente(copia, mostrarPasos);
                } else {
                    System.out.println("Iniciando ordenamiento descendente con Burbuja...");
                    resultados = burbuja.ordenarDescendente(copia, mostrarPasos);
                }
                break;
            case 2:
                System.out.println("\n[ Ordenamiento por Selección ]");
                if (ascendente) {
                    System.out.println("Iniciando ordenamiento ascendente con Selección...");
                    resultados = seleccion.ordenarAscendente(copia, mostrarPasos);
                } else {
                    System.out.println("Iniciando ordenamiento descendente con Selección...");
                    resultados = seleccion.ordenarDescendente(copia, mostrarPasos);
                }
                break;
            case 3:
                System.out.println("\n[ Ordenamiento por Inserción ]");
                if (ascendente) {
                    System.out.println("Iniciando ordenamiento ascendente con Inserción...");
                    resultados = insercion.ordenarAscendente(copia, mostrarPasos);
                } else {
                    System.out.println("Iniciando ordenamiento descendente con Inserción...");
                    resultados = insercion.ordenarDescendente(copia, mostrarPasos);
                }
                break;
            case 4:
                System.out.println("\n[ Ordenamiento por Burbuja Mejorado ]");
                if (ascendente) {
                    System.out.println("Iniciando ordenamiento ascendente con Burbuja Mejorado...");
                    resultados = mbm.ordenarAscendente(copia, mostrarPasos);
                } else {
                    System.out.println("Iniciando ordenamiento descendente con Burbuja Mejorado...");
                    resultados = mbm.ordenarDescendente(copia, mostrarPasos);
                }
                break;
            default:
                resultados = new int[]{0, 0}; 
        }
            
            System.out.println("-- FIN DEL MÉTODO --");
            System.out.print("Arreglo ordenado -> ");
            printArray(copia);
            System.out.println("Comparaciones Totales -> " + resultados[0]);
            System.out.println("Cambios Totales -> " + resultados[1]);
        }

        scanner.close();
    }

    public static void printArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static String getValidString(Scanner scanner, String[] opciones, String mensaje) {
        String input;
        boolean valido;
        do {
            System.out.println(mensaje);
            input = scanner.next();
            valido = false;
            for (String opcion : opciones) {
                if (input.equalsIgnoreCase(opcion)) {
                    valido = true;
                    break;
                }
            }
        } while (!valido);
        return input;
    }

    public static int getOpcionValida(Scanner scanner, String mensaje, int min, int max) {
        int input;
        do {
            System.out.print(mensaje + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Intente nuevamente: ");
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input < min || input > max);
        return input;
    }
    public static boolean getBooleanValido(Scanner scanner, String mensaje) {
        while (true) {
            scanner.nextLine();
    
            System.out.println(mensaje);
            System.out.println("Responde con precisión:");
            System.out.println("- Escribe 'true' para Sí");
            System.out.println("- Escribe 'false' para No");
            System.out.print("opcion: ");
    
            if (scanner.hasNextInt() || scanner.hasNextDouble()) {
                scanner.nextInt();
                
                System.out.println("\n[ERROR] ¡No se permiten números!");
                System.out.println("\n\tPor favor, responde solo con 'true' o 'false'.");
                System.out.println("\nsolo palabras, por favor.\n");
                
                scanner.nextLine();
                continue;
            }
    
            String input = scanner.nextLine().trim().toLowerCase();
    
            switch (input) {
                case "true":
                case "verdadero":
                case "sí":
                case "si":
                    return true;
                
                case "false":
                case "falso":
                case "no":
                    return false;
                
                default:
                    System.out.println("\n[ERROR]\n\tEntrada inválida.");
                    System.out.println("Por favor, escribe exactamente 'true' o 'false'.\n");
            }
        }
    }
}