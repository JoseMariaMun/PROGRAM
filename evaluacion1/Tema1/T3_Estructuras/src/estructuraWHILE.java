import java.util.Scanner;

public class estructuraWHILE {
    public static void main(String[] args) {
        //ejerciciowhile();
        ejercicioDoWhile();
    }

    public static void teoriawhile(){


        //mientras se cumpla la concidción ejecuta
        //vuelve a evaluar la condición
        int numero=10;

        while (numero>0) {
            System.out.println("Ejecucion dentro del while");
            numero--;

        }

    }
    public static void ejerciciowhile(){
        //Pedir numeros por consola hasta introducir un negativo
        //Cuando termine el programa me mostrará cuantos números he introducido, cuantos han sido multiplos de 2
        //cuantos han sido impares

        Scanner lecturaTeclado= new Scanner(System.in);
        int numero=0;
        int nveces=0;
        int npar=0;
        int nimpar=0;
        while (numero>=0){
            System.out.println("Introduzca una cifra");
            numero=lecturaTeclado.nextInt();
            nveces++;
            if (numero%2==0){
                npar++;
            }else {
                nimpar++;
            }

        }
        System.out.printf("Se han introducido números %d veces\n",nveces);
        System.out.printf("Han salido %d numeros pares\n",npar);
        System.out.printf("Han salido %d numeros impares\n",nimpar);


    }
    public static void estructuraDoWhile(){
        int numero=9;
        do{
            System.out.println("Ejecución en do while");
            numero++;
        }while (numero<15);
    }
    public static void ejercicioDoWhile(){
        /*Hacer un menu
            1.Sumar
            2.Restar
            3.Multiplicar
            4.Dividir
            5.Salir
            -opcion sumar --> Me pide 2 numeros y me muestra el resultado

         */
        Scanner lecturaTeclado=new Scanner(System.in);
        System.out.println("1.Suma\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
        System.out.println("Escoge una opción [1-5]");
        int menu= lecturaTeclado.nextInt();
        do {
            switch (menu) {
                case 1:
                    System.out.println("Introduzca el primer número a sumar");
                    int suma1 = lecturaTeclado.nextInt();
                    System.out.println("Introduzca el segundo número a sumar");
                    int suma2 = lecturaTeclado.nextInt();
                    int sumatotal = suma1 + suma2;
                    System.out.printf("El resultado de la suma es %d\n", sumatotal);
                    break;
                case 2:
                    System.out.println("Introduzca el primer numero a restar");
                    int resta1 = lecturaTeclado.nextInt();
                    System.out.println("Introduzca el segundo numero a restar");
                    int resta2 = lecturaTeclado.nextInt();
                    int restatotal = resta1 - resta2;
                    System.out.printf("El resultado de la resta es %d\n", restatotal);
                    break;
                case 3:
                    System.out.println("Introduzca el primer numero a multiplicar");
                    int multi1 = lecturaTeclado.nextInt();
                    System.out.println("Introduzca el segundo numero a multiplicar");
                    int multi2 = lecturaTeclado.nextInt();
                    int multiplicacion = multi1 * multi2;
                    System.out.printf("El resultado de la multiplicación es %d\n", multiplicacion);
                    break;
                case 4:
                    System.out.println("Introduzca el primer numero a dividir");
                    double div1 = lecturaTeclado.nextDouble();
                    System.out.println("Introduzca el segundo número a dividir");
                    double div2 = lecturaTeclado.nextDouble();
                    double division = div1 / div2;
                    System.out.printf("El resultado de la división es %.2f\n", division);
                    break;
                case 5:
                    break;
            }
        }while (menu>0 && menu<5);
    }

}
