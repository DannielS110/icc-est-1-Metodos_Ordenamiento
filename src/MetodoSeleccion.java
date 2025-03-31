class MetodoSeleccion {
    public int[] ordenarAscendente(int[] arreglo, boolean pasos) {
        int comparaciones = 0, cambios = 0;
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| INICIO DEL ALGORITMO DE SELECCION - ORDEN ASCENDENTE     |");
            System.out.println("------------------------------------------------------------");
            System.out.print("| Arreglo original -> ");
            printArray(arreglo);
            System.out.println("------------------------------------------------------------\n");
        }
        
        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;
            
            if (pasos) {
                System.out.println("\n>> Pasada " + (i+1) + " - Buscando el elemento menor a partir de la posicion " + i);
                System.out.println("   " + String.join("", "-".repeat(50)));
                System.out.println("   Elemento actual: " + arreglo[i] + " en posicion " + i);
            }
            
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                
                if (pasos) {
                    System.out.println("   Comparacion " + comparaciones + ": " + arreglo[j] + " con " + arreglo[min]);
                }
                
                if (arreglo[j] < arreglo[min]) {
                    if (pasos) {
                        System.out.println("   Nuevo minimo encontrado: " + arreglo[j] + " en posicion " + j);
                    }
                    min = j;
                } else if (pasos) {
                    System.out.println("   No es menor, se mantiene el minimo actual");
                }
            }
            
            if (min != i) {
                if (pasos) {
                    System.out.println("   " + String.join("", "-".repeat(50)));
                    System.out.println("   Intercambio: " + arreglo[i] + " <-> " + arreglo[min]);
                }
                
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
                cambios++;
                
                if (pasos) {
                    System.out.print("   Estado actual -> ");
                    printArray(arreglo);
                }
            } else if (pasos) {
                System.out.println("   " + String.join("", "-".repeat(50)));
                System.out.println("   No hay intercambio (el elemento ya está en su posicion)");
                System.out.print("   Estado actual -> ");
                printArray(arreglo);
            }
            
            if (pasos) {
                System.out.println("   Elemento " + arreglo[i] + " fijado en la posicion " + i);
            }
        }
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| FIN DEL ALGORITMO DE SELECCION                          |");
            System.out.println("| Comparaciones: " + String.format("%-12d", comparaciones) + "Cambios: " + cambios);
            System.out.println("------------------------------------------------------------");
        }
        
        return new int[] { comparaciones, cambios };
    }
    
    public int[] ordenarDescendente(int[] arreglo, boolean pasos) {
        int comparaciones = 0, cambios = 0;
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| INICIO DEL ALGORITMO DE SELECCION - ORDEN DESCENDENTE    |");
            System.out.println("------------------------------------------------------------");
            System.out.print("| Arreglo original -> ");
            printArray(arreglo);
            System.out.println("------------------------------------------------------------\n");
        }
        
        for (int i = 0; i < arreglo.length - 1; i++) {
            int max = i;
            
            if (pasos) {
                System.out.println("\n>> Pasada " + (i+1) + " - Buscando el elemento mayor a partir de la posicion " + i);
                System.out.println("   " + String.join("", "-".repeat(50)));
                System.out.println("   Elemento actual: " + arreglo[i] + " en posicion " + i);
            }
            
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                
                if (pasos) {
                    System.out.println("   Comparacion " + comparaciones + ": " + arreglo[j] + " con " + arreglo[max]);
                }
                
                if (arreglo[j] > arreglo[max]) {
                    if (pasos) {
                        System.out.println("   Nuevo maximo encontrado: " + arreglo[j] + " en posicion " + j);
                    }
                    max = j;
                } else if (pasos) {
                    System.out.println("   No es mayor, se mantiene el maximo actual");
                }
            }
            
            if (max != i) {
                if (pasos) {
                    System.out.println("   " + String.join("", "-".repeat(50)));
                    System.out.println("   Intercambio: " + arreglo[i] + " <-> " + arreglo[max]);
                }
                
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
                cambios++;
                
                if (pasos) {
                    System.out.print("   Estado actual -> ");
                    printArray(arreglo);
                }
            } else if (pasos) {
                System.out.println("   " + String.join("", "-".repeat(50)));
                System.out.println("   No hay intercambio (el elemento ya está en su posicion)");
                System.out.print("   Estado actual -> ");
                printArray(arreglo);
            }
            
            if (pasos) {
                System.out.println("   Elemento " + arreglo[i] + " fijado en la posicion " + i);
            }
        }
        
        if (pasos) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("| FIN DEL ALGORITMO DE SELECCION                          |");
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