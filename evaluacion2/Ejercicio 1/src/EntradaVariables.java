public class EntradaVariables {
    public static void main(String[] args) {
        System.out.println("Tipos de variable");
        //palabras -> String. La palabra siempre va entre comillas ""
        //si no tiene valor es asignado null
        //variable compleja
        String nombre = "Jose";
        String apellido = "Muñoz";
        //letra ->char
        //si no tienen valor es de -1 (el código ascii tiene una letra asignada al valor 0)
        char grupoSang = 'A';
        //variable primitiva
        //números enteros --> int. Es una variable primitiva.Si no le das valor es 0
        int edad = 300;
        //byte, short. Similar al int pero abarca menos números
        //double y float -->Son números con decimales y grandes. Sin valor es 0.0
        //variable primitiva
        double peso = 68.5;
        //verdadero/falso -->true false
        //variable booleana. Si no le doy valor será false
        //variable primitiva
        boolean aprobado = true;

        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(grupoSang);
        System.out.println(edad);
        System.out.println(peso);
        System.out.println(aprobado);

        /* Crear un metodo que se llame saludar y crear variables que guarden con vuestro nombre,
        apellido y edad y salga por consola el saludo:
        "HOLA BORJA MARTIN, TIENES 38 AÑOS Y ESTAS EN LA CLASE DE PROGRAMACIÓN
         */

    }
}