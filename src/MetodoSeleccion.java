public class MetodoSeleccion {

    public int[] ordenarAscendente(int[] arreglo, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
                cambios++;

                if (mostrarPasos) {
                    printArray(arreglo);
                }
            }
        }

        return new int[]{comparaciones, cambios};
    }

    public int[] ordenarDescendente(int[] arreglo, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                if (arreglo[j] > arreglo[max]) {
                    max = j;
                }
            }

            if (max != i) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
                cambios++;

                if (mostrarPasos) {
                    printArray(arreglo);
                }
            }
        }

        return new int[]{comparaciones, cambios};
    }

    protected void printArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
