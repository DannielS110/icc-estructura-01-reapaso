package Controllers;
import java.util.Arrays;
import java.util.Comparator;
import Models.Persona;  

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        // Implementación del algoritmo de ordenación por inserción
        for (int i = 1; i < personas.length; i++) {
            Persona key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getEdad() > key.getEdad()) {
                personas[j + 1] = personas[j];
                j = j - 1;
            }
            personas[j + 1] = key;
        }


    }
       /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
   public Persona buscarPorEdad(Persona[] personas, int edad) {
  int bajo = 0;
  int alto = personas.length - 1;
while(alto >= bajo) {
    // Calcula el índice medio
    int medio = (bajo + alto) / 2;
    if (personas[medio].getEdad() == edad) {
        return personas[medio]; // Retorna la persona encontrada
    } else if (personas[medio].getEdad() < edad) {
        bajo = medio + 1; // Busca en la mitad superior
    } else {
        alto = medio - 1; // Busca en la mitad inferior
    }
}
return null; // Retorna null si no se encuentra la persona 

    }
}

