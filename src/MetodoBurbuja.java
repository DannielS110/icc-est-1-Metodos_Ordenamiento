class MetodoBurbuja {
    public int[] ordenarAscendente(int[] arreglo, boolean pasos) {
        int comparaciones = 0;
        int cambios = 0;
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| INICIO DEL ALGORITMO DE BURBUJA - ORDEN ASCENDENTE       |");
            System.out.println("------------------------------------------------------------");
            System.out.print("| Arreglo original -> ");
            printArray(arreglo);
            System.out.println("------------------------------------------------------------\n");
        }
        
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (pasos) {
                System.out.println("\n>> Pasada " + (i+1) + " - Buscando el elemento mayor");
                System.out.println("   " + String.join("", "-".repeat(50)));
            }
            
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                comparaciones++;
                
                if (pasos) {
                    System.out.println("   Comparacion " + comparaciones + ": " + arreglo[j] + " y " + arreglo[j + 1]);
                }
                
                if (arreglo[j] > arreglo[j + 1]) {
                    if (pasos) {
                        System.out.println("   Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                    }
                    
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambios++;
                    
                    if (pasos) {
                        System.out.print("   Estado actual -> ");
                        printArray(arreglo);
                    }
                } else if (pasos) {
                    System.out.println("   No hay intercambio (ya está ordenado)");
                }
            }
            
            if (pasos) {
                System.out.println("   " + String.join("", "-".repeat(50)));
                System.out.println("   Elemento " + arreglo[arreglo.length - 1 - i] + " fijado en la posicion " + (arreglo.length - 1 - i));
            }
        }
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| FIN DEL ALGORITMO DE BURBUJA                            |");
            System.out.println("| Comparaciones: " + String.format("%-12d", comparaciones) + "Cambios: " + cambios);
            System.out.println("------------------------------------------------------------");
        }
        
        return new int[] { comparaciones, cambios };
    }
    
    public int[] ordenarDescendente(int[] arreglo, boolean pasos) {
        int comparaciones = 0;
        int cambios = 0;
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| INICIO DEL ALGORITMO DE BURBUJA - ORDEN DESCENDENTE      |");
            System.out.println("------------------------------------------------------------");
            System.out.print("| Arreglo original -> ");
            printArray(arreglo);
            System.out.println("------------------------------------------------------------\n");
        }
        
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (pasos) {
                System.out.println("\n>> Pasada " + (i+1) + " - Buscando el elemento menor");
                System.out.println("   " + String.join("", "-".repeat(50)));
            }
            
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                comparaciones++;
                
                if (pasos) {
                    System.out.println("   Comparacion " + comparaciones + ": " + arreglo[j] + " y " + arreglo[j + 1]);
                }
                
                if (arreglo[j] < arreglo[j + 1]) {
                    if (pasos) {
                        System.out.println("   Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                    }
                    
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambios++;
                    
                    if (pasos) {
                        System.out.print("   Estado actual -> ");
                        printArray(arreglo);
                    }
                } else if (pasos) {
                    System.out.println("   No hay intercambio (ya está ordenado)");
                }
            }
            
            if (pasos) {
                System.out.println("   " + String.join("", "-".repeat(50)));
                System.out.println("   Elemento " + arreglo[arreglo.length - 1 - i] + " fijado en la posicion " + (arreglo.length - 1 - i));
            }
        }
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| FIN DEL ALGORITMO DE BURBUJA                            |");
            System.out.println("| Comparaciones: " + String.format("%-12d", comparaciones) + "Cambios: " + cambios);
            System.out.println("------------------------------------------------------------");
        }
        
        return new int[] { comparaciones, cambios };
    }
    
    private void printArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
