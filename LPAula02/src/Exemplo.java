public class Exemplo {
    public static void main(String[] args) {
        System.out.println("Ola Mundo!");

        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);
        ch++;
        System.out.println("ch is now " + ch);
        ch = 90;
        System.out.println("ch is now " + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.56;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBoolean = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println(" Valor do tipoShort = " + tipoShort);
        System.out.println(" Valor do tipoChar = " + tipoChar);
        System.out.println(" Valor do tipoFloat = " + tipoFloat);
        System.out.println(" Valor do tipoDouble = " + tipoDouble);
        System.out.println(" Valor do tipoInt = " + tipoInt);
        System.out.println(" Valor do tipoLong = " + tipoLong);
        System.out.println(" Valor do tipoBoolean = " + tipoBoolean);

        System.out.println("\nPrimeira linha\nSegunda linha");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

        boolean b;
        b = false;
        System.out.println("\nb is " + b);
        b = true;
        System.out.println("b is " + b);

        if (b) System.out.println("This is executed.");
        b = false;
        if (b) System.out.println("This is not executed.");
        System.out.println("10 > 9 is " + (10>9));


        int cout = 10;
        char chr = 'X';
        float f = 1.2F;

        int x = 0, y = 8, z = 19, w = 0;

        System.out.println( x + y + z + w );

        double radius = 4, height = 5;

        double volume = 3.1416 * radius * radius * height;
        System.out.println("\nVolume is " + volume);

        int m;
        m = 10;
        if (m == 10){
            int n = 20;
            System.out.println("m and n: " + m + " " + n);
            m = n * 2;
        }
        //n = 100;
        System.out.println("m is " + m);

        for(int i = 0; i < 3; i++) {
            int j = -1;
            System.out.println("j is: " + j);
            j = 100;
            System.out.println("j is: " + j);

            int iresult, iren;
            double dresult, drew;
            iresult = 10 / 3;
            iren = 10 % 3;
            dresult = 10.0 / 3.0;
            drew = 10.0 % 3.0;
            System.out.println("\nResult and remainder of 10 / 3: " + iresult + " " + iren);
            System.out.println(("Result and remainder of 10.0 / 3.0 " + dresult + " " + drew));
        }

            int i, j;
            boolean b1, b2;
            i = 10;
            j = 11;
            if (i < j) System.out.println("\ni < j");
            if (i <= j) System.out.printf("i <= j");
            if(i != j) System.out.println("i != j");
            if(i == j) System.out.println("This won't execute");
            if(i >= j) System.out.println("This won't execute");
            if(i > j) System.out.println("This won't execute");

            b1 = true;
            b2 = false;
            if(b1 & b2)
                System.out.println("this won't execute");
            if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
            if(b1 | b2) System.out.println("b1 | b2 is true");
            if(b1 ^ b2) System.out.println("b1 ^b2 is true");

            int X = 5;
            int resultado = ++X;
            System.out.println("\nx: " + X);
            System.out.println("resultado: " + resultado);

            X = 5;
            resultado = X++;
        System.out.println("\nx: " + X);
        System.out.println("resultado: " + resultado);

        enum DiaDaSemana {
            SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
        }

        DiaDaSemana dia = DiaDaSemana.QUARTA;

        switch (dia) {
            case SEGUNDA:
            case TERÇA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                System.out.println("Dia de trabalho");
            case SABADO:
            case DOMINGO:
                System.out.println("Final de semana.");

        }
        }
    }
