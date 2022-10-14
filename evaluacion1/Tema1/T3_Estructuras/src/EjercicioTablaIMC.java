import java.util.Scanner;

public class EjercicioTablaIMC {
    public static void main(String[] args) {
        calcularIMC();

        /*IMC    Estado HOMBRES
Por debajo de 18.5    Bajo peso
18,5–24,9    Peso normal
25.0–29.9    Pre-obesidad o Sobrepeso
30.0–34.9    Obesidad clase I
35,0–39,9    Obesidad clase II
Por encima de 40    Obesidad clase III


IMC    Estado MUJERES
Por debajo de 16.5    Bajo peso
16,5–22,9    Peso normal
23.0–25.9    Pre-obesidad o Sobrepeso
26.0–30.9    Obesidad clase I
31,0–33,9    Obesidad clase II
Por encima de 34    Obesidad clase III*/
    }
        public static void calcularIMC(){
            Scanner lecturaTeclado=new Scanner(System.in);
            System.out.printf("Introduzca su peso\n");
            double peso= lecturaTeclado.nextDouble();
            System.out.printf("Introduzca su altura\n");
            double altura= lecturaTeclado.nextDouble();
            double IMC=peso/(altura*altura);
            System.out.println("Introduzca su género(H/M)");
            char genero=lecturaTeclado.next().charAt(0);
            System.out.printf("Su índice IMC es %.2f\n",IMC);
            if (genero=='H'){
                if (IMC<18.5){
                    System.out.println("Su peso es bajo");
                }else if (IMC<25){
                    System.out.println("Su peso es normal");
                }else if (IMC<30){
                    System.out.println("Su estado es de pre-obesidad");
                }else if (IMC<35){
                    System.out.println("Su estado es de obesidad clase I");
                }else if (IMC<40){
                    System.out.println("Su estado es de obesidad clase II");
                }else if (IMC>=40){
                    System.out.println("Su estado es de obesidad clase III");
                }
            }else if (genero=='M'){
                if (IMC < 16.5) {
                    System.out.println("Su peso es bajo");
                }else if(IMC<23){
                    System.out.println("Su peso es normal");
                }else if(IMC<26){
                    System.out.println("Su estado es de pre-obesidad");
                }else if(IMC<31){
                    System.out.println("Su estado es de obesidad clase I");
                }else if(IMC<34){
                    System.out.println("Su estado es de obesidad clase II");
                }else if(IMC>=35){
                    System.out.println("Su estado es de obesidad clase III");
                }
            }
            //lo mismo que antes usando la variable switch
            switch (genero){
                case 'H':
                    if (IMC<18.5){
                        System.out.println("Su peso es bajo");
                    }else if (IMC<25){
                        System.out.println("Su peso es normal");
                    }else if (IMC<30){
                        System.out.println("Su estado es de pre-obesidad");
                    }else if (IMC<35){
                        System.out.println("Su estado es de obesidad clase I");
                    }else if (IMC<40){
                        System.out.println("Su estado es de obesidad clase II");
                    }else if (IMC>=40){
                        System.out.println("Su estado es de obesidad clase III");
                    }break;
                case 'M':
                    if (IMC < 16.5) {
                        System.out.println("Su peso es bajo");
                    }else if(IMC<23){
                        System.out.println("Su peso es normal");
                    }else if(IMC<26){
                        System.out.println("Su estado es de pre-obesidad");
                    }else if(IMC<31){
                        System.out.println("Su estado es de obesidad clase I");
                    }else if(IMC<34){
                        System.out.println("Su estado es de obesidad clase II");
                    }else if(IMC>=35){
                        System.out.println("Su estado es de obesidad clase III");
                    }



            }
            }





}
