import java.util.Scanner;

public class EjercicioMenus {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("1.Menu 1\n2.Menu 2\n3.Menu 3\n4.Menu 4");
        System.out.println("Introduzca nº de menu a ejecutar[1-4]");
        int menu = lecturaTeclado.nextInt();
        switch (menu) {
            case 1:
                System.out.println("1.Submenú 1\n2.Submenú 2\n3.Submenú 3");
                System.out.println("Que opción del menú desea ejecutar[1-3]");
                int submenu1 = lecturaTeclado.nextInt();
                switch (submenu1) {
                    case 1:
                        System.out.println("SUBMENU 1.1");
                        break;
                    case 2:
                        System.out.println("SUBMENU 1.2");
                        break;
                    case 3:
                        System.out.println("SUBMENU 1.3");
                        break;
                    default:
                        System.out.println("Opción no reconocida");
                }
                break;
            case 2:
                System.out.println("1.Submenú 1\n2.Submenú 2\n3.Submenú 3");
                System.out.println("Que opción del menú desea ejecutar[1-3]");
                int submenu2 = lecturaTeclado.nextInt();
                switch (submenu2) {
                    case 1:
                        System.out.println("SUBMENU 2.1");
                        break;
                    case 2:
                        System.out.println("SUBMENU 2.2");
                        break;
                    case 3:
                        System.out.println("SUBMENU 2.3");
                        break;
                    default:
                        System.out.println("Opción no reconocida");
                }
                break;
            case 3:
                System.out.println("1.Submenú 1\n2.Submenú 2\n3.Submenú 3");
                System.out.println("Que opción del menú desea ejecutar[1-3]");
                int submenu3 = lecturaTeclado.nextInt();
                switch (submenu3) {
                    case 1:
                        System.out.println("SUBMENU 3.1");
                        break;
                    case 2:
                        System.out.println("SUBMENU 3.2");
                        break;
                    case 3:
                        System.out.println("SUBMENU 3.3");
                        break;
                    default:
                        System.out.println("Opción no reconocida");
                }
                break;
            case 4:
                System.out.println("1.Submenú 1\n2.Submenú 2\n3.Submenú 3");
                System.out.println("Que opción del menú desea ejecutar[1-3]");
                int submenu4 = lecturaTeclado.nextInt();
                switch (submenu4) {
                    case 1:
                        System.out.println("SUBMENU 4.1");
                        break;
                    case 2:
                        System.out.println("SUBMENU 4.2");
                        break;
                    case 3:
                        System.out.println("SUBMENU 4.3");
                        break;
                    default:
                        System.out.println("Opción no reconocida");
                }
            default:
                System.out.println("Opción no reconocida");
        }
    }
}