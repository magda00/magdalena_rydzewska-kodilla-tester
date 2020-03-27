public class UserLoops {
    public static class User {
        String name;
        int age;

        public User(String n, int a) {
            this.name = n;
            this.age = a;
        }
    }

    public static void main(String[] args) {
        User kate = new User("Kate", 23);
        User madeleine = new User("Madeleine", 27);
        User john = new User("John", 35);
        User michael = new User("Michael", 40);
        User peter = new User("Peter", 18);

        User[] users = {kate, madeleine, john, michael, peter};

        int sum = 0;
        int average;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        average = sum / users.length;

        System.out.println(average);

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }
    }
}
