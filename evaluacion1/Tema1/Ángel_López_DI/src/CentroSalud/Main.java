package CentroSalud;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Centro centro;
        centro = new Centro();
        int opcion = 0;
        Scanner lectura= new Scanner(System.in);

        //Añadir médicos
        centro.addMedico("Dr Nick","Rivera", "001", 001, "traumatología");
        centro.addMedico("Dr Hannibal", "Lecter", "002", 002, "digestivo");
        centro.addMedico("Dr Sam", "Owens", "003", 003, "psiquiatría");
        centro.addMedico("Dr Martín", "Brenner", "004", 004,"general");
        centro.addMedico("Dr Stephen", "Stranger", "005", 005,"cirugía");

        //Menú del centro
        do {
            System.out.println("Elige una opción: ");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Listar médicos");
            System.out.println("3. Listar pacientes");
            System.out.println("0.Salir");
            opcion = lectura.nextInt();;
            switch (opcion){
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = lectura.nextLine();
                    nombre = lectura.nextLine();
                    System.out.println("Apellidos: ");
                    String apellidos = lectura.nextLine();
                    System.out.println("DNI: ");
                    String dni = lectura.nextLine();
                    System.out.println("NSS: ");
                    int NSS = lectura.nextInt();
                    break;
                case 2:
                    centro.visualizarMedicos();
                    break;
                case 3:
                    centro.visualizarPaciente();
                    break;
            }
        }while (opcion != 0);


    }
}
