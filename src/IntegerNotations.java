public class IntegerNotations {
    public static void main(String[] args) {
        int n1 = 31;                                  // decimal value, its a normal number
        int n2 = 0x31;                                // hexadecimal value, its start with 0x
        int n3 = 031;                                 // octal value, its start with 0
        int n4 = 0b1001;                              // Binary value, its start with ob

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        /*
        Integers are usually primitive data types, computers can practically work only with a subset of integer values, because
        computers have finite capacity, Integers are used to count discrete entities. if a number has ASCII letter like L or l
        suffix , it is type LONG, otherwise it is type Int. the capital letter L is preferred for specifying long numbers, since lowercase
        get confused by number 1. long number we can separate by underscore(_) like 234567890122L , we can write 234_567_890_122L;
        long maximum can go 9223372036854775807, if we deal with even larger numbers , we have to use the java.math.BigInteger class. its is
        used to represent immutable arbitrary precision integers. Arbitrary precision integers are only limited by the amount of computer memory available.
         */



    }
}
