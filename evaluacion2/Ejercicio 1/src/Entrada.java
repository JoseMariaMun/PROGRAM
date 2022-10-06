public class Entrada {
    //Ámbito de clase.
    public String miNombreClase = "JoseMML";


    //método para ver características de ámbitos
    /*Esto es un comentario que ocupa
    * varias líneas. Estos tipos de comentarios son internos */

    /**
     * Este tipo de comentario se usa para el javadoc
     */
    public void metodoInicial(){
        //TODO este comentario se usa para las tareas
        //tipo_de_la_variable nombre_de_la_variable=valor_variable --> para nombrar una variable
        //String guarda palabras. Tienen que estar entre comillas ""
        //La variable nombre tiene ámbito de bloque o metodo
        String nombre= "Jose";
        System.out.println(nombre);
        System.out.println(miNombreClase);
    }

    public static void main(String[] args) {
        String miNombre="JoseM";
        String nombre="Josee";

        System.out.println(miNombre);
        System.out.println(nombre);


    }
}