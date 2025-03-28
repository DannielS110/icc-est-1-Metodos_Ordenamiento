public class MetodoBurbujaMejorado {

    public int[] ordenarAscendente(int[] arreglo, boolean mostrarPasos) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < tam - 1; i++) {
            boolean huboCambio = false;

            for (int j = 0; j < tam - 1 - i; j++) {
                contComparaciones++;

                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    contCambios++;
                    huboCambio = true;

                    if (mostrarPasos) {
                        System.out.print("Paso: ");
                        printArray(arreglo);
                    }
                }
            }

            if (!huboCambio) {
                break;
            }
        }

        int[] resultados = { contComparaciones, contCambios };
        return resultados;
    }

    public int[] ordenarDescendente(int[] arreglo, boolean mostrarPasos) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < tam - 1; i++) {
            boolean huboCambio = false;

            for (int j = 0; j < tam - 1 - i; j++) {
                contComparaciones++;

                if (arreglo[j] < arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    contCambios++;
                    huboCambio = true;

                    if (mostrarPasos) {
                        System.out.print("Paso: ");
                        printArray(arreglo);
                    }
                }
            }

            if (!huboCambio) {
                break;
            }
        }

        int[] resultados = { contComparaciones, contCambios };
        return resultados;
    }

    protected void printArray(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
