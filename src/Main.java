public class Main {
    public static void main(String[] args) {
        generateRandomArray();
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000; }
        return arr;

    }

    public static void task1()    {

        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

    }

    public static void task2()    {

        int[] arr = generateRandomArray();
        int minSpending = arr[0];
        int maxSpending = arr[0];
        for (int min : arr) {
            if (min < minSpending) {
                minSpending = min;
            } }
        for (int max : arr) {
            if (max > maxSpending) {
                maxSpending = max;
            } }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей.");

    }

    public static void task3()    {

        int sum = 0;
        int[] arr = generateRandomArray();
            for (int value : arr) {
                sum += value;
                }
        float averageSum = sum / (float)arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");

    }

    public static void task4()    {

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);
        }

    }

}