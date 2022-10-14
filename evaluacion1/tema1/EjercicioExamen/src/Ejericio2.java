import java.util.Scanner;

public class Ejericio2 {
    public static void main(String[] args) {
        Scanner lecturaTeclado=new Scanner(System.in);
        String nombrePartipante1,nombreParticipante2,nombreParticipante3;
        int numeroJugadores1,numeroJugadores2,numeroJugadores3;
        int presupuesto1,presupuesto2,presupuesto3;
        System.out.println("Introduzca el nombre (grupo 1)");
        nombrePartipante1= lecturaTeclado.next();
        System.out.println("Introduzca el nº de jugadores(grupo 1)");
        numeroJugadores1=lecturaTeclado.nextInt();
        System.out.println("Introduzca el presupuesto(grupo 1)");
        presupuesto1=lecturaTeclado.nextInt();
        System.out.println("Introduzca su nombre(grupo 2)");
        nombreParticipante2= lecturaTeclado.next();
        System.out.println("Introduzca el nº de jugadores(grupo 2)");
        numeroJugadores2= lecturaTeclado.nextInt();
        System.out.println("Introduzca el presupuesto(grupo 2)");
        presupuesto2= lecturaTeclado.nextInt();
        System.out.println("Introduzca el nombre(grupo 3)");
        nombreParticipante3= lecturaTeclado.next();
        System.out.println("Introduzca el nº de jugadores(grupo 3)");
        numeroJugadores3= lecturaTeclado.nextInt();
        System.out.println("Introduzca el presupuesto(grupo 3)");
        presupuesto3= lecturaTeclado.nextInt();
        boolean condicion1=numeroJugadores1==11;
        boolean condicion2=numeroJugadores2%2==0;
        boolean condicion3=presupuesto3>0;
        boolean condicion4=numeroJugadores1==11 && numeroJugadores2==11 && numeroJugadores3==11 && presupuesto1>0 && presupuesto2>0 && presupuesto3>0;
        System.out.printf("1.El primer participante tiene 11 jugadores:%b\n",condicion1);
        System.out.printf("2.El segundo participante tiene jugadores pares:%b\n",condicion2);
        System.out.printf("3.El tercer participante tiene presupuesto positivo:%b\n",condicion3);
        System.out.printf("4.La liga está preparada para empezar:%b\n",condicion4);

    }

}
