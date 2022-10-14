public class EjercicioMetodos {
    public static void main(String[] args) {
        System.out.printf("El resultado de la suma es %d\n",metodoSuma());
        System.out.printf("El resultado de la resta es %d\n",metodoResta());
        System.out.printf("El resultado de la multiplicación es %d\n",metodoMult());
        System.out.printf("El resultado de la división es %d\n",metodoDiv());
        System.out.printf("El resultado del resto es %d\n",metodoResto());
        System.out.printf("El resultado es: %d\n",SumaParametros(1, 3));
        System.out.printf("El resultado es: %d\n",RestaParametros(10,7));

    }

    public static int metodoSuma(){
        int numeroUno=5, numeroDos=6;
        int resultado= numeroUno+numeroDos;
        return resultado; /*es más eficiente no meter la variable resultado y realizar la operación directamente en el
                           return (return numeroUno+numeroDos;*/
    }
    public static int metodoResta(){
        int numeroUno=7,numeroDos=5;
        int resultado=numeroUno-numeroDos;
        return resultado;
    }
    public static int metodoMult(){
        int numeroUno=3, numeroDos=7;
        int resultado=numeroUno*numeroDos;
        return resultado;
    }
    public static int metodoDiv(){
        int numeroUno=6, numeroDos=2;
        int resultado=numeroUno/numeroDos;
        return resultado;
    }
    public static int metodoResto(){
        int numeroUno=5, numeroDos=3;
        int resultado=numeroUno%numeroDos;
        return resultado;
    }
    public static int SumaParametros(int numero1, int numero2){
        return numero1+numero2;
    }
    public static int RestaParametros(int numero1, int numero2){
        return numero1-numero2;
    }
}
