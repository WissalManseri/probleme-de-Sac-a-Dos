import java.util.Arrays;

public class Knapsack {
    
    public static int solve(int[] values, int[] weights, int capacity) {
        int n = values.length;
        int[] ratios = new int[n];
        for (int i = 0; i < n; i++) {
            ratios[i] = values[i] / weights[i];
        }
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (i, j) -> Integer.compare(ratios[j], ratios[i]));
        int totalValue = 0;
        int remainingCapacity = capacity;
        for (int i = 0; i < n && remainingCapacity > 0; i++) {
            int index = indices[i];
            int weight = weights[index];
            int value = values[index];
            if (remainingCapacity >= weight) {
                totalValue += value;
                remainingCapacity -= weight;
            } else {
                totalValue += (int) (value * ((double) remainingCapacity / weight));
                remainingCapacity = 0;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        int[] weights = {2, 3, 5};
        int capacity = 10;
        int maxValue = solve(values, weights, capacity);
        System.out.println("Maximum value: " + maxValue);
    }
}
