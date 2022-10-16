import java.util.Arrays;

public class Main {


    public static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Затраты по дням в месяц");
        System.out.println();

        int[] allPayout = generateRandomArray();
        int allSum = 0;
        int day = 0;
        for (int i = 0; i < allPayout.length; i++) {
            allSum += allPayout[i];
            day++;
            System.out.println(day + "-e: " + allPayout[i] + " рублей");
        }
        System.out.println("Сумма трат за месяц составила " + allSum + " рублей");


        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        int min = allPayout[0];
        for (int i = 0; i < allPayout.length; i++) {
            if (allPayout[i] < min) {
                min = allPayout[i];
            }
        }
        System.out.println("Минимальная выплата за месяц составила " + min + " рублей");
        System.out.println();


        int max = allPayout[0];
        for (int i = 0; i < allPayout.length; i++) {
            if (max < allPayout[i]) {
                max = allPayout[i];
            }
        }
        System.out.println("Максимальная сумма выплат за месяц составила " + max + " рублей");
        System.out.println();

        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        int oneMonth = 30;
        int averagePayout = allSum / oneMonth;
        int total = allSum % oneMonth;
        System.out.println("Средняя сумма выплат за месяц составляет " + averagePayout + "," + total + " рублей");
        System.out.println();

        System.out.println();
        System.out.println("Задача 4");
        System.out.println();

        char[] expandName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i--) {
            System.out.print(expandName[i]);
        }


    }
}






