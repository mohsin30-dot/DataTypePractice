public class Overflow {
    public static void main(String[] args) {
        byte b = 126;
        int x = 99;

        System.out.println(b);              // this leads to an arithmetic overflow
        b++;

        System.out.println(b);
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
       // when overflow occurs , the variable is reset to negative upper range value.

    }
}


/*
 An arithmetic overflow is a condition that occurs when a calculation produces a result that is greater in magnitude than that which
 a given register or storage location can store or represent.
 */
