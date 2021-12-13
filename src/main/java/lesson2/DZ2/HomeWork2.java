package lesson2.DZ2;

public class HomeWork2 {
    public static void main(String[] args) {

        boolean a = sumVarsAndReturn(8, 11);
        System.out.println(a);

        numberAndPrint(0);

        boolean b = numberAndReturn(0);
        System.out.println(b);

        String str = "";
        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0) {
                str = "Я обязательно догоню своих одногрупнников! ☻";
             } else {
                str = "Я обязательно догоню своих одногрупнников! ☺";
            }
            System.out.println(str);
        }
        
    }

    public static boolean sumVarsAndReturn(int a, int b) {

        int result = a + b;
        if (result > 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberAndPrint(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean numberAndReturn (int b) {
        if (b >= 0) {
            return true;
        } else {
            return false;
        }
    }
}