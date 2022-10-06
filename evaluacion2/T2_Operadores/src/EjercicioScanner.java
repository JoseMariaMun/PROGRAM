import java.util.Scanner;

public class EjercicioScanner {
    //realizar las operaciones matemáticas,donde se pida por teclado los operandos que necesito(en cada operación)
    /*saludar() recibe por parametros nombre apellidos y edad. El sistema deberá decir introduce tu nombre, introduce
    apellido, introduce tu edad.
     Bienvenido a clase de programación, lo datos pasados son
     Nombre: XX
     Apellido: XX
     Edad: XX
     */

    public static void main(String[] args) {
        sumaScanner();
        restaScanner();
        multScanner();
        divScanner();
        restoScanner();
        saludo();
    }

    public static void sumaScanner() {
        Scanner lectura1 = new Scanner(System.in);
        System.out.println("Introduzca el primer número para sumar");
        int numero1 = lectura1.nextInt();
        Scanner lectura2 = new Scanner(System.in);
        System.out.println("Introduzca el segundo número");
        int numero2 = lectura2.nextInt();
        int suma = numero1 + numero2;
        System.out.printf("El resultado es %d\n", suma);
    }
    public static void restaScanner(){
        Scanner lectura1=new Scanner(System.in);
        System.out.println("Introduzca el primer número para restar");
        int numero1= lectura1.nextInt();
        Scanner lectura2=new Scanner(System.in);
        System.out.println("Introduzca el segundo número");
        int numero2= lectura2.nextInt();
        int resta= numero1-numero2;
        System.out.printf("El resultado es %d\n", resta);
    }
    public static void multScanner(){
        Scanner lectura1=new Scanner(System.in);
        System.out.println("Introduzca el primer número para multiplicar");
        int numero1= lectura1.nextInt();
        Scanner lectura2=new Scanner(System.in);
        System.out.println("Introduzca el segundo número");
        int numero2=lectura2.nextInt();
        int multi=numero1*numero2;
        System.out.printf("El resultado es %d\n", multi);
    }
    public static void divScanner(){
        Scanner lecturadiv1= new Scanner(System.in);
        System.out.println("Introduzca el primer numero para dividir");
        int div1=lecturadiv1.nextInt();
        Scanner lecturadiv2= new Scanner(System.in);
        System.out.println("Introduzca el segundo número");
        int div2=lecturadiv2.nextInt();
        int division=div1/div2;
        System.out.printf("El resultado es %d\n",division);
    }
    public static void restoScanner(){
        Scanner lecturaresto1=new Scanner(System.in);
        System.out.println("Introduzca el primer número para calcular el resto");
        int resto1=lecturaresto1.nextInt();
        Scanner lecturaresto2=new Scanner(System.in);
        System.out.println("Introduzca el segundo número");
        int resto2=lecturaresto2.nextInt();
        int resto=resto1%resto2;
        System.out.printf("El resultado es %d\n",resto);
    }
    public static void saludo(){
        Scanner lecturanombre=new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre=lecturanombre.next();
        Scanner lecturaapellido= new Scanner(System.in);
        System.out.println("Introduzca su apellido");
        String apellido=lecturaapellido.next();
        Scanner lecturaedad= new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edad=lecturaedad.nextInt();
        System.out.printf("Bienvenido a la clase de programación, los datos guardados son:\n");
        System.out.printf("Nombre:%s\n",nombre);
        System.out.printf("Apellido:%s\n",apellido);
        System.out.printf("Edad:%s\n",edad);

    }
}


