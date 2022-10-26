import java.util.Scanner;

public class EjercicioFOR {
    public static void main(String[] args) {
        //Realizar un programa que pida por consola el nº de veces que tengo que introducir datos
        //Según el nº de veces indicado pedira tantos numeros como se indique
        //La captura del nº será con el siguiente mensaje
        //"Introduce el valor de la posicion 1: "-->Introduzco
        //"Introduce el valor de la posicion 2: "-->Introduzco
        //"Introduce el valor de la posicion 3: "-->Introduzco
        //"Introduce el valor de la posicion 4: "-->Introduzco
        //ejercicio();
        //ejercicio2();
        //ejercicio3();
        ejercicioAleatorios();
    }
    public static void ejercicio(){
        Scanner lecturaTeclado= new Scanner(System.in);
        System.out.println("Introduzca cuantos valores hay que meter");
        int nveces= lecturaTeclado.nextInt();
        int sumatorio=0;
        for (int i=0;i<nveces;i++){
            System.out.printf("Introduzca el valor de la posicion %d:\n",i+1);
            int valorposicion= lecturaTeclado.nextInt();
            sumatorio +=valorposicion;
        }
        System.out.println("La suma de todos es "+sumatorio);
        double media= (double) sumatorio/nveces;
        System.out.println("La media es "+media);

    }
    public static void ejercicio2(){
        Scanner lecturaTeclado= new Scanner(System.in);
        //De que número quieres sacar la tabla:
        //mostrar la tabla
        System.out.println("Elige el número sobre el que sacar la tabla");
        int ntabla= lecturaTeclado.nextInt();//7
        int calctabla=0;
        for (int i=0;i<10;i++){
            calctabla+=ntabla;
            System.out.printf("%dx%d=%d\n",ntabla,i+1,calctabla);

        }
    }
    public static void ejercicio3() {
        for (int i = 0; i < 11; i++) {
            System.out.println("Tabla del "+i);
            for (int j = 0; j <=10; j++) {
                System.out.printf("\t%dx%d=%d\n", i, j, i*j);

            }

        }
    }
    public static void numerosAleatorios(){
        Math.random(); //devuelve un número entre 0 y 1. Llega desde 0 hasta 0.9999999999
        for (int i=0;i<100;i++){
            System.out.println((Math.random()*11)+50); /*Esto indica que genera números aleatorios desde el 50 al 60.
                                                        Se multiplica por 11 porque no llegaría al 60*/

            int aleatorio= (int)(Math.random()*11);//Es la sintaxis para convertir el resultado en entero.Cuidado
        }
    }
    public static void ejercicioAleatorios(){
        /*Crear un programa que pida por consola rango mínimos y máximos
        El MIN debe ser más pequeño que el grande, sino aviso y para
        Que genere N aleatorios
        Obtener suma y media de los aleatorios, el max generado y el min generado
         */
        Scanner lecturaTeclado= new Scanner(System.in);
        System.out.println("Introduzca el rango mínimo");
        int rminimo= lecturaTeclado.nextInt();
        System.out.println("Introduzca el rango máximo");
        int rmaximo= lecturaTeclado.nextInt();
        int numeroNumeros=rmaximo-rminimo;
        int sumatorioAleatorio=0;
        int repeticiones = (int)(Math.random()*16)+5;
        double media= 0.0;
        if (rminimo<rmaximo) {
            for (int i = 0; i < repeticiones ; i++) {
                int aleatorio= (int)(Math.random()*(numeroNumeros+1)+rminimo);
                sumatorioAleatorio +=aleatorio;
                double mediaAleatorio= (double) sumatorioAleatorio/repeticiones;
            }
        }else
            System.out.println("El orden de los números es erróneo");

    }

}
