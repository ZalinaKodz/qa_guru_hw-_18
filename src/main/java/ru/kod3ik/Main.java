package ru.kod3ik;

public class Main {

    public static void main(String[] args) {


        // 1 пункт переполнение
        byte a = 100;
        byte b = 28;
        byte c = a + b;
        System.out.print("Result =" + c);

        int d = Integer.MAX_VALUE;
        System.out.println("Max int: " + d);
        System.out.println("Too much if = " + (d + 1));

        // 2 пункт
        int x = 1;
        int y = 10;

        System.out.println("Addition = "+ (x+y));

        System.out.println("Subtraction = "+ (y-x));

        System.out.println("Multiplication = "+ (x*y));

        System.out.println("Division = "+ (y/x));

        System.out.println("ReminderOfDivision = "+ (x%y));


        boolean n = x > y;
        System.out.println(n);

        boolean m = x < y;
        System.out.println(m);

        if (x==y) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }


        int z = 13;
        if (z!=0 && z<5) {
            System.out.println("Nope");
        } else {
            System.out.println("Yep");
        }

    }
}