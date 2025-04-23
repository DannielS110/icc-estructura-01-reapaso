   package Views;
   import Models.Persona;
   public class ViewConsole {
      public void printPersonArray(Persona[] personas) {
         for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
         }
   
      }
      public void printPersona(Persona persona) {
         System.out.println(persona.toString());
      }
      public void printMessage(String message) {
         System.out.println(message);
      }
   }
