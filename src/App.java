public class App {
    public static void main(String[] args) {
        int[] arregloOriginal = {64, 25, 12, 22, 11};

        // Método Burbuja
        System.out.println("----- Método Burbuja -----");
        int[] arregloBurbuja = arregloOriginal.clone();
        System.out.println("Arreglo Original:");
        printArray(arregloBurbuja);
        MetodoBurbuja burbuja = new MetodoBurbuja();
        burbuja.ordenarAscendente(arregloBurbuja);
        System.out.println("Arreglo Ordenado ascendente:");
        printArray(arregloBurbuja);

        // Método Selección
        System.out.println("\n----- Método Selección -----");
        int[] arregloSeleccion = arregloOriginal.clone();
        System.out.println("Arreglo Original:");
        printArray(arregloSeleccion);
        MetodoSeleccion seleccion = new MetodoSeleccion();
        seleccion.ordenarDescendente(arregloSeleccion);
        System.out.println("Arreglo Ordenado descendente:");
        printArray(arregloSeleccion);

        // Método Inserción
        System.out.println("\n----- Método Inserción -----");
        int[] arregloInsercion = arregloOriginal.clone();
        System.out.println("Arreglo Original:");
        printArray(arregloInsercion);
        MetodoInsercion insercion = new MetodoInsercion();
        System.out.println("Arreglo Ordenado Con Pasos");
        insercion.ordenascendente(arregloInsercion, true);
    }

    public static void printArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}