import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        String nombre,apellido,sexo;
        int edad;
        double altura,peso;
        Scanner lecturaTeclado=new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        nombre=lecturaTeclado.next();
        System.out.println("Introduzca su apellido");
        apellido=lecturaTeclado.next();
        System.out.println("Introduzca su edad");
        edad= lecturaTeclado.nextInt();
        System.out.println("Introduzca su peso");
        peso= lecturaTeclado.nextDouble();
        System.out.println("Introduzca su altura");
        altura= lecturaTeclado.nextDouble();
        System.out.println("Introduzca su sexo(M/F)");
        sexo=lecturaTeclado.next();
        double IMC=calculoIMC();
        System.out.printf("Hola %s tu IMC teniendo en cuenta tu altura de %.2fcm y tu peso de %dkg, tiene un valor de %.2f\n",nombre,
                altura,peso,IMC);
    }
    public static double calculoIMC(){
        double peso,altura;
        peso;
        altura=1.74;
        double calcularIMC=peso/altura*altura;
        return calcularIMC;
    }
}
