package lesson1;

public class Main {

    public static void main(String[] args) {
//        printHelloWorld();
//        printHelloWorld();
//        printHelloWorld();
//        printHelloWorld();
//        printHelloWorld();

//        testVars();
        testAppraisal();
    }

    static void printHelloWorld() {
        System.out.println("Hello, world, from method!");
    }

    private static void testVars() {
        int appleCount = 9;
//        appleCount = 9;
        int orangeCount = 5;
        long l = 10000000000000L;
        System.out.println(appleCount + orangeCount);
        System.out.println(appleCount - orangeCount);
        System.out.println(appleCount * orangeCount);
        System.out.println(appleCount / orangeCount);

        float f = 3.0f;
        double doubleOne = 9;
        double doubleTwo = 5.1;
        System.out.println(doubleOne / doubleTwo);

        char ch1 = 'A';
        char ch2 = 20000;

        System.out.println(ch1);
        System.out.println(ch2);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(appleCount % orangeCount);

        appleCount = appleCount + 100;
        appleCount += 100;

        appleCount++;

        appleCount = 9;
        String helloStr = "Hello";
        String worldStr = "world";
        System.out.println(helloStr + ", " + worldStr + "!");
        System.out.println(helloStr + worldStr + appleCount + orangeCount);
        System.out.println(helloStr + worldStr + (appleCount + orangeCount));
    }

    private static void testAppraisal() {
        int appraisal = 6;

        System.out.println("Оценка студента: " + appraisal);

        if (appraisal == 5) {
            System.out.println("Молодец! Так держать!");
        } else if (appraisal == 4) {
            System.out.println("Хорошо, но ты можешь лучше!");
//        } else if (appraisal == 3 || appraisal == 2 || appraisal == 1) {
        } else if (appraisal >= 1 && appraisal <= 3) {
            System.out.println("Готовь уроки лучше!");
//        } else if (appraisal > 1 || appraisal > 5) {
        } else {
            System.out.println("Не мухлюй! Говори правду!");
        }

        System.out.println("Проверка дневника окончена!");
    }
}
