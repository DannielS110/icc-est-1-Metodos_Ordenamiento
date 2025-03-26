public class MetodoSeleccion {
    public void ordenarAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[iM]) {
                    iM = j;
                }
            }
            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }

    public void ordenarDescendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] > arreglo[iM]) {
                    iM = j;
                }
            }
            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }

    public void ordenar(int[] arreglo, boolean isDes) {
        if (isDes) {
            ordenarAscendente(arreglo);
        } else {
            ordenarDescendente(arreglo);
        }
    }

    public void printArray(int[] arreglo) {
        System.out.println("Arreglo Clase Selección");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}