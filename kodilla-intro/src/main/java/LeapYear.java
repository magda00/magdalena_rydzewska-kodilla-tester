public class LeapYear {
    int value;
    boolean isLeap;

    public LeapYear (int value) {
        this.value = value;
    }
    public int getYear() {
        return this.value;
    }
    public void isLeapYear () {
        if ((value%4 == 0) && (value%100 != 0) || (value%4 == 0) && (this.value%100 == 0) && (this.value%400 == 0)) {
            isLeap = true;
            System.out.println("True!");
        }
        else {
            isLeap = false;
            System.out.println("False.");
        }
     }
    }

