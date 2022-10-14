import java.util.Scanner;

public class Teoria {
    public static void main(String[] args) {
    //operarAritmeticos();
    //operadoresAsignacion();
    //operadoresRelacionales();
    //operadoresLogicos();
      //metodoConRetorno();
     //metodoconParametros("jose",10);
        Scanner lecturaTeclado=new Scanner(System.in);
        System.out.println("Introduzca el número");
        int numeroLeido= lecturaTeclado.nextInt();
        System.out.println("El numero leído es: "+numeroLeido);

    }


    public static void operarAritmeticos() {

        int numeroUno= 0;
    //monarios
    // ++ incremento en 1 a la variable que se aplique
    // -- decremento en 1 a la variable que se aplique
    // - cambio de signo
        numeroUno++; //1
        numeroUno++; //2
        numeroUno++; //3
        numeroUno++; //4
        System.out.println("El valor del número es: "+numeroUno);
        numeroUno--; //3
        numeroUno--; //2
        System.out.println("El valor del número es: "+numeroUno);

        //binarios
        numeroUno=5;
        int numeroDos= 10;
        //suma--> +
        int suma= numeroUno+numeroDos;
         System.out.printf("la suma entre %d y %d es %d\n",numeroUno,numeroDos,suma);
         //la variable suma puede sustituirses por numeroUno+numeroDos. "la suma entre 5 y 10 es 15"

        //resta-->  -
        int resta=numeroUno-numeroDos;
        System.out.printf("la resta entre %d y %d es %d\n",numeroUno,numeroDos,resta);//es -5
        System.out.printf("la suma entre %d y %d es %d\n",numeroUno,numeroDos,-resta);//es 5. Cambiar de signo con -

        //multiplicación--> *

        int multiplicacion=numeroUno*numeroDos;
        System.out.printf("la multiplicación entre %d y %d es %d\n",numeroUno,numeroDos,multiplicacion);

        //división --> /
        //En Java la division de números enteros da como resultado un número entero, e igual entre decimales.
        //Si tenemos una division de enteros que da un decimal saldrá por pantalla el número entero.
        //Para cambiarlo tenemos que asignar (float) o (double) en la función.


        float division=(float)numeroUno/(float)numeroDos;
        System.out.printf("la división entre %d y %d es %.2f\n",numeroUno,numeroDos,division);

        //resto o módulo --> %
        //es muy útil para ver si es par o impar

        float modulo=numeroUno%numeroDos;
        System.out.printf("El resto entre %d y %d es %f\n",numeroUno,numeroDos,modulo);
    }
    public static void operadoresAsignacion(){
        //asignacion =
        int numeroUno=10, numeroDos=20;

        //+=
        numeroUno += numeroDos; // numeroUno= numeroUno(10)+numeroDos(20)= 30
        System.out.printf("El valor de numeroUno es %d\n",numeroUno);
        //-=
        numeroUno -=6; // numeroUno =30-6 // numeroUno=24
        System.out.printf("El valor de n1 es %d\n",numeroUno);
        //*=
        numeroUno *=numeroDos; //numeroUno=24*20=480
        System.out.printf("El valor de n1 es %d\n",numeroUno);
        // /=
        numeroUno /=2; // numeroUno=480/2=240
        System.out.printf("El valor de n1 es %d\n",numeroUno);
        numeroUno %=2; // sacar el resto de 240/2. Debería ser 0
        System.out.printf("El valor de n1 es %d\n",numeroUno);




    }
    public static void operadoresRelacionales(){
        /*Marcan la relación entre dos o más variables -->Su resultado es true o false (o se cumple la
        comparación o no se cumple*/
        int numeroUno=10, numeroDos=9;
        boolean resultado; /*todas las variables primitidas tienen asignado el valor menos lesivo.
                            En el caso del booleano por defecto sera falso*/
       // n1>n2--> ¿El n1 es más grande que el n2?
        resultado=numeroUno>numeroDos;
        System.out.printf("El resultado de comparar (>) %d con el %d es %b\n",numeroUno,numeroDos,resultado);

        //>=
        numeroUno=20;
        numeroDos=25;
        resultado=numeroUno>=numeroDos;
        System.out.printf("El resultado de comparar (>=) %d con el %d es %b\n",numeroUno,numeroDos,resultado);
        //<
        numeroUno=10;
        numeroDos=5;
        resultado=numeroUno<numeroDos;
        System.out.printf("El resultado de comparar (<) %d con el %d es %b\n",numeroUno,numeroDos,resultado);
        //<=
        numeroUno=10;
        numeroDos=10;
        resultado=numeroUno<=numeroDos;
        System.out.printf("El resultado de comparar (<=) %d con el %d es %b\n",numeroUno,numeroDos,resultado);
        // == es para ver si dos números son iguales
        numeroUno=10;
        numeroDos=5;
        resultado=numeroUno==numeroDos;
        System.out.printf("El resultado de comparar (==) %d con el %d es %b\n",numeroUno,numeroDos,resultado);
        // != es para ver si dos números son diferentes
        numeroUno=15;
        numeroDos=32;
        resultado=numeroUno!=numeroDos;
        System.out.printf("Es diferente (!=) el  %d con el %d es %b\n",numeroUno,numeroDos,resultado);
        // ! cambio de relación
        numeroUno=7;
        numeroDos=10;
        resultado = !(numeroUno>numeroDos); //7<10-->!(true)-->false. Cambia la relación del resultado
        System.out.printf("El resultado de comparar (!) %d con el %d es %b\n", numeroUno, numeroDos, resultado);
    }
    public static void operadoresLogicos(){
        /*Hay dos tipos: &&AND y ||OR. Su resultado es true o false. En el caso de &&AND es true cuando todos
        operadores son true, en los demas casos son false. En el caso de ||OR es true cuando uno de los
        operadores es true. Ejemplo: n1=2, n2=4,n3=19
        */
        //&& --> cuando es verdadera: cuando todas son verdaderas, en caso contrario false
        /* || --> cuando una es verdadera: cuando hay una verdadera el caso es verdadero, solo es falso cuando
        todas son falsas
         */
        int numeroUno= 10, numeroDos= 6, numeroTres=3;
        boolean acierto=false, resultado; //resultado=false
        String nombre; //las variables no primitivas se inicializan a null

        resultado=(numeroDos<6) || (numeroTres!=numeroUno) || (numeroUno>10);
        //          F                       V                   F               =V

        System.out.printf("El resultado de la sentencia lógica es %b\n",resultado);

        resultado=numeroUno>0 && numeroTres<numeroDos && !acierto;
        //             V            V                       V       =V

        System.out.printf("El resultado de la sentencia lógica es %b\n",resultado);


    }
        //mod_acceso (public, protected,private)
        //static
        //void --> retorno vacío: sólo ejecuta lo que está definido dentro
        /*int,double,String,float,cualquier_tipo -->retorno tipo: se ejecuta todo lo que hay en el metodo y al final da
        un resultado
         */
        //si tiene retorno, la última palabra del método es return
    public static void metodoSinRetorno(){
        System.out.println("Esto es un método que no tiene retorno");
        System.out.println("Sólo tiene ejecuciones");
    }
    public static int metodoConRetorno(){
        System.out.println("Este es un método con retorno");
        System.out.println("y en concreto retornas un número");
        return 10;
    }
    public static void metodoSinParametros(){
        // tipo nombreTemporal, tipo2 nombreTemporal2
    }
    public static void metodoconParametros(String nombre, int numero){
        System.out.printf("El nombre pasado es %s\n",nombre);
        System.out.printf("El numero pasado es %d\n",numero);

    }
    //Scanner -->tipo de variable compleja
    //Tipo nombre= new Tipo () --> String nombre= new String("hola")
    }

    //realizar las operaciones matemáticas,donde se pida por teclado los operandos que necesito(en cada operación)
    /*saludar() recibe por parametros nombre apellidos y edad. El sistema deberá decir introduce tu nombre, introduce
    apellido, introduce tu edad.
     Bienvenido a clase de programación, lo datos pasados son
     Nombre: XX
     Apellido: XX
     Edad: XX
     */

