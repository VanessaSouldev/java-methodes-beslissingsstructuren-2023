public class Main {
    public static void main(String[] args) {

        int number = 0;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        postiveOrZeroOrNegative(number);
        sum(input1, input2);
        bartender(name);
    }
    public static void hello() {

        System.out.println("Hello, world!");
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }

    }

   public static void postiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if  (number == 0) {
            System.out.println("The number is zero!");

        } else {
            System.out.println("This number is -negative");
        }

    }
    public static void bartender(String name) {
        switch (name) {
            case "Kees":
            System.out.println("Kees drinkt graag Bacardi!");
                break;
            case "Henk":
                System.out.println("Henk drinkt graag Whisky!");
                break;
            case "Johnny":
                System.out.println("Johnny drinkt graag cognac!");
                break;
            case "Piet":
                System.out.println("Piet drinkt graag bier");
        }
    }

    private static void sum(int input1, int input2) {

        System.out.println(input1 + " summed up by " + input2 + " = " + (input1 + input2));

    }

}
