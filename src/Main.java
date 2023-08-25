import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] monthSalaries = generateRandomArray();
        int total = 0;
        for (int i = 0; i < monthSalaries.length; i++) {
            total += monthSalaries[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] monthSalaries = generateRandomArray();
        int maxSalary = 0;
        int minSalary = 1000000;
        for (int daySalary : monthSalaries) {
            if (daySalary > maxSalary) {
                maxSalary = daySalary;
            }
        }
        for (int daySalary : monthSalaries) {
            if (daySalary < minSalary) {
                minSalary = daySalary;
            }
        }


        System.out.println("Минимальная сумма трат за день составила " + minSalary + " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] monthSalaries = generateRandomArray();
        double middleNum = 0;
        for (int daySalary : monthSalaries) {
            middleNum = middleNum + daySalary;
        }
        middleNum = middleNum / monthSalaries.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleNum + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length-1; index > -1; index--) {
            System.out.print(reverseFullName[index]);
        }
    }
}