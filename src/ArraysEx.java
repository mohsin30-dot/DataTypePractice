public class ArraysEx {
    public static void main(String[] args) {

        // Arrays is a complex data type which handles a collection of elements, each of the elements can be accessed by index
        // all the elements of an array must be of the same data type

        int[] numbers = new int[5];

        numbers[0] = 3;
        numbers[1] = 1;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 19;

        int len = numbers.length;
         for (int i = 0;i < len; i++) {
             System.out.println(numbers[i]);
         }


    }
}
