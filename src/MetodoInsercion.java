public class MetodoInsercion {

    public int[] ordenarAscendente(int[] arreglo, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > aux) {
                comparaciones++;
                arreglo[j + 1] = arreglo[j];
                j--;
                cambios++;
                if (mostrarPasos) {
                    printArray(arreglo);
                }
            }

            arreglo[j + 1] = aux;
            if (mostrarPasos) {
                printArray(arreglo);
            }
        }

        return new int[]{comparaciones, cambios};
    }

    public int[] ordenarDescendente(int[] arreglo, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] < aux) {
                comparaciones++;
                arreglo[j + 1] = arreglo[j];
                j--;
                cambios++;
                if (mostrarPasos) {
                    printArray(arreglo);
                }
            }

            arreglo[j + 1] = aux;
            if (mostrarPasos) {
                printArray(arreglo);
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
