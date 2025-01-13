public class RandomValues {
	 public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generate a 4-digit random number (between 1000 and 9999)
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return randomNumbers;
    }

    // Method to find average, min, and max values of an array
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the average
        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomValues rv = new RandomValues();

        // Generate 5 4-digit random numbers
        int[] randomNumbers = rv.generate4DigitRandomArray(5);
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }
        double[] results = rv.findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}