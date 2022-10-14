public class EstructuraSWITCH {
    public static void main(String[] args) {
        eSwitch();
    }
    private static void eSwitch(){
        int numero=12;
        switch(numero){
            case 1://indica que el caso es igual a 1, y ejecuta lo que habrá dentro en caso de que sea cierto
                System.out.println("El numero tiene un valor de 1");
                break;//indica que rompe la ejecucion(despues de mostrar "el numero...1" sale afuera, no sigue al caso 2
            case 2:
                System.out.println("el numero tiene un valor de 2");
                break;
            case 7:
                System.out.println("El numero tiene un valor de 7");
                break;
            default:
                System.out.println("No es ni 1, ni 2, ni 7");
        }
    }

}
