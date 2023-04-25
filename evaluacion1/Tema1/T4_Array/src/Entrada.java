import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        //creacionArrays();
        //accesoArray();
        //ejercicioUnoArrays();
        //ejercicioDosArrays();
        //modificarArray();
        //ejercicioTresArrays();
        //ejercicioCuadradosCubosArray();
        //ejercicioSeisArray();
       //ejercicioSieteArray();
        ejercicioIzqDerecha();
    }

    private static void ejercicioIzqDerecha() {

        int[]lista=new int[]{1,7,6,5,9,10};
        int numeropos1=0,numeropos2=0;
        for (int i = 0; i < lista.length; i++) {
            numeropos2=lista[i+1];
            lista[i+1]=lista[0];
            if(i>0){
                lista[i]=numeropos2;
            }else if(lista[i]==[(lista.length-1)]{
                lista[0]=numeropos2;
            }
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

    }

    private static void ejercicioSeisArray(){
        int[]lista=new int[20];
        int modificaciones=0;
        for (int i = 0; i < lista.length; i++) {
            lista[i]=(int)(Math.random()*31);
            if (lista[i]==6){
                lista[i]=8;
                modificaciones++;
            }else if(lista[i]==7){
                lista[i]=15;
                modificaciones++;
            }else if(lista[i]==20){
                lista[i]=10;
                modificaciones++;
            }
        }
        for (int i = 0; i < lista.length ; i++) {
            System.out.println(lista[i]);

        }
        System.out.println("Modifiaciones: "+modificaciones);
    }
    private static void ejercicioSieteArray(){
        String[]listaPalabras=new String[10];
        for (int i = 0; i < listaPalabras.length ; i++) {
            Scanner lecturaTeclado=new Scanner(System.in);
            System.out.println("Introduzca una palabra");
            String palabra= lecturaTeclado.next();
            listaPalabras[i]=palabra;
        }
    }

    private static void ejercicioCuadradosCubosArray() {
        int[]listaNumeros=new int[20];
        int[]listaCuadrados=new int[20];
        int[]listaCubos=new int[20];
        for (int i = 0; i < 20; i++) {
            listaNumeros[i]=(int)(Math.random()*101);
            listaCuadrados[i]=(int)Math.pow(listaNumeros[i],2);
            listaCubos[i]=(int)Math.pow(listaNumeros[i],3 );

        }
        System.out.println("Numero\t\tCuadrado\t\tCubo");
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\n",listaNumeros[i],listaCuadrados[i],listaCubos[i]);
        }
    }


    private static void ejercicioTresArrays() {
        //Crear una aplicación que me pida cuantos números quiera introducir
        //Introducir el número de números dicho y guardarlos en un array
        //Sacar por consola los números introducidos
        Scanner lecturaTeclado= new Scanner(System.in);
        System.out.println("Cuantos números quieres introducir");
        int cantidadnumeros= lecturaTeclado.nextInt();
        int[] listanumeros=new int[cantidadnumeros];
        for (int i = 0; i < listanumeros.length ; i++){
            System.out.println("Introduce el numero: ");
            listanumeros[i]= lecturaTeclado.nextInt();
            System.out.println(listanumeros[i]);
        }
    }
    

    private static void modificarArray() {
        int[] numeros= new int[10];
        numeros[9]= 10;//Indicas que en la posición 9 vas a guardar el valor 10
        numeros[2]= 3;//En la posicion 2 guardas el valor 3
        for (int item:numeros) {
            System.out.println(item);
        }
    }

    private static void ejercicioDosArrays() {
        //Crear un array con las letras del abecedario
        //Sacar 5 palabras aleatorias de 5 letras
        char[] abecedario=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
                                     't','u','v','w','x','y','z'};
        String palabra1="",palabra2,palabra3,palabra4,palabra5;
        for (char i=0; i<5; i++){
            int aleatorio=(int) Math.random()*abecedario.length;
            char letra=abecedario[aleatorio];

        } /* Al meter el array y el for en un metodo a parte puedes generar palabras sin repetir código.
         */
    }

    private static void ejercicioUnoArrays() {
        //Crea un array de números con los valores que quieras
        //Sacar la media de los numeros
        //Sacar el numero mas grande
        //Sacar el número más pequeño
        //Sacar el sumatorio de todos los numeros
        int sumatorio=0,max=0,min=10000;
        double media=0;
        int[]numeros=new int[]{1,5,3,6,15,8};
        for (int i = 0; i < numeros.length; i++) {
            sumatorio = numeros[i]+sumatorio;

            if (numeros[i] > max) {
                max = numeros[i];
            } else if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        media=(double)sumatorio/(numeros.length);
        System.out.println(media);
        System.out.println(sumatorio);
        System.out.println(max);
        System.out.println(min);

    }

    private static void accesoArray(){
        int[]numeros=new int[10];
        int lecturaPosicion=numeros[0];//Creas una variable y coges del valor del array numeros la primera posicion
        System.out.println(numeros[4]);//Sacas por pantalla la posición del array
        int ultimaPosicion=numeros[numeros.length-1];//Coges la ultima posición del array
        //Para sacar todos los valores de un array se usa un bucle for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    private static void creacionArrays(){
        //array de numeros
        int[] numeros= new int[10]; //creas una lista de 10 int--> 0 0 0 0 0 0 0 0 0 0
        int[]numerosIniciados= new int[]{1,2,3,4,5,6};//lista de 6 int->1,2,3,4,5,6
        boolean[]booleanos= new boolean[5];//lista 5 booleans--> false, false, false, false, false
        String[] palabras= new String[5]; //lista de 5 string-->null null null null null
        String[] palabrasIniciadas= new String[]{"uno","dos","tres","cuatro"};// 4 string --> uno,dos,tres,cuatro
        Object[] elementosGenericos= new Object[]{1,false,"tres",0.3};
        //La clase Object se utiliza para tener varios tipos de clase en un array. Engloba String,int,boolean,...
    }

}
