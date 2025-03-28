public class MetodoBurbuja {

    public int[] ordenarAscendente(int[] arreglo, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                comparaciones++;

                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambios++;

                    if (mostrarPasos) {
                        printArray(arreglo);
                    }
                }
            }
        }

        return new int[]{comparaciones, cambios};
    }

    public int[] ordenarDescendente(int[] arreglo, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                comparaciones++;

                if (arreglo[j] < arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambios++;

                    if (mostrarPasos) {
                        printArray(arreglo);
                    }
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
