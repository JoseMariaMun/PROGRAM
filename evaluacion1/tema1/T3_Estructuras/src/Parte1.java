import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        //estructuraIF();
        //estructuraIfElse();
        revisarNotas();
    }
    public static void estructuraIF(){
        //IF
        int numero1=10, numero2=20;

        System.out.println("Ejecucion de un if simple");

        if (numero1>0){
         /*Si el numero1 es mayor que 0 ejecuto el contenido de las {}.Si introduces una variable dentro de las {}
         solo está dentro de los mismos.
           */ System.out.println("El numero es positivo");
            numero1++;
        }
        System.out.println("Continuación del programa");
        System.out.println("El valor de numero1 es: "+numero1);

        //que el numero1 este entre 0 y 15 y ademas el numero2 sea par

        if (numero1>0 && numero1<15 && numero2%2==0){

        }
    }
    public static void estructuraIfElse(){
        int numero1=-10, numero2=20;

        System.out.println("Ejecucion de un if simple");

        if (numero1>0){
         /*Si el numero1 es mayor que 0 ejecuto el contenido de las {}.Si introduces una variable dentro de las {}
         solo está dentro de los mismos.
           */ System.out.println("El numero es positivo");
            numero1++;
        }else {
            System.out.println("El numero es negativo");
        }
    }
    public static void estructuraIfElseIF(){
        int numero1=20, numero2=10;
        if(numero1>10){
            System.out.println("El numero es más grande que 10");
        }else if(numero1>=0 && numero1<=10){
            System.out.println("El numero está entre el 0 y 10");

        }else if(numero1<0 && numero1>-10){
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El negativo es un numero menor que -10");
        }
        //numero1 siempre sera >-10

    }
    //pedir por consola una nota
    //si la nota es valida (0-10).Si no lo es nota inválida
    //si es valida dividir entre aprobado5-6.99 , suspenso0-4.99, notable 7-8.99, sobresal9-9.99 matricula 9.99-10
    public static void revisarNotas(){

        double nota;
        Scanner lecturaTeclado=new Scanner(System.in);
        System.out.println("Introduzca su nota");
        nota= lecturaTeclado.nextDouble();
        if (nota>=0 && nota<10){
            System.out.println("La nota no es valida");
        }else if (nota>=0 && nota<5){
            System.out.println("Has suspendido");
        }else if (nota>=5 && nota<7){
            System.out.println("Has aprobado");
        }else if (nota>=7 && nota<9){
            System.out.println("Has sacado un notable");
        }else if (nota>=9 && nota<10){
            System.out.println("Has sacado un sobresaliente");
        }else if (nota == 10){
            System.out.println("Has sacado matrícula de honor");
        }else {
            System.out.println("Escribe la nota adecuadamente");
        }

    }
}
