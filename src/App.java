import Models.Persona;
import Controllers.PersonaController;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear el arreglo de personas
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 22),
            new Persona("Pedro", 29),
            new Persona("Elena", 31)
        };

        // 0. Instanciar clases necesarias
        PersonaController personaController = new PersonaController();
        ViewConsole vc = new ViewConsole();

        // 1. Imprimir el arreglo original
        vc.printMessage("Arreglo de personas:");
        vc.printPersonArray(personas);

        // 2. Ordenar el arreglo por edad (ascendente) y mostrarlo
        vc.printMessage("Arreglo de personas ordenado por edad (inserción ascendente):");
        personaController.ordenarPorEdad(personas);
        vc.printPersonArray(personas);

        // 3. Buscar persona con edad 40
        vc.printMessage("Buscando persona con edad 40:");
        Persona encontrada =    personaController.buscarPorEdad(personas, 40);
        // Persona encontrada = personaController.buscarPorEdad(personas, 40);  
        if (encontrada != null) {
            vc.printMessage("Persona encontrada:");
            vc.printPersona(encontrada);
        } else {
            vc.printMessage("No se encontró ninguna persona con edad 40.");
        }

        // 4. Buscar persona con edad 99
        vc.printMessage("Buscando persona con edad 99:");
        Persona noEncontrada = personaController.buscarPorEdad(personas, 99);
        if (noEncontrada != null) {
            vc.printMessage("Persona encontrada:");
            vc.printPersona(noEncontrada);
        } else {
            vc.printMessage("No se encontró ninguna persona con edad 99.");

        }
        
    }
}
