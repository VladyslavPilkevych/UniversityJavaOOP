public class ArrayOperations {
    public void sumAndAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Average: %.2f\n", average);
    }
}
