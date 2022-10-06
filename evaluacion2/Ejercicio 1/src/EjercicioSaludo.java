public class EjercicioSaludo {
    public static void main(String[] args) {
      realizarSaludo();
        valoresMAxmin();
    }
        public static void realizarSaludo() {
            String nombre = "Jose María";
            String apellido = "Muñoz";
            int edad = 27;

            System.out.println("Hola eres " + nombre + " " + apellido + ", tienes " + edad + " años y estás en clase de programación");
            System.out.print("Hola sin salto"); //el ln es el salto de línea. También puede hacerse con \n
            System.out.println("Hola con salto \n");
            System.out.println("\t Otra linea usando tabulador"); //eso es para tabular
            System.out.printf("Hola soy %s %s y tengo %d años y estoy en la clase de programación/n",nombre,apellido,edad);
            //%s define las variables String y %d la variable int.
            /*Los métodos declaran funcionalidades. Van dentro de la clase y en su interior se escriben las funciones en
            sí mismas. Las funciones no pueden ir dentro de la clase.
             */
            /*Las funciones primitivas no pueden hacer más funcionalidades (por ejemplo char="A")a diferencia de las
            complejas,
             */

        }
        public static void valoresMAxmin(){
        //Obtener los valores máximos y mínimos de cada uno de los tipos
        //las variables son int float double short y byte
            short numeroShort=9000;
            byte numeroByte=9;
            double numeroDouble;
            float numeroFloat;
            int numeroInt=100000;
            long numeroLong=2000000000;


            byte maxValor= Byte.MAX_VALUE;
            byte minValor= Byte.MIN_VALUE;



            //sacar el valor MAX y MIN de todas las variables
            /*formato:          MAX     MIN
                        integer ...     ....*/



        }
}
