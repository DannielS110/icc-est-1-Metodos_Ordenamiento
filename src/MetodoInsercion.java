class MetodoInsercion {
    public int[] ordenarAscendente(int[] arreglo, boolean pasos) {
        int comparaciones = 0, cambios = 0;
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| INICIO DEL ALGORITMO DE INSERCION - ORDEN ASCENDENTE     |");
            System.out.println("------------------------------------------------------------");
            System.out.print("| Arreglo original -> ");
            printArray(arreglo);
            System.out.println("------------------------------------------------------------\n");
        }
        
        for (int i = 1; i < arreglo.length; i++) {
            int actual = arreglo[i];
            int j = i - 1;
            
            boolean huboIntercambio = false;
            
            if (pasos) {
                System.out.println("\n>> Insertando el elemento: " + actual + " (posicion " + i + ")");
                System.out.println("   " + String.join("", "-".repeat(50)));
            }
            
            while (j >= 0) {
                comparaciones++;
                
                if (arreglo[j] > actual) {
                    if (pasos) {
                        System.out.println("   Comparacion " + comparaciones + ": " + arreglo[j] + " > " + actual);
                        System.out.println("   Intercambio: " + arreglo[j] + " <-> " + actual);
                    }
                    
                    arreglo[j + 1] = arreglo[j];
                    huboIntercambio = true;
                    cambios++;
                    j--;
                } else {
                    if (pasos) {
                        System.out.println("   Comparacion " + comparaciones + ": " + arreglo[j] + " <= " + actual);
                        System.out.println(" No hay intercambio");
                    }
                    break;
                }
            }
            
            arreglo[j + 1] = actual;
            
            if (pasos) {
                System.out.println("   " + String.join("", "-".repeat(50)));
                System.out.print("   Estado actual -> ");
                printArray(arreglo);
                
                if (i < arreglo.length - 1) {
                    System.out.println();
                }
            }
        }
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| FIN DEL ALGORITMO DE INSERCION                           |");
            System.out.println("| Comparaciones: " + String.format("%-12d", comparaciones) + "Cambios: " + cambios);
            System.out.println("------------------------------------------------------------");
        }
        
        return new int[] { comparaciones, cambios };
    }
    
    public int[] ordenarDescendente(int[] arreglo, boolean pasos) {
        int comparaciones = 0, cambios = 0;
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| INICIO DEL ALGORITMO DE INSERCION - ORDEN DESCENDENTE    |");
            System.out.println("------------------------------------------------------------");
            System.out.print("| Arreglo original -> ");
            printArray(arreglo);
            System.out.println("------------------------------------------------------------\n");
        }
        
        for (int i = 1; i < arreglo.length; i++) {
            int actual = arreglo[i];
            int j = i - 1;
            
            boolean huboIntercambio = false;
            
            if (pasos) {
                System.out.println("\n>> Insertando el elemento: " + actual + " (posicion " + i + ")");
                System.out.println("   " + String.join("", "-".repeat(50)));
            }
            
            while (j >= 0) {
                comparaciones++;
                
                if (arreglo[j] < actual) {
                    if (pasos) {
                        System.out.println("   Comparacion " + comparaciones + ": " + arreglo[j] + " < " + actual);
                        System.out.println("    Intercambio: " + arreglo[j] + " <-> " + actual);
                    }
                    
                    arreglo[j + 1] = arreglo[j];
                    huboIntercambio = true;
                    cambios++;
                    j--;
                } else {
                    if (pasos) {
                        System.out.println("   Comparacion " + comparaciones + ": " + arreglo[j] + " >= " + actual);
                        System.out.println("    No hay intercambio");
                    }
                    break;
                }
            }
            
            arreglo[j + 1] = actual;
            
            if (pasos) {
                System.out.println("   " + String.join("", "-".repeat(50)));
                System.out.print("   Estado actual -> ");
                printArray(arreglo);
                
                if (i < arreglo.length - 1) {
                    System.out.println();
                }
            }
        }
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| FIN DEL ALGORITMO DE INSERCION                           |");
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