import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random r = new Random();

        int i = 0;
        int sum = 0;
        int min = 30;
        int max = 0;

        while (sum < 50) {
            int temp = r.nextInt(30);

            sum = sum + temp;
            i++;

            if (temp > max) {
                max = temp;
            }

            if (temp < min) {
                min = temp;
            }
        }

    }

}
