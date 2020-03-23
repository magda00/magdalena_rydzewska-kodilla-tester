public class FirstClass {
    public static void main(String[] args) {



        //Notebook
        Notebook notebook = new Notebook(600, 1000, 2019);
        printNotebook(notebook);

        Notebook heavyNotebook = new Notebook(2000, 1500, 2005);
        printNotebook(heavyNotebook);

        Notebook oldNotebook = new Notebook(1200, 500, 1999);
        printNotebook(oldNotebook);

        int notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);

        //Year
        LeapYear firstYear = new LeapYear(1999);
        checkYear(firstYear);

         LeapYear secondYear = new LeapYear (2000);
         checkYear(secondYear);

         LeapYear thirdYear = new LeapYear (2001);
          checkYear(thirdYear);

    }

    public static void printNotebook(Notebook ntb) {
        System.out.println(ntb.weight + " " + ntb.price + " " + ntb.year);
        ntb.checkPrice();
        ntb.checkWeight();
        ntb.checkPriceAndYear();
    }


    public static void checkYear(LeapYear yr) {
        System.out.println(yr.value);
        System.out.println("Is a leap year?" + " ");
        yr.isLeapYear();
    }
}
