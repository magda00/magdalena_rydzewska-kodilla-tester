import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random r = new Random();

        int sum = 0;
        int min = 30;
        int max = 0;

        while (sum < 5000) {
            int temp = r.nextInt(31);
            sum = sum + temp;

            if (temp > max) {
                max = temp;
            }

            if (temp < min) {
                min = temp;
            }
        }

    }

}
