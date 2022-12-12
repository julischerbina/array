public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        for (int n = (numbers.length - 1); n >= 0; n--) {
            numbers[n] = n+1;
            if (numbers[n] % 2 != 0) {
                numbers[n] = numbers[n] + 1;
            }
            if (n > 0) {
                System.out.print(numbers[n] + ", ");
            } else {
                System.out.println(numbers[n]);
            }
        }
        double[] numbersTwo = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbersTwo.length; i++) {
            if (i < numbersTwo.length - 1) {
                System.out.print(numbersTwo[i] + ", ");
            } else {
                System.out.println(numbersTwo[i]);
            }
        }
        String[] seasons = new String[4];
        seasons[0] = "winter";
        seasons[1] = "spring";
        seasons[2] = "summer";
        seasons[3] = "autumn";
        for (int y = 0; y < seasons.length; y++) {
            if (y < (seasons.length - 1)) {
                System.out.print(seasons[y] + ", ");
            } else {
                System.out.println(seasons[y]);
            }
        }
    }
}
