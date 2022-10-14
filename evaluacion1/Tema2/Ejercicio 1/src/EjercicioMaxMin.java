public class EjercicioMaxMin {

    public static void main(String[] args) {
        maximosMinimos();
    }
        public static void maximosMinimos() {
            //las variables son int float double short y byte
            byte maxValorByte = Byte.MAX_VALUE;
            byte minValorByte = Byte.MIN_VALUE;
            int maxValorInt = Integer.MAX_VALUE;
            int minValorInt = Integer.MIN_VALUE;
            float maxValorFloat = Float.MAX_VALUE;
            float minValorFloat = Float.MIN_VALUE;
            double maxValorDouble = Double.MAX_VALUE;
            double minValorDouble = Double.MIN_VALUE;
            short maxValorShort = Short.MAX_VALUE;
            short minValorShort = Short.MIN_VALUE;
            long maxValorLong = Long.MAX_VALUE;
            long minValorLong = Long.MIN_VALUE;

            System.out.println("Valor máximo byte= "+maxValorByte);
            System.out.println("Valor mínimo byte= "+minValorByte);
            System.out.println("Valor máximo int= "+maxValorInt);
            System.out.println("Valor mínimo int= "+minValorInt);
            System.out.println("Valor máximo float= "+maxValorFloat);
            System.out.println("Valor mínimo float= "+minValorFloat);
            System.out.println("Valor máximo double= "+maxValorDouble);
            System.out.println("Valor mínimo double= "+minValorDouble);
            System.out.println("Valor máximo short= "+maxValorShort);
            System.out.println("Valor mínimo short="+minValorShort);
            System.out.println("Valor máximo long= "+maxValorLong);
            System.out.println("Valor mínimo long= "+minValorLong);


            System.out.printf("Variable\tMáximo\tMínimo\n");
            System.out.printf("byte\t\t%d\t\t%d\n",maxValorByte,minValorByte);
            System.out.printf("int\t\t%d\t\t%d\n",maxValorInt,minValorInt);
            System.out.printf("float\t\t%f\t\t%f\n",maxValorFloat,minValorFloat);
            System.out.printf("double\t\t%f\t\t%.2f\n",maxValorDouble,minValorDouble);
            System.out.printf("short\t\t%d\t\t%d\n",maxValorShort,minValorShort);
            System.out.printf("long\t\t%d\t\t%d\n",maxValorLong,minValorLong);



        }
    }
