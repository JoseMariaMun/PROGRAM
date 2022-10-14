import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        calculoCoche();
    }
    public static void calculoCoche(){
        Scanner lecturaTeclado=new Scanner(System.in);
        System.out.println("¿Cuál es el precio del coche?");
        int precio= lecturaTeclado.nextInt();
        System.out.println("¿En cuantos plazos lo va a pagar?");
        int plazos= lecturaTeclado.nextInt();
        int precioplazos=precio/plazos;
        System.out.printf("Vas a pagar el coche de %d euros en %d meses, con un total de %d euros cada plazo\n",precio,plazos,precioplazos);
        double interes=precio*0.035;
        double interes2=(precio-precioplazos)*0.035*2;
        double interes3=(precio-2*precioplazos)*0.035*3;
        double interes4=(precio-3*precioplazos)*0.035*4;
        double interes5=(precio-4*precioplazos)*0.035*5;
        double interes6=(precio-5*precioplazos)*0.035*6;
        System.out.printf("El interés pagado(3.5) en el primer mes es de %.2f\n",interes);
        System.out.printf("El interés pagado(7) en el segundo mes es de %.2f\n",interes2);
        System.out.printf("El interés pagado(10.5) en el tercer mes es de %.2f\n",interes3);
        System.out.printf("El interés pagado(14) en el cuarto mes es de %.2f\n",interes4);
        System.out.printf("El interés pagado(17.5) en el quinto mes es de %.2f\n",interes5);
        System.out.printf("El interés pagado(21) en el sexto mes es de %.2f\n",interes6);
    }

}
