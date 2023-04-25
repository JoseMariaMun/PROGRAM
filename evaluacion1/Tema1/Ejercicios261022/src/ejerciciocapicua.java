import java.util.Scanner;

public class ejerciciocapicua {
    public static void main(String[] args) {
        //capicua();
        // inversos();
        //numeroAmstrong();
        palabraPalindromo();
    }
    public static void capicua(){
        Scanner lecturaTeclado= new Scanner(System.in);
        System.out.println("Introduce número");
        int numeroleido= lecturaTeclado.nextInt();

        if (numeroleido>999&&numeroleido<10000){
            //cuando numero1=numero4 & numero2=numero3
            int numero1=numeroleido/1000;
            int numero2=(numeroleido%1000)/100;
            int numero3=(numeroleido%100)/10;
            int numero4=(numeroleido%10);
            System.out.println(numero3);
            if (numero1==numero4&&numero2==numero3){
                System.out.println("El número es capicúa");
            }else{
                System.out.println("No es capicúa");
            }
        }
    }
    public static void inversos() {
        int numero1 = 20;
        int numero2 = 4;
        int numero3 = 6;
        int numero4 = 7;
        double inverso1=0.0,inverso2=0.0,inverso3=0.0,inverso4=0.0;
        if (condicionNumero(numero1)&&condicionNumero(numero2)&&condicionNumero(numero3)&&condicionNumero(numero4)){
            if(numero1 !=0){
                inverso1=calculoInverso(numero1);
                inverso2=calculoInverso(numero2);
                inverso3=calculoInverso(numero3);
                inverso4=calculoInverso(numero4);
                System.out.printf("La suma de los inversos de %.2f+%.2f+%.2f+%.2f=%.2f\n",inverso1,inverso2,inverso3,inverso4,inverso1+inverso2+inverso3+inverso4);
            }
        }
    }
        private static boolean condicionNumero(int numero){
            return numero>=-100 && numero<100;
        }
        private static double calculoInverso(int numero){
        if(numero!=0){
            return (double)1/numero;
        }else{
            return 0.0;
        }
        }
    public static void numeroAmstrong(){
        int numero=200;
        if(numero>99&&numero<1000){
            int unidades=numero%10;
            int decenas=(numero%100)/10;
            int centenas=numero/100;
            if(Math.pow(unidades,3)+Math.pow(decenas,3)+Math.pow(centenas,3)==(double)numero){
                System.out.println("Es Armstrong");
            }else{
                System.out.println("No es Armstrong");
            }
        }
    }
    public static void ordenarNumeroboolean(){
        int n1=6,n2=2,n3=4;
        int max=0,min=0,interm=0;
        boolean orden=false;
        //false -->menor a mayor
        //true -->mayor a menor
        if(orden){

        }else{
            if(n1>n2 && n1>n3){
                max=n1;
                if(n2>n3){
                    min=n3;
                    interm=n2;
                }
            }else if(n2>n1 && n2>n3){
                

            }

        }
    }
    public static void palabraPalindromo(){
        String palabra="animal";
        String palabrainversa = "";
        palabra.length();//cuantas letras hay
        for (int i=palabra.length()-1;i>=0; i--){
            palabrainversa=palabrainversa+palabra.charAt(i);
        }
        if (palabra.equals(palabrainversa)){
            System.out.println("Palíndromo");
        }

            }
    public static void palabrapalindromo2(){
        String palabra="radar";
        String palabraInversa="";
        boolean palindromo=false;
        for (int i=0<palabra.length()/2, i++){
            char letra= palabra.charAt(i);
            char letraEspejo= palabra.charAt((palabra.length()-1)-i);
            if (letra==letraEspejo){
                palindromo=true;
            }else{
                palindromo=false;
                break;
            }
        }
        if(palindromo){
            System.out.println("Es palíndromo");
        }
    }
    public static void operacionPalabras(){
        String palabra= "Esto es un ejemplo con espacios y acentóós";
        palabra= palabra.replaceAll()
    }
}



