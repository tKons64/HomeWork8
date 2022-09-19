public class Main {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task1_4();
    }

    public static void task1_1() {
        System.out.println();
        System.out.println("Задание №1.1");

        int [] exampleArray1 = new int[]{1, 2, 3};
        double [] exampleArray2 = {1.57, 7.654, 9.986};
        int [] exampleArray3 = new int[10];

    }

    public static void task1_2() {
        System.out.println();
        System.out.println("Задание №1.2");

        int [] exampleArray1 = new int[]{1, 2, 3};
        double [] exampleArray2 = {1.57, 7.654, 9.986};
        int [] exampleArray3 = new int[10];

        for (int i = 0; i < exampleArray1.length; i++) {
            System.out.print(exampleArray1[i]);
            if (i != exampleArray1.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < exampleArray2.length; i++) {
            System.out.print(exampleArray2[i]);
            if (i != exampleArray2.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < exampleArray3.length; i++) {
            System.out.print(exampleArray3[i]);
            if (i != exampleArray3.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task1_3() {
        System.out.println();
        System.out.println("Задание №1.3");

        int [] exampleArray1 = new int[]{1, 2, 3};
        double [] exampleArray2 = {1.57, 7.654, 9.986};
        int [] exampleArray3 = new int[10];

        for (int i = exampleArray1.length-1; i >= 0; i--) {
            System.out.print(exampleArray1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = exampleArray2.length-1; i >= 0; i--) {
            System.out.print(exampleArray2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = exampleArray3.length-1; i >= 0; i--) {
            System.out.print(exampleArray3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task1_4() {
        System.out.println();
        System.out.println("Задание №1.4");

        int [] exampleArray1 = new int[]{1, 2, 3};

        for (int i = 0; i < exampleArray1.length; i++) {
            if (exampleArray1[i] % 2 != 0) {
                exampleArray1[i] = exampleArray1[i] + 1;
            }
            System.out.print(exampleArray1[i]);
            if (i != exampleArray1.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }


}