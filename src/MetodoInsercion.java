public class MetodoInsercion {
    public void ordenascendente(int[] arreglo, boolean pasos) {
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }

            while (j >= 0 && arreglo[j] > aux) {
                if (pasos) {
                    System.out.println("Compara aux: " + aux + " con arreglo[" + j + "]: " + arreglo[j]);
                }

                arreglo[j + 1] = arreglo[j];

                if (pasos) {
                    imprimir(arreglo);
                    System.out.println("Mueve arreglo[" + j + "] a arreglo[" + (j + 1) + "]");
                }

                j--;
            }

            arreglo[j + 1] = aux;

            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j + 1));
                System.out.print("Estado actual ");
                imprimir(arreglo);
                System.out.println();
            }
        }
    }

    public void imprimir(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}