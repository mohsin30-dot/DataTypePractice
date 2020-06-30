import java.util.Random;                       // the program uses a random number generator to simulate the case


public class BooleanType {
    public static void main(String[] args) {

        String name = " ";
        Random r = new Random();  // the random class used to produce random numbers
        boolean male = r.nextBoolean();// the nextBoolean() method returns randomly a boolean value

        if (male) {                    // if keywords works with boolean value
            name = "Johan";
        }
        if (!male) {
            name = "Victoria";
        }
        System.out.println("We will use name: " + name); // output male, true
        System.out.println(false); // output not true, female

        /*
        if the boolean variable male equals to true, we set the name variable to "Johan" & false "Victoria"
         */

    }
}
