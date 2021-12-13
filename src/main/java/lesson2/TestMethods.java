package lesson2;

public class TestMethods {
    public static void main(String[] args) {
        sumVarsAndPrint(3,5);
        sumVarsAndPrint(2,8);
        sumVarsAndPrint(9,11);

        int a = sumVarsAndReturn(9,10);
        System.out.println(a);
    }

    private static void sumVarsAndPrint(int a, int b) {
/*        int a = 3;
        int b = 5;*/
        int result = a + b;
//        System.out.println("Сумма чисел " + a + " и " + b + " равно " + result );
        System.out.printf("Сумма чисел %d и %d равно %d%n", a, b, result);
    }

    static int sumVarsAndReturn(int a, int b) {
        int result = a + b;
        if (result % 2 == 0) {
            result = -1;
        }
        return result;
    }
}
