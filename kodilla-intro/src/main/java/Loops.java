public class Loops {
    public static void main (String[] args) {
        int silnia = 1;
        for (int i = 1; i <= 3; i++) {
            silnia = silnia * i;
        }
        System.out.println(silnia);


        int r = 0;
        while (r <= 10) {
            System.out.println(r);
            r++;
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfNames = names.length;

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        int[] numbers = new int[] {1,10,20,30,40,50,60};
        int numberOfNumbers = numbers.length;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = numbers[i] + sum;
        }

        System.out.println(sum);
    }


    public int tableNumbers (int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[i] + sum;
        }
        return sum;
    }

}
