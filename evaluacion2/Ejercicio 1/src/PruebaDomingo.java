public class PruebaDomingo {
    public static void main(String[] args) {
        realizarSaludo();
        RecetaTortilla();}
        public static void RecetaTortilla() {
            String ingrediente1 = "huevos";
            String ingrediente2 = "patatas";
            int numerohuevos = 6;
            int numeropatatas = 4;
            String comida = "tortilla de patatas";

            System.out.println("La " + comida + " se realiza con " + numerohuevos + " " + ingrediente1 + " y " + numeropatatas + " " + ingrediente2);
        }
            public static void realizarSaludo() {
                String nombre = "Jose María";
                String apellido = "Muñoz";
                int edad = 27;

                System.out.println("Hola eres " + nombre + " " + apellido + ", tienes " + edad + " años y estás en clase de programación");

            }
}
